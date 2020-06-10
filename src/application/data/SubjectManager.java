package application.data;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class SubjectManager {
	private ArrayList<SubjectObject> subjectList = new ArrayList<SubjectObject>();

	FileManager manager = new FileManager();
	
	public SubjectManager() throws NoSuchAlgorithmException, IOException {
		manager.loadSubjectManagerFromCSV(this);
		manager.loadAllSubjectObjectsFromCSV(subjectList);
	}

	/**
	 * Creates new subject
	 * 
	 * @param name
	 * @throws NoSuchAlgorithmException
	 */
	public SubjectObject createSubject(String name) throws NoSuchAlgorithmException {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException();
		}

		SubjectObject sub = null;
		sub = new SubjectObject(name);

		if (subjectList.contains(sub)) {
			throw new IllegalArgumentException("Subject already exists!");
		}
		subjectList.add(sub);
		return sub;
	}

	void importSubjectFromCSV() {
		// TODO
	}

	void exportSubjectToCSV() {
		// TODO
	}

	void deleteSubject() {
		// TODO
	}

	void loadSubjectsOnStart() {
		// TODO
	}

	/**
	 * Must be called to save data
	 * 
	 * @throws IOException
	 */
	public void onClose() throws IOException {
		for (SubjectObject subject : subjectList) {
			manager.saveSubjectObjectToCSV(subject, subject.getName()+".csv");
			manager.saveSubjectManagerToCSV(this);
		}
	}

	/**
	 * Get subject list
	 * 
	 * @return
	 */
	public ArrayList<SubjectObject> getSubjectList() {
		return subjectList;
	}

}
