package application.ui;

import javafx.scene.Parent;
import javafx.scene.Scene;

public class UiManager {

	Parent root;
	Scene scene;
	
	public UiManager(Parent root, Scene scene){
		if(root == null || scene == null) {
			throw new IllegalArgumentException();
		}
	}
	
	private class subjectViewManager {
		
	}
	
	private class vocabViewManager{
		
	}
	
	private class vocabTestManager{
		
	}
}
