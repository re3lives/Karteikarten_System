package application.data;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class SubjectManager {
	private ArrayList<SubjectObject> subjectList = new ArrayList<SubjectObject>();
	
	/**
	 * Creates new subject
	 * @param name
	 */
	void createSubject(String name) {
		if(name == null || name.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		SubjectObject sub = null;
		try {
			sub = new SubjectObject(name);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		if(sub == null) {
			throw new IllegalArgumentException("Error while init subject!");
		}
		
		if(subjectList.contains(sub)) {
			throw new IllegalArgumentException("Subject already exists!");
		}
		subjectList.add(sub);
	}
	
	void importSubjectFromCSV() {
		//TODO
	}
	
	void exportSubjectToCSV() {
		//TODO
	}
	
	void deleteSubject() {
		//TODO
	}
	
	void loadSubjectsOnStart() {
		//TODO
	}
}
