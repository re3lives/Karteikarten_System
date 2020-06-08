package application.data;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Optional;

public class SubjectObject {
	private ArrayList<VocabObject> vocabList = new ArrayList<VocabObject>();
	
	/**
	 * Creates new vocab for this subject
	 * @param vocab
	 * @throws NoSuchAlgorithmException
	 */
	public void addVocab(String vocab) throws NoSuchAlgorithmException {
		if(vocab == null || vocab.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		VocabObject curr = new VocabObject(vocab);
		if(vocabList.contains(curr)) {
			throw new IllegalArgumentException("The element already exisits!");
		}
		vocabList.add(curr);
	}
	
	/**
	 * Removes vocab from this subject
	 * @param id
	 */
	public void removeVocab(String oldVocab) {
		if(oldVocab == null || oldVocab.isEmpty()) {
			throw new IllegalArgumentException();
		}
		VocabObject vocab = getVocabByString(oldVocab);
		vocabList.remove(vocab);
	}
	
	/**
	 * Edits vocab from this subject
	 * @param id
	 * @param newVocab
	 */
	public void editVocab(String oldVocab, String newVocab) {
		if(oldVocab == null || newVocab == null || oldVocab.isEmpty() ||newVocab.isEmpty()) {
			throw new IllegalArgumentException();
		}
		VocabObject vocab = getVocabByString(oldVocab);
		vocab.setVocab(newVocab);
	}
	
	/**
	 * Returns vocab if existing
	 * @param id
	 * @return
	 */
	private VocabObject getVocabByString(String str) {
		VocabObject vocab =  vocabList.stream().filter(v -> v.getVocab().equals(str)).findFirst().orElse(null);
		if(vocab == null) {
			throw new IllegalAccessError("Object does not exist!");
		}
		return vocab;
	}
}
