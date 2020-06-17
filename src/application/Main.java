package application;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

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
