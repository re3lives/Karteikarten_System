package application;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import application.data.SubjectManager;
import application.data.SubjectObject;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws NoSuchAlgorithmException, IOException {
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
