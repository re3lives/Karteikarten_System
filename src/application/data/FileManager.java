package application.data;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

	String path = "";

	public FileManager() {

	}

	/**
	 * Save Subject to csv
	 * 
	 * @param sub
	 * @param path
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public void saveSubjectObjectToCSV(SubjectObject sub, String path, String filename) throws IOException {
		FileWriter file = new FileWriter(filename);

		file.append("VocabString");
		file.append(",");
		file.append("Level");
		file.append("\n");

		for (VocabObject vocab : sub.getVocabList()) {
			file.append(vocab.getVocab());
			file.append(", ");
			file.append(vocab.getLevel() + "");
			file.append("\n");
		}
		file.flush();
		file.close();
	}

}
