package application.data;

import java.security.NoSuchAlgorithmException;

public class VocabObject {
	private String vocab;
	private byte[] id;
	private LevelObject level = new LevelObject();
	private HashGenerator gen = new HashGenerator();

	public VocabObject(String vocab) throws NoSuchAlgorithmException {
		if(vocab == null || vocab.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.vocab = vocab;
		this.id = gen.getSHA(vocab);
	}

	/**
	 * Get vocab string
	 * 
	 * @return
	 */
	public String getVocab() {
		return vocab;
	}

	/**
	 * Set vocab String
	 * 
	 * @param vocab
	 */
	public void setVocab(String vocab) {
		if (vocab == null || vocab.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.vocab = vocab;
	}

	/**
	 * Get int id
	 * 
	 * @return
	 */
	public byte[] getId() {
		return id;
	}

	/**
	 * Returns current level
	 * 
	 * @return
	 */
	public short getLevel() {
		return level.getCurrLevel();
	}

	/**
	 * Level up, if max level not reached
	 */
	public void levelUp() {
		level.levelUp();
	}
}
