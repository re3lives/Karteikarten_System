package application.core;

import application.data.SubjectObject;
import application.data.VocabObject;

public class NumericTrainer extends Trainer {

	public NumericTrainer(SubjectObject sub) {
		super(sub);
	}

	
	/**
	 * Gives next vocab in numeric order
	 */
	@Override
	VocabObject nextVocab() {
		if (curr < sub.getVocabList().size()) {

		} else {
			curr = 0;
		}
		vocab = sub.getVocabList().get(curr);
		curr += 1;
		return vocab;
	}

}
