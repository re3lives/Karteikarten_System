package application.data;

import java.util.ArrayList;

public class SubjectObject {
	private ArrayList<VocabObject> vocabList = new ArrayList<VocabObject>();
	
	public void addVocab(String vocab) {
		VocabObject curr = new VocabObject(vocab, vocabList.size());
		vocabList.add(curr);
	}
	
	public void removeVocab(int id) {
		
	}
}
