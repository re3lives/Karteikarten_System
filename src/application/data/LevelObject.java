package application.data;

public class LevelObject {

	private short currLevel = 0;
	private final static short levels[] = { 0, 1, 2, 3 };
	private final static String levelNames[] = { "Neu", "Gelernt", "Gut Gelernt", "Gekonnt" };

	public LevelObject() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Returns array with all possible levels
	 * 
	 * @return
	 */
	public short[] getLevels() {
		return levels;
	}

	/**
	 * Returns array with all level names
	 * 
	 * @return
	 */
	public String[] getLevelNames() {
		return levelNames;
	}

	/**
	 * Returns current level
	 * 
	 * @return
	 */
	public short getCurrLevel() {
		return currLevel;
	}

	/**
	 * Returns name of current level
	 * 
	 * @return
	 */
	public String getCurrLevelName() {
		return levelNames[currLevel];
	}

	/**
	 * Level up for this vocab
	 */
	public void levelUp() {
		if (currLevel < levels[levels.length - 2]) {
			currLevel += 1;
		}
	}

	/**
	 * Level down for this vocab
	 */
	public void levelDown() {
		if (currLevel > levels[0]) {
			currLevel -= 1;
		}
	}
}
