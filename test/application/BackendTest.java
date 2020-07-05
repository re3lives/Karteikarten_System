package application;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import application.data.LevelObject;
import application.data.VocabObject;

class BackendTest {

	/**
	 * Alle Tests für die Level
	 */
	@Nested
	@DisplayName("Level Tests")
	class levelTests {
		
		/**
		 * Erstellt ein Level auto. level 0
		 */
		@Test
		@DisplayName("Level 0, Level erstellen ")
		void testCreate() {
			LevelObject levelObject = new LevelObject();
			assertEquals(0, levelObject.getLevel());
		}
		
		/**
		 * level up auf 1
		 */
		@Test
		@DisplayName("Level 1 up")
		void testLevelUp1() {
			LevelObject levelObject = new LevelObject();
			levelObject.levelUp();
			assertEquals(1, levelObject.getLevel());
		}
		
		/**
		 * level up auf 2 
		 */
		@Test
		@DisplayName("Level 2 up")
		void testLevelUp2() {
			LevelObject levelObject = new LevelObject();
			levelObject.levelUp();
			levelObject.levelUp();
			assertEquals(2, levelObject.getLevel());
		}
		
		/**
		 * level up auf 3 
		 */
		@Test
		@DisplayName("Level 3 up")
		void testLevelUp3() {
			LevelObject levelObject = new LevelObject();
			levelObject.levelUp();
			levelObject.levelUp();
			levelObject.levelUp();
			assertEquals(3, levelObject.getLevel());
		}
		
		/**
		 * level up auf 4
		 */
		@Test
		@DisplayName("Level 4 up")
		void testLevelUp4() {
			LevelObject levelObject = new LevelObject();
			levelObject.levelUp();
			levelObject.levelUp();
			levelObject.levelUp();
			assertEquals(3, levelObject.getLevel()); // 4 gibt es nicht aber nimmt 3!!!!!!!!!!!!!!!!!
		}
		
		//Level runter 
		
		/**
		 * level down auf 0
		 */
		@Test
		@DisplayName("Level 0 down")
		void testLeveldown0() {
			LevelObject levelObject = new LevelObject();
			levelObject.levelUp();
			levelObject.levelDown();
			assertEquals(0, levelObject.getLevel());
		}
		
		/**
		 * level down auf 1
		 */
		@Test
		@DisplayName("Level 1 down")
		void testLeveldown1() {
			LevelObject levelObject = new LevelObject();
			levelObject.levelUp();
			levelObject.levelUp();
			levelObject.levelDown();
			assertEquals(1, levelObject.getLevel());
		}
		
		/**
		 * level down auf 2
		 */
		@Test
		@DisplayName("Level 2 down")
		void testLeveldown2() {
			LevelObject levelObject = new LevelObject();
			levelObject.levelUp();
			levelObject.levelUp();
			levelObject.levelUp();
			levelObject.levelDown();
			assertEquals(2, levelObject.getLevel());//muss levvel 2 sein!!!!!!!!!!!!!!!!
		}
		
		/**
		 * level down von 0
		 */
		@Test
		@DisplayName("Level -1 down")
		void testLeveldownm1_1() {
			LevelObject levelObject = new LevelObject();
			levelObject.levelDown();
			assertEquals(0, levelObject.getLevel());// nicht möglich!!!!!!!!!!!!!!!!!!!!!!!!!!
		}
		
		/* 
		@Test
		@DisplayName("Level -1 down")
		void testLeveldownm1_2() {
			assertThrows(IllegalArgumentException.class, new Executable() {
				@Override
				public void execute() throws Throwable {
					LevelObject levelObject = new LevelObject();
					levelObject.levelDown();	
				}
			});
		}// ist null 
		
		
		@Test
		@DisplayName("Level 3 down")
		void testLeveldownm3() {
			assertThrows(IllegalArgumentException.class, new Executable() {
				@Override
				public void execute() throws Throwable {
					LevelObject levelObject = new LevelObject();
					levelObject.levelUp();	
					levelObject.levelUp();	
					levelObject.levelUp();	
					levelObject.levelUp();	
				}
			});
		}
		*/	
	
		//levelnamen
		
		/**
		 * level 0 ungelernt
		 */
		@Test
		@DisplayName("Level 0 Name")
		void testLevelName0() {
			LevelObject levelObject = new LevelObject();

			assertEquals("ungelernt", levelObject.getLevelName());
		}
		
		/**
		 * level 1 gelernt
		 */
		@Test
		@DisplayName("Level 1 Name")
		void testLevelName1() {
			LevelObject levelObject = new LevelObject();
			levelObject.levelUp();
			assertEquals("gelernt", levelObject.getLevelName());
		}
		
		/**
		 * level 2 gelernt
		 */
		@Test
		@DisplayName("Level 2 Name")
		void testLevelName2() {
			LevelObject levelObject = new LevelObject();
			levelObject.levelUp();
			levelObject.levelUp();
			assertEquals("gut gelernt", levelObject.getLevelName());
		}
		
		/**
		 * level 3 gelernt
		 */
		@Test
		@DisplayName("Level 3 Name")
		void testLevelName3() {
			LevelObject levelObject = new LevelObject();
			levelObject.levelUp();
			levelObject.levelUp();
			levelObject.levelUp();
			assertEquals("perfekt gelernt", levelObject.getLevelName());
		}
	}
	
	
	
	
	
	
	
	/**
	 * Alle Tests für Vocabeln
	 */
	@Nested
	@DisplayName("Vocab Tests")
	class vocabTests{
		

		
		/**
		 * erfolgereiche Antwort kk
		 * @throws Exception 
		 */
		@Test
		@DisplayName("erfolgreiche Antwort kk")
		void testVocTrueVocab() throws Exception {
			VocabObject vocabObject = new VocabObject("antwort","frage"); 
			assertEquals("antwort", vocabObject.getVocab());
		}
		
		/**
		 * erfolgereiche Frage kk
		 * @throws NoSuchAlgorithmException 
		 */
		@Test
		@DisplayName("erfolgreiche Frage kk")
		void testVocTrueQuestion() throws NoSuchAlgorithmException {
			VocabObject vocabObject = new VocabObject("antwort","frage"); 
			assertEquals("frage", vocabObject.getQuestion());
		}
		
		
		
		/**
		 * keine Frage in der kk
		 */
		@Test
		@DisplayName("keine Frage kk")
		void testVocEmptyQuestion() {
			assertThrows(IllegalArgumentException.class, new Executable() {
				@Override
				public void execute() throws Throwable {
				new VocabObject("test",""); 
				}
				
			});
		}	
		
		/**
		 * keine Antwort in der kk
		 */
		@Test
		@DisplayName("keine Antwort kk")
		void testVocEmptyAnswer() {
			assertThrows(IllegalArgumentException.class, new Executable() {
				@Override
				public void execute() throws Throwable {
				new VocabObject("","test"); 
				}
				
			});
		}
			
	}
	
	
	
	/**
	 * Alle Tests für Subjects
	 */
	@Nested
	@DisplayName("Subject Tests")
	class subjectTests{
		
		
		/**
		 * erfolgereiche Frage kk
		 * @throws NoSuchAlgorithmException 
		 */
		@Test
		@DisplayName("erfolgreiche Frage kk")
		void testVocTrueQuestion() throws NoSuchAlgorithmException {
			VocabObject vocabObject = new VocabObject("antwort","frage"); 
			assertEquals("frage", vocabObject.getQuestion());
		}
		
		
		
		/**
		 * keine Frage in der kk
		 */
		@Test
		@DisplayName("keine Frage Kk")
		void testVocEmptyQuestion() {
			assertThrows(IllegalArgumentException.class, new Executable() {
				@Override
				public void execute() throws Throwable {
				new VocabObject("test",""); 
				}
				
			});
		}	
		
		
		
		
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
		 * Alle Tests für RandomTrainer
		 */
		@Nested
		@DisplayName("RandomTrainer Tests")
		class randomLevelTrainerTests{
			
		}
	}

}
