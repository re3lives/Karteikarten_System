package application.data;

public class VocabObject {
	private String vocab;
	private int id;
	private LevelObject level = new LevelObject();
	
	public VocabObject(String vocab, int id) {
		this.vocab = vocab;
		this.id = id;
	}
	
	/**
	 * Get vocab string
	 * @return
	 */
	public String getVocab() {
		return vocab;
	}
	
	/**
	 * Set vocab String
	 * @param vocab
	 */
	public void setVocab(String vocab) {
		if(vocab == null || vocab.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.vocab = vocab;
	}

	/**
	 * Get int id
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Returns current level
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
