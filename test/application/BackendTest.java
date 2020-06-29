package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import application.data.LevelObject;

class BackendTest {

	/**
	 * Alle Tests f�r die Level
	 */
	@Nested
	@DisplayName("Level Tests")
	class levelTests {
		/**
		 * Erstellt ein Level
		 */
		@Test
		@DisplayName("Create Level")
		void testCreate() {
			LevelObject levelObject = new LevelObject();
			assertEquals(0, levelObject.getLevel());
		}
		
		
		/**
		 * F�hrt einen levelUp durch
		 */
		@Test
		@DisplayName("Level upTest")
		void testLevelUp() {
			LevelObject levelObject = new LevelObject();
			levelObject.levelUp();
			assertEquals(1, levelObject.getLevel());
		}
	}
	
	
	
	/**
	 * Alle Tests f�r Vocabeln
	 */
	@Nested
	@DisplayName("Vocab Tests")
	class vocabTests{
		
	}
	
	/**
	 * Alle Tests f�r Subjects
	 */
	@Nested
	@DisplayName("Subject Tests")
	class subjectTests{
		
	}
	
	/**
	 * Alle Tests f�r SubjectManager
	 */
	@Nested
	@DisplayName("SubjectManager Tests")
	class subjectManagerTests{
		
	}
	
	/**
	 * Alle Tests f�r Trainer
	 */
	@Nested
	@DisplayName("Trainer Tests")
	class trainerTests{
		/**
		 * Alle Tests f�r LowToHighLevelTrainer
		 */
		@Nested
		@DisplayName("LowToHighLevelTrainer Tests")
		class lowToHighLevelTrainerTests{
			
		}
		
		/**
		 * Alle Tests f�r NumericTrainer
		 */
		@Nested
		@DisplayName("NumericTrainer Tests")
		class numericTrainerTests{
			
		}
		
		/**
		 * Alle Tests f�r RandomLevelTrainer
		 */
		@Nested
		@DisplayName("RandomLevelTrainer Tests")
		class randomLevelTrainerTests{
			
		}
	}

}
