package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class VocabEditorWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text mainText;

    @FXML
    private Button okButton;

    @FXML
    private Button cancelButton;

    @FXML
    private Text firstText;

    @FXML
    private TextField questionTextField;

    @FXML
    private Text secondText;

    @FXML
    private TextField answerTextField;

    @FXML
    void okButtonClickListener(ActionEvent event) {
    	
    }

    @FXML
    void initialize() {
        assert mainText != null : "fx:id=\"mainText\" was not injected: check your FXML file 'vocabEditorWindow.fxml'.";
        assert okButton != null : "fx:id=\"okButton\" was not injected: check your FXML file 'vocabEditorWindow.fxml'.";
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'vocabEditorWindow.fxml'.";
        assert firstText != null : "fx:id=\"firstText\" was not injected: check your FXML file 'vocabEditorWindow.fxml'.";
        assert questionTextField != null : "fx:id=\"questionTextField\" was not injected: check your FXML file 'vocabEditorWindow.fxml'.";
        assert secondText != null : "fx:id=\"secondText\" was not injected: check your FXML file 'vocabEditorWindow.fxml'.";
        assert answerTextField != null : "fx:id=\"answerTextField\" was not injected: check your FXML file 'vocabEditorWindow.fxml'.";

    }
}
