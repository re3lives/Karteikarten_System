package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuBar mainMenuBar;

    @FXML
    private Menu programmMenu;

    @FXML
    private MenuItem quitMenuItem;

    @FXML
    private Menu helpMenu;

    @FXML
    private MenuItem aboutMenuItem;

    @FXML
    private Tab overviewTab;

    @FXML
    private Tab lectionsTab;

    @FXML
    private SplitPane LectionSplitPane;

    @FXML
    private ListView<String> subjectListView;

    @FXML
    private TableView<String> vocabTableView;

    @FXML
    private HBox LactionHBox;

    @FXML
    private Button addButton;

    @FXML
    private Button editButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button importButton;

    @FXML
    private Button exportButton;

    @FXML
    private Button normalTestButton;

    @FXML
    private Button randomTestButton;

    @FXML
    private Button faultTestButton;

    @FXML
    private Tab testTab;

    @FXML
    private Text vocabText;

    @FXML
    private Button viewButton;

    @FXML
    private Button rightButton;

    @FXML
    private Button FalseButton;

    @FXML
    private Button OkButton;

    @FXML
    void closeApp(ActionEvent event) {
		Platform.exit();
		System.exit(0);
    }

    @FXML
    void loadSubjectListView(ActionEvent event) {
    	
    }

    @FXML
    void openAbout(ActionEvent event) {
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

    @FXML
    void initialize() {
        assert mainMenuBar != null : "fx:id=\"mainMenuBar\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert programmMenu != null : "fx:id=\"programmMenu\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert quitMenuItem != null : "fx:id=\"quitMenuItem\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert helpMenu != null : "fx:id=\"helpMenu\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert aboutMenuItem != null : "fx:id=\"aboutMenuItem\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert overviewTab != null : "fx:id=\"overviewTab\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert lectionsTab != null : "fx:id=\"lectionsTab\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert LectionSplitPane != null : "fx:id=\"LectionSplitPane\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert subjectListView != null : "fx:id=\"subjectListView\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert vocabTableView != null : "fx:id=\"vocabTableView\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert LactionHBox != null : "fx:id=\"LactionHBox\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert addButton != null : "fx:id=\"addButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert editButton != null : "fx:id=\"editButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert importButton != null : "fx:id=\"importButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert exportButton != null : "fx:id=\"exportButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert normalTestButton != null : "fx:id=\"normalTestButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert randomTestButton != null : "fx:id=\"randomTestButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert faultTestButton != null : "fx:id=\"faultTestButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert testTab != null : "fx:id=\"testTab\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert vocabText != null : "fx:id=\"vocabText\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert viewButton != null : "fx:id=\"viewButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert rightButton != null : "fx:id=\"rightButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert FalseButton != null : "fx:id=\"FalseButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert OkButton != null : "fx:id=\"OkButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        
        subjectListView.getItems().add("Test");
    }
}
