package application;

import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;

import application.data.SubjectManager;
import application.data.SubjectObject;
import application.data.VocabObject;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainWindowController {
	
	private SubjectManager subjectManager;
	private SubjectObject subjectObject;
	
	private ObservableList<Vocab> vocabs = FXCollections.observableArrayList();

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
    private TableView<Vocab> vocabTableView;

    @FXML
    private TableColumn<Vocab, String> vocabNameTableColumn;

    @FXML
    private TableColumn<Vocab, String> vocabLevelTableColumn;
    
    @FXML
    private TableColumn<Vocab, String> vocabQuestionTableColumn;

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
    private Button falseButton;

    @FXML
    private Button okButton;

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
        assert vocabQuestionTableColumn != null : "fx:id=\"vocabQuestionTableColumn\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert vocabNameTableColumn != null : "fx:id=\"vocabNameTableColumn\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert vocabLevelTableColumn != null : "fx:id=\"vocabLevelTableColumn\" was not injected: check your FXML file 'MainWindow.fxml'.";
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
        assert falseButton != null : "fx:id=\"falseButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert okButton != null : "fx:id=\"okButton\" was not injected: check your FXML file 'MainWindow.fxml'.";

        vocabNameTableColumn.setCellValueFactory(new PropertyValueFactory<Vocab, String>("vocabelName"));
        vocabLevelTableColumn.setCellValueFactory(new PropertyValueFactory<Vocab, String>("vocabelLevelName"));
        vocabQuestionTableColumn.setCellValueFactory(new PropertyValueFactory<Vocab, String>("vocabelQuestion"));
        try {
			onStart();
		} catch (NoSuchAlgorithmException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    void onStart() throws NoSuchAlgorithmException, IOException {
    	subjectManager = new SubjectManager();
    	subjectManager.getSubjectList().forEach(e -> {
    		subjectListView.getItems().add(e.getName());
    	});
    	
    	subjectListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				subjectObject = subjectManager.getSubjectByName(subjectListView.getSelectionModel().getSelectedItem().toString());
				
				refreshVocabList();
			}
		});
    }
    
    @FXML
    void addButtonClickListener(ActionEvent event) {
    	
    }

    @FXML
    void deleteButtonClickListener(ActionEvent event) {
    	
    }

    @FXML
    void editButtonClickListener(ActionEvent event) {

    }

    @FXML
    void exportButtonClickListener(ActionEvent event) {

    }

    @FXML
    void faultButtonClickListener(ActionEvent event) {

    }

    @FXML
    void importButtonClickListener(ActionEvent event) {

    }

    @FXML
    void normalButtonClickListener(ActionEvent event) {

    }

    @FXML
    void randomButtonClickListener(ActionEvent event) {

    }
    
    private void refreshVocabList() {
    	System.out.println(subjectObject.getVocabList().size());
    	vocabs = FXCollections.observableArrayList();
    	subjectObject.getVocabList().forEach(v -> {
    		vocabs.add(new Vocab(v.getVocab(), v.getLevelName(), v.getQuestion()));
    	});
    	vocabTableView.setItems(vocabs);
    }
    
    public static class Vocab{
    	private final SimpleStringProperty vocabelName;
    	private final SimpleStringProperty vocabelLevelName;
    	private final SimpleStringProperty vocabelQuestion;
    	
    	public Vocab(String name, String level, String question) {
    		vocabelName = new SimpleStringProperty(name);
    		vocabelLevelName = new SimpleStringProperty(level);
    		vocabelQuestion = new SimpleStringProperty(question);
    	}
    	
    	public String getVocabelName() {
    		return vocabelName.get();
    	}
    	
    	public String getVocabelLevelName() {
    		return vocabelLevelName.get();
    	}
    	
    	public String getVocabelQuestion() {
    		return vocabelQuestion.get();
    	}
    	
    }
}
