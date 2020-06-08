package application.data;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class SubjectManager {
	private ArrayList<SubjectObject> subjectList = new ArrayList<SubjectObject>();
	
	/**
	 * Creates new subject
	 * @param name
	 * @throws NoSuchAlgorithmException 
	 */
	public SubjectObject createSubject(String name) throws NoSuchAlgorithmException {
		if(name == null || name.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		SubjectObject sub = null;
		sub = new SubjectObject(name);
		
		if(subjectList.contains(sub)) {
			throw new IllegalArgumentException("Subject already exists!");
		}
		subjectList.add(sub);
		return sub;
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
