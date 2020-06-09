package application.ui;

import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

public class MainBorderPane extends BorderPane {

	MainBorderPane() {
		this.getChildren().add(new SubjectListView<String>());
	}

	private class SubjectListView<T> extends ListView<T> {
		public SubjectListView() {
			// TODO Auto-generated constructor stub
		}
	}
}
