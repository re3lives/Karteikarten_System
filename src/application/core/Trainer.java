package application.core;

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
	abstract VocabObject nextVocab();

	/**
	 * Call if correct
	 */
	public void correct() {
		vocab.levelUp();
		nextVocab();
	}

	/**
	 * Call if ok
	 */
	public void ok() {
		nextVocab();
	}

	/**
	 * Call if wrong
	 */
	public void wrong() {
		vocab.levelDown();
		nextVocab();
	}
}
