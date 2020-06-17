package application;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import application.data.SubjectManager;
import application.data.SubjectObject;
import application.data.VocabObject;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

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
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));

			Scene scene = new Scene(root, 1366, 768);

			primaryStage.setTitle("Vokabeltrainer");
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
