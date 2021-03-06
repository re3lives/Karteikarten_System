package application.data;

import java.security.NoSuchAlgorithmException;

public class VocabObject extends LevelObject{
	private String question;
	private String vocab;
	private byte[] id;
	private HashGenerator gen = new HashGenerator();

	public VocabObject(String vocab, String question) throws NoSuchAlgorithmException {
		if (vocab == null || vocab.isEmpty() || question == null || question.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.vocab = vocab;
		this.id = gen.getSHA(vocab);
		this.question = question;
	}

	/**
	 * Get vocab string
	 * 
	 * @return Vocab string
	 */
	public String getVocab() {
		return vocab;
	}

	/**
	 * Set vocab String
	 * 
	 * @param vocab Vocab to learn
	 * @param question Question for vocab
	 */
	public void setVocab(String vocab, String question) {
		if (vocab == null || vocab.isEmpty() || question == null || question.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.vocab = vocab;
		this.question = question;
	}

	/**
	 * Get int id
	 * 
	 * @return byte hash
	 */
	public byte[] getId() {
		return id;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		if(question == null || question.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		this.question = question;
	}
}
