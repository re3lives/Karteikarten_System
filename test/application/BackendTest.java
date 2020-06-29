package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import application.data.LevelObject;

class BackendTest {

	/**
	 * Alle Tests für die Level
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
		 * Führt einen levelUp durch
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
	 * Alle Tests für Vocabeln
	 */
	@Nested
	@DisplayName("Vocab Tests")
	class vocabTests{
		
	}
	
	/**
	 * Alle Tests für Subjects
	 */
	@Nested
	@DisplayName("Subject Tests")
	class subjectTests{
		
	}
	
	/**
	 * Alle Tests für SubjectManager
	 */
	@Nested
	@DisplayName("SubjectManager Tests")
	class subjectManagerTests{
		
	}
	
	/**
	 * Alle Tests für Trainer
	 */
	@Nested
	@DisplayName("Trainer Tests")
	class trainerTests{
		/**
		 * Alle Tests für LowToHighLevelTrainer
		 */
		@Nested
		@DisplayName("LowToHighLevelTrainer Tests")
		class lowToHighLevelTrainerTests{
			
		}
		
		/**
		 * Alle Tests für NumericTrainer
		 */
		@Nested
		@DisplayName("NumericTrainer Tests")
		class numericTrainerTests{
			
		}
		
		/**
		 * Alle Tests für RandomLevelTrainer
		 */
		@Nested
		@DisplayName("RandomLevelTrainer Tests")
		class randomLevelTrainerTests{
			
		}
	}

}
