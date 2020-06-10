package application;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import application.data.FileManager;
import application.data.SubjectManager;
import application.data.SubjectObject;
import application.data.VocabObject;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	
	
	
	@Override
	public void start(Stage primaryStage) throws NoSuchAlgorithmException, IOException {
		SubjectManager manager = new SubjectManager();
		try {
			SubjectObject sub = manager.createSubject("Moin");
			VocabObject vocab = sub.createVocab("hi");
			System.out.println(vocab.getLevel());
			vocab.levelDown();
			System.out.println(vocab.getLevel());
			vocab.levelUp();
			System.out.println(vocab.getLevel());
			manager.onClose();
			System.out.println();
			System.out.println(manager.getSubjectList().get(0).getName());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
