module Karteikarten_System {
	exports application;

	requires javafx.base;
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	requires org.junit.jupiter.api;
	requires junit;
	opens application;
}