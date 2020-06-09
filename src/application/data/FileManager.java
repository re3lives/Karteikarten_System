package application.data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

	String path = "";

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
	public void saveSubjectObjectToCSV(SubjectObject sub, String path, String filename) throws IOException {
		FileWriter file = new FileWriter(new File(path, filename));

		file.append("VocabString");
		file.append(",");
		file.append("Level");
		file.append("\n");

		for (VocabObject vocab : sub.getVocabList()) {
			file.append(vocab.getVocab());
			file.append(", ");
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

}
