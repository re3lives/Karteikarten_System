package application;
	
import application.data.SubjectManager;
import application.data.SubjectObject;
import application.data.VocabObject;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		SubjectManager manager = new SubjectManager();
		try {
			SubjectObject sub = manager.createSubject("Moin");
			VocabObject vocab = sub.createVocab("hi");
			System.out.println(vocab.getLevel());
			vocab.levelDown();
			System.out.println(vocab.getLevel());
			vocab.levelUp();
			System.out.println(vocab.getLevel());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
