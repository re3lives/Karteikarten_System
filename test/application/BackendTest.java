package application;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import application.data.LevelObject;

class BackendTest {

	//Level
	@Nested
	@DisplayName("Level Tests")
	class levelTests {
		@Test
		@DisplayName("Create Level")
		void testCreate() {
			LevelObject levelObject = new LevelObject();
			assertEquals(0, levelObject.getLevel());
		}
		
		@Test
		@DisplayName("Level upTest")
		void testLevelUp() {
			LevelObject levelObject = new LevelObject();
			levelObject.levelUp();
			assertEquals(1, levelObject.getLevel());
		}
	}
	
	
	//Vocab
	@Nested
	@DisplayName("Vocab Tests")
	class vocabTests{
		
	}
	
	//Subject
	@Nested
	@DisplayName("Subject Tests")
	class subjectTests{
		
	}
	
	//SubjectManager
	@Nested
	@DisplayName("SubjectManager Tests")
	class subjectManagerTests{
		
	}
	
	//Trainer
	@Nested
	@DisplayName("Trainer Tests")
	class trainerTests{
		
	}

}
