package application.data;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class SubjectObject {
	private ArrayList<VocabObject> vocabList = new ArrayList<VocabObject>();

	private String name;
	private byte[] id;
	private HashGenerator gen = new HashGenerator();

	public SubjectObject(String name) throws NoSuchAlgorithmException {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.id = gen.getSHA(name);
	}

	/**
	 * Creates new vocab for this subject
	 * 
	 * @param vocab Vocab to learn
	 * @param question Question for vocab
	 * @return Completed object
	 * @throws NoSuchAlgorithmException Error while generate hash
	 */
	public VocabObject createVocab(String vocab, String question) throws NoSuchAlgorithmException {
		if (vocab == null || vocab.isEmpty()) {
			throw new IllegalArgumentException();
		}

		VocabObject curr = new VocabObject(vocab, question);

		if (vocabList == null) {
			throw new IllegalArgumentException();
		}

		if (vocabList.contains(curr)) {
			throw new IllegalArgumentException("The vocab already exisits!");
		}
		vocabList.add(curr);
		return curr;
	}

	/**
	 * Removes vocab from this subject
	 * 
	 * @param oldVocab Vocab string to remove
	 */
	public void removeVocab(String oldVocab) {
		if (oldVocab == null || oldVocab.isEmpty()) {
			throw new IllegalArgumentException();
		}
		VocabObject vocab = findVocabByString(oldVocab);
		vocabList.remove(vocab);
	}

	/**
	 * Edits vocab from this subject
	 * 
	 * @param oldVocab Vocab to edit
	 * @param newVocab New vocab
	 * @param newQuestion New question
	 */
	public void editVocab(String oldVocab, String newVocab, String newQuestion) {
		if (oldVocab == null || newVocab == null || oldVocab.isEmpty() || newVocab.isEmpty() || newQuestion == null || newQuestion.isEmpty()) {
			throw new IllegalArgumentException();
		}
		VocabObject vocab = findVocabByString(oldVocab);
		vocab.setVocab(newVocab, newQuestion);
	}

	/**
	 * Returns vocab if existing
	 * 
	 * @param id
	 * @return
	 */
	public VocabObject findVocabByString(String str) {
		if (str == null) {
			throw new IllegalArgumentException();
		}
		VocabObject vocab = vocabList.stream().filter(v -> v.getVocab().equalsIgnoreCase(str)).findFirst().orElse(null);
		
		if (vocab == null) {
			throw new IllegalAccessError("Object does not exist!");
		}
		return vocab;
	}

	/**
	 * Get name
	 * 
	 * @return Name of subjectobject
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get id
	 * 
	 * @return hash id
	 */
	public byte[] getId() {
		return id;
	}

	/**
	 * Get vocabs
	 * 
	 * @return List with all VocabObjects
	 */

	public ArrayList<VocabObject> getVocabList() {
		return vocabList;
	}

}
