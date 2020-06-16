package application;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Main extends Application {
	
	
	
	@Override
	public void start(Stage primaryStage) throws NoSuchAlgorithmException, IOException {

		
		try {
			BorderPane root = new BorderPane();
			
			VBox vbox = new VBox(8);
			
			Button btn1 = new Button("Themengebiete");
			Button btn2 = new Button("Einstellungen");
			Button btn3 = new Button("Beenden");
			
			Label vokabel = new Label("Vokabeltrainer");
			
			vokabel.setMaxWidth(Double.MAX_VALUE);
			vokabel.setAlignment(Pos.CENTER);
			
			
	        vbox.getChildren().addAll(btn1, btn2, btn3);
	        vbox.setAlignment(Pos.CENTER);
	        
	        root.setTop(vokabel);
	        root.setCenter(vbox);
			
			
			Scene scene = new Scene(root, 1366, 768);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
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
