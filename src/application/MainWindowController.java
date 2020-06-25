package application;

import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;

import application.data.SubjectManager;
import application.data.SubjectObject;
import application.trainer.NumericTrainer;
import application.trainer.RandomTrainer;
import application.trainer.Trainer;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
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
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainWindowController {

	private SubjectManager subjectManager;
	private SubjectObject subjectObject;
	private Trainer trainer = null;

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
	private TabPane mainTabPane;

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
			stage.setTitle("�ber uns");
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
		assert mainTabPane != null : "fx:id=\"mainTabPane\" was not injected: check your FXML file 'MainWindow.fxml'.";

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
		refreshSubjects();
		
		subjectListView.getSelectionModel().selectedItemProperty().addListener(c -> {
			subjectObject = subjectManager
					.getSubjectByName(subjectListView.getSelectionModel().getSelectedItem().toString());

			try {
				refreshVocabList();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			faultTestButton.setDisable(false);
			normalTestButton.setDisable(false);
			randomTestButton.setDisable(false);
		});
		
		vocabTableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
			editButton.setDisable(false);
			deleteButton.setDisable(false);
		});
	}

	@FXML
	void addButtonClickListener(ActionEvent event) {
		openAddDialog();
	}

	private void openAddDialog() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("vocabEditorWindow.fxml"));

			Scene scene = new Scene(root);

			Stage stage = new Stage();
			stage.setTitle("Hinzuf�gen");
			stage.setScene(scene);

			updateDialogLayoutToAddMode(scene);

			Button okButton = (Button) scene.lookup("#okButton");
			okButton.setOnAction(event-> {
					TextField answerTextField = (TextField) scene.lookup("#answerTextField");
					TextField questionTextField = (TextField) scene.lookup("#questionTextField");
					try {
						if (subjectObject == null && !answerTextField.getText().isEmpty()) {
							subjectObject = subjectManager.createSubject(answerTextField.getText());
							refreshSubjects();
						} else if (!answerTextField.getText().isEmpty() && !questionTextField.getText().isEmpty()) {
							subjectObject.createVocab(answerTextField.getText(), questionTextField.getText());
							refreshVocabList();
						}
						updateDialogLayoutToAddMode(scene);
						
					} catch (NoSuchAlgorithmException | IOException e) {
						e.printStackTrace();
					}
					updateDialogLayoutToAddMode(scene);
			});

			
			Button cancelButton = (Button) scene.lookup("#cancelButton");
			cancelButton.setOnAction(e-> stage.close());
			
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void updateDialogLayoutToAddMode(Scene scene) {
		TextField answerTextField = (TextField) scene.lookup("#questionTextField");
		TextField questionTextField = (TextField) scene.lookup("#questionTextField");
		if (subjectObject == null) {
			Text mainText = (Text) scene.lookup("#mainText");
			mainText.setText("Erstelle ein neues Thema:");

			Text firstText = (Text) scene.lookup("#firstText");
			firstText.setText("Name: ");

			Text secondText = (Text) scene.lookup("#secondText");
			secondText.setVisible(false);
			questionTextField.setVisible(false);
		} else {
			Text mainText = (Text) scene.lookup("#mainText");
			mainText.setText("Erstelle eine neue Vokabel:");

			Text firstText = (Text) scene.lookup("#firstText");
			firstText.setText("Frage: ");

			Text secondText = (Text) scene.lookup("#secondText");
			secondText.setVisible(true);
			secondText.setText("Antwort: ");
			questionTextField.setVisible(true);
		}
		
		answerTextField.setText("");
		questionTextField.setText("");
	}

	@FXML
	void deleteButtonClickListener(ActionEvent event) throws IOException {
		if(vocabTableView.getSelectionModel().getSelectedItem() != null) {
			subjectObject.removeVocab(vocabTableView.getSelectionModel().getSelectedItem().getVocabelName());
			refreshVocabList();
		}
	}

	@FXML
	void editButtonClickListener(ActionEvent event) {
		openEditDialog();
	}
	
	private void openEditDialog() {
		Parent root;
		try {
			if(vocabTableView.getSelectionModel().getSelectedItem() != null) {
				root = FXMLLoader.load(getClass().getResource("vocabEditorWindow.fxml"));

				Scene scene = new Scene(root);

				Stage stage = new Stage();
				stage.setTitle("Bearbeiten");
				stage.setScene(scene);

				updateDialogToEditMode(scene);
				
				Button cancelButton = (Button) scene.lookup("#cancelButton");
				cancelButton.setOnAction(e-> stage.close());
				
				Button okButton = (Button) scene.lookup("#okButton");
				okButton.setOnAction(e -> {
					TextField answerTextField = (TextField) scene.lookup("#answerTextField");
					TextField questionTextField = (TextField) scene.lookup("#questionTextField");
					
					subjectObject.editVocab(vocabTableView.getSelectionModel().getSelectedItem().getVocabelName(), answerTextField.getText(), questionTextField.getText());
					stage.close();
					try {
						refreshVocabList();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				});
				
				stage.show();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void updateDialogToEditMode(Scene scene) {
		TextField answerTextField = (TextField) scene.lookup("#answerTextField");
		TextField questionTextField = (TextField) scene.lookup("#questionTextField");
		
		Text mainText = (Text) scene.lookup("#mainText");
		mainText.setText("Bearbeite die Vokabel:");

		Text firstText = (Text) scene.lookup("#firstText");
		firstText.setText("Frage: ");

		Text secondText = (Text) scene.lookup("#secondText");
		secondText.setText("Antwort: ");
		secondText.setVisible(true);
		questionTextField.setVisible(true);
		
		answerTextField.setText(vocabTableView.getSelectionModel().getSelectedItem().getVocabelName());
		questionTextField.setText(vocabTableView.getSelectionModel().getSelectedItem().getVocabelQuestion());
	}

	@FXML
	void exportButtonClickListener(ActionEvent event) {

	}

	@FXML
	void faultButtonClickListener(ActionEvent event) throws IOException {
		trainer = new NumericTrainer(subjectObject);
		switchTestMode();
	}

	@FXML
	void importButtonClickListener(ActionEvent event) {

	}

	@FXML
	void normalButtonClickListener(ActionEvent event) throws IOException {
		trainer = new NumericTrainer(subjectObject);
		switchTestMode();
	}

	@FXML
	void randomButtonClickListener(ActionEvent event) throws IOException {
		trainer = new RandomTrainer(subjectObject);
		switchTestMode();
	}

	private void refreshVocabList() throws IOException {
		vocabs = FXCollections.observableArrayList();
		subjectObject.getVocabList().forEach(v -> {
			vocabs.add(new Vocab(v.getVocab(), v.getLevelName(), v.getQuestion()));
		});
		vocabTableView.setItems(vocabs);
		save();
	}

	public static class Vocab {
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

	private void switchTestMode() throws IOException {
		mainTabPane.getSelectionModel().select(testTab);
		nextVocab();
	}

	@FXML
	void viewButtonListener(ActionEvent event) {
		vocabText.setText(trainer.getSolution());
		falseButton.setVisible(true);
		falseButton.setDisable(false);

		okButton.setVisible(true);
		okButton.setDisable(false);

		rightButton.setVisible(true);
		rightButton.setDisable(false);

		viewButton.setVisible(false);
		viewButton.setDisable(true);
	}

	@FXML
	void wrongButtonListener(ActionEvent event) throws IOException {
		trainer.wrong();
		nextVocab();
	}

	@FXML
	void okButtonListener(ActionEvent event) throws IOException {
		trainer.ok();
		nextVocab();
	}

	@FXML
	void rightButtonListener(ActionEvent event) throws IOException {
		trainer.correct();
		nextVocab();
	}

	private void nextVocab() throws IOException {
		trainer.nextVocab();
		vocabText.setText(trainer.getQuestion());

		falseButton.setVisible(false);
		falseButton.setDisable(true);

		okButton.setVisible(false);
		okButton.setDisable(true);

		rightButton.setVisible(false);
		rightButton.setDisable(true);

		viewButton.setVisible(true);
		viewButton.setDisable(false);
		refreshVocabList();
	}

	private void refreshSubjects() {
		subjectListView.getItems().clear();
		subjectManager.getSubjectList().forEach(e -> {
			subjectListView.getItems().add(e.getName());
		});
		
		editButton.setDisable(true);
		deleteButton.setDisable(true);
	}
	
	private void save() throws IOException {
		subjectManager.onClose();
	}
}
