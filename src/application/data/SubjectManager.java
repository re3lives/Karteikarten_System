package application.data;

import java.util.ArrayList;

public class SubjectManager {
	private ArrayList<SubjectObject> subjectList = new ArrayList<SubjectObject>();
	
	
	void createSubject(String name) {
		short id = (short) (subjectList.size()-1);
		SubjectObject sub = new SubjectObject(name, id);
		subjectList.add(sub);
	}
	
	void importSubjectFromCSV() {
		
	}
	
	void exportSubjectToCSV() {
		
	}
	
	void deleteSubject() {
		
	}
	
	void loadSubjectsOnStart() {
		
	}
}
