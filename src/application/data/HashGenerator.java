package application.data;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashGenerator {
	/**
	 * Generates hash for id
	 * 
	 * @param input String to hash
	 * 
	 * @return ByteArray with hash
	 * @throws NoSuchAlgorithmException Error while generate hash
	 */
	public byte[] getSHA(String input) throws NoSuchAlgorithmException {
		if (input == null || input.isEmpty()) {
			throw new IllegalArgumentException();
		}
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		return md.digest(input.getBytes(StandardCharsets.UTF_8));
	}

}
