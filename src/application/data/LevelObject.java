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
	 * @return all avaible levels
	 */
	public short[] getLevels() {
		return levels;
	}

	/**
	 * Returns array with all level names
	 * 
	 * @return All avaible level names
	 */
	public String[] getLevelNames() {
		return levelNames;
	}

	/**
	 * Returns current level
	 * 
	 * @return current level
	 */
	public short getLevel() {
		return currLevel;
	}

	/**
	 * Returns name of current level
	 * 
	 * @return Name of current level
	 */
	public String getLevelName() {
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

	public void setLevel(short level) {
		if (level >= levels[0] && level <= levels[levels.length - 1]) {
			currLevel = level;
		} else {
			throw new IllegalArgumentException("Unkown level!");
		}
	}
}
