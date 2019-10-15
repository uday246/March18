package May19;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class SoutheasternStates extends Application {
	// Declare an array of Strings for flag titles
	private String[] states = { "Alabama", "Florida", "Georgia", "Kentucky", "Mississippi", "North Carolina",
			"South Carolina", "Tennessee", "Virginia", "West Virginia" };

	// Declare an array of strings for state capitals
	String[] stateCapitals = { "Montgomery", "Tallahassee", "Atlanta", "Frankfort", "Jackson", "Raleigh", "Columbia",
			"Nashville", "Richmond", "Charleston" };

	// Launch the application
	public void start(Stage stage) {
		// Set title for the stage
		stage.setTitle("States in a Combo Box");

		// Create a label
		Label labelCapital = new Label(stateCapitals[0]);

		// Create a combo box
		ComboBox comboBoxStates = new ComboBox(FXCollections.observableArrayList(states));

		comboBoxStates.setValue("Alabama");
		labelCapital.setText("The capital is Montgomery");

		// Create action event
		EventHandler event = new EventHandler() {
			@Override
			public void handle(Event aEvent) {
				int i = comboBoxStates.getSelectionModel().getSelectedIndex();
				labelCapital.setText("The capital is " + stateCapitals[i]);
			}
		};

		// Set on action
		comboBoxStates.setOnAction(event);

		// Create a tile pane
		TilePane tilePane = new TilePane(comboBoxStates, labelCapital);

		// Create a scene
		Scene scene = new Scene(tilePane, 200, 200);

		// Set the scene
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String args[]) {
		// Launch the application
		launch(args);
	}
}