package application.trainer;

import java.util.Random;

import application.data.SubjectObject;
import application.data.VocabObject;

public class RandomTrainer extends Trainer {
	private Random rand = new Random();

	public RandomTrainer(SubjectObject sub) {
		super(sub);
	}

	/**
	 * Gives next random vocab
	 */
	@Override
	VocabObject nextVocab() {
		int r = (rand.nextInt() % sub.getVocabList().size()) - 1;
		return sub.getVocabList().get(r);
	}

}
