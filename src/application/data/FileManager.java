package application.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class FileManager {

	String exportPath = "./subjects";

	public FileManager() {

	}

	/**
	 * Save SubjectObject to csv
	 * 
	 * @param sub
	 * @param path
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public void saveSubjectObjectToCSV(SubjectObject sub, String subjectName) throws IOException {
		if (sub == null || subjectName == null || subjectName.isEmpty()) {
			throw new IllegalArgumentException();
		}
		new File(exportPath).mkdir();
		File f = new File(exportPath, subjectName+".csv");
		Files.deleteIfExists(f.toPath());
		FileWriter file = new FileWriter(f);
		
		file.append("VocabQuestion");
		file.append(",");
		file.append("VocabString");
		file.append(",");
		file.append("Level");
		file.append("\n");

		for (VocabObject vocab : sub.getVocabList()) {
			file.append(vocab.getQuestion());
			file.append(",");
			file.append(vocab.getVocab());
			file.append(",");
			file.append(vocab.getLevel() + "");
			file.append("\n");
		}
		file.flush();
		file.close();
	}

	/**
	 * Save SubjectManager to csv
	 * 
	 * @param subManager
	 * @throws IOException
	 */
	public void saveSubjectManagerToCSV(SubjectManager subManager) throws IOException {
		if (subManager == null) {
			throw new IllegalArgumentException();
		}
		FileWriter file = new FileWriter("subjects.csv");

		file.append("SubjectName");
		file.append("\n");

		for (SubjectObject subject : subManager.getSubjectList()) {
			file.append(subject.getName());
			file.append("\n");
		}

		file.flush();
		file.close();
	}

	/**
	 * Loads subject from csv
	 * 
	 * @param path
	 * @param filename
	 * @return
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 */
	public SubjectObject loadSubjectObjectFromCSV(String subjectName) throws IOException, NoSuchAlgorithmException {
		if (subjectName == null || subjectName.isEmpty()) {
			throw new IllegalArgumentException();
		}
		SubjectObject sub = new SubjectObject(subjectName.split("\\.")[0]);

		BufferedReader csvReader = new BufferedReader(new FileReader(new File(exportPath, subjectName + ".csv")));
		String row;
		while ((row = csvReader.readLine()) != null) {
			String[] data = row.split(",");
			if (!(data[0].equalsIgnoreCase("vocabquestion") && data[2].equalsIgnoreCase("level"))) {
				VocabObject curr = sub.createVocab(data[1], data[0]);
				curr.setLevel(Short.valueOf(data[2].replaceAll(" ", "")));
			}
		}
		csvReader.close();
		return sub;
	}

	/**
	 * Loads all subjects from csv
	 * 
	 * @param subjectList
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws IOException
	 */
	public ArrayList<SubjectObject> loadAllSubjectObjectsFromCSV(ArrayList<SubjectObject> subjectList)
			throws NoSuchAlgorithmException, IOException {
		if (subjectList == null) {
			throw new IllegalArgumentException();
		}
		ArrayList<SubjectObject> temp = new ArrayList<SubjectObject>();
		
		for (SubjectObject sub : subjectList) {
			temp.add(loadSubjectObjectFromCSV(sub.getName()));
		}
		subjectList = temp;
		return subjectList;
	}

	/**
	 * Loads SubjectManager from csv
	 * 
	 * @return
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 */
	public SubjectManager loadSubjectManagerFromCSV(SubjectManager manager)
			throws IOException, NoSuchAlgorithmException {
		if (manager == null) {
			throw new IllegalArgumentException();
		}

		try {
			BufferedReader csvReader = new BufferedReader(new FileReader("subjects.csv"));
			String row;
			while ((row = csvReader.readLine()) != null) {
				String[] data = row.split(",");
				if (!(data[0].equalsIgnoreCase("SubjectName")) && !data[0].isEmpty()) {
					manager.createSubject(data[0]);
				}
			}
			csvReader.close();
		} catch (FileNotFoundException e) {

		} catch (Exception e) {
			throw e;
		}

		return manager;
	}

}
