package application.trainer;

import application.data.SubjectObject;

public class NumericTrainer extends Trainer {

	public NumericTrainer(SubjectObject sub) {
		super(sub);
	}

	/**
	 * Gives next vocab in numeric order
	 */
	@Override
	public void nextVocab() {
		if (curr < sub.getVocabList().size()) {

		} else {
			curr = 0;
		}
		vocab = sub.getVocabList().get(curr);
		curr += 1;
	}

}
