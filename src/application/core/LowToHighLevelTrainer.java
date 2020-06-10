package application.core;

import java.util.Comparator;

import application.data.SubjectObject;
import application.data.VocabObject;

public class LowToHighLevelTrainer extends Trainer {

	public LowToHighLevelTrainer(SubjectObject sub) {
		super(sub);
	}

	/**
	 * Gives next vocab, lowest level first
	 */
	@Override
	VocabObject nextVocab() {
		VocabObject vocab;
		vocab = sub.getVocabList().stream().sorted(new Comparator<VocabObject>() {

			@Override
			public int compare(VocabObject o1, VocabObject o2) {
				if (o1.getLevel() < o2.getLevel()) {
					return 1;
				} else {
					return -1;
				}
			}
		}).findFirst().orElse(null);
		return vocab;
	}

}