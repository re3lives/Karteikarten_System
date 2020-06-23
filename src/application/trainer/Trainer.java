package application.trainer;

import application.data.SubjectObject;
import application.data.VocabObject;

public abstract class Trainer {

	SubjectObject sub;
	VocabObject vocab;
	int curr = 0;

	/**
	 * Constructor to init subject as current vocab list
	 * 
	 * @param sub
	 */
	public Trainer(SubjectObject sub) {
		if (sub == null) {
			throw new IllegalArgumentException();
		}

		if (sub.getVocabList().size() == 0) {
			throw new IllegalArgumentException("Create vocabs first!");
		}

		this.sub = sub;
	}

	/**
	 * Gives next vocab
	 * 
	 * @return
	 */
	public abstract void nextVocab();

	/**
	 * Call if correct
	 */
	public void correct() {
		vocab.levelUp();
	}

	/**
	 * Call if ok
	 */
	public void ok() {

	}

	/**
	 * Call if wrong
	 */
	public void wrong() {
		vocab.levelDown();
	}
	
	/**
	 * Returns question of current vocab
	 * @return
	 */
	public String getQuestion() {
		return vocab.getQuestion();
	}
	
	/**
	 * Returns solution of current vocab
	 * @return
	 */
	public String getSolution() {
		return vocab.getVocab();
	}
}
