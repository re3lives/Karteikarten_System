package application.data;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class VocabObject {
	private String vocab;
	private byte[] id;
	private LevelObject level = new LevelObject();

	public VocabObject(String vocab) throws NoSuchAlgorithmException {
		this.vocab = vocab;
		this.id = getSHA(vocab);
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
	
	/**
	 * Generates hash for id
	 * @param input
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public byte[] getSHA(String input) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		return md.digest(input.getBytes(StandardCharsets.UTF_8));
	}

}
