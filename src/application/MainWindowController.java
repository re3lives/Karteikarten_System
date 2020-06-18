package application;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainWindowController {

	public void closeApp() {
		Platform.exit();
		System.exit(0);
	}
	
	public void openAbout() {
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("about.fxml"));

			Scene scene = new Scene(root, 600, 300);

			Stage stage = new Stage();
			stage.setTitle("Über uns");
			stage.setScene(scene);  
	        stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
