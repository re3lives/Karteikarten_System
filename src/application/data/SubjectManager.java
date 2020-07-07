package application.data;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class SubjectManager {
	private ArrayList<SubjectObject> subjectList = new ArrayList<SubjectObject>();

	FileManager manager = new FileManager();
	
	public SubjectManager() throws NoSuchAlgorithmException, IOException {
		manager.loadSubjectManagerFromCSV(this);
		subjectList = manager.loadAllSubjectObjectsFromCSV(subjectList);
	}

	/**
	 * Creates new subject
	 * 
	 * @param name Subject name
	 * @throws NoSuchAlgorithmException Error while generate hash
	 * @return Returns complete object
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

	/**
	 * Must be called to save data
	 * 
	 * @throws IOException Error while saving data
	 */
	public void onClose() throws IOException {
		for (SubjectObject subject : subjectList) {
			manager.saveSubjectObjectToCSV(subject);
			manager.saveSubjectManagerToCSV(this);
		}
	}

	/**
	 * Get subject list
	 * 
	 * @return Returns array with all subjectObjects
	 */
	public ArrayList<SubjectObject> getSubjectList() {
		return subjectList;
	}
	
	public SubjectObject getSubjectByName(String name) {
		SubjectObject subjectObject = subjectList.stream().filter(curr -> curr.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
		
		return subjectObject;
	}

}
