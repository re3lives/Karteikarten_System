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
		VocabObject curr = new VocabObject(vocab);
		vocabList.add(curr);
	}
	
	/**
	 * Removes subject from this subject
	 * @param id
	 */
	@SuppressWarnings("unlikely-arg-type")
	public void removeVocab(byte[] id) {
		Optional<VocabObject> vocab =vocabList.stream().filter(v -> v.getId().equals(id)).findFirst();
		if(vocab == null || vocab.isEmpty()) {
			throw new IllegalAccessError("Object does not exist!");
		}else {
			vocabList.remove(vocab);
		}
	}
}
