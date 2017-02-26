package KissExercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SetButtons extends Application {

	public static final int NUMSOFBUTTON = 6;
	public static final String[] texts = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX" };

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Create the buttons in a array
		Button[] btn = new Button[NUMSOFBUTTON];
		for (int i = 0; i < NUMSOFBUTTON; i++)
			btn[i] = new Button();

		// get random Integers
		int[] numbers = getRandomNumbers();

		// set the buttons
		setButtons(btn, numbers);

		// Add buttons to the layout
		HBox root = new HBox();
		for (int i = 0; i < NUMSOFBUTTON; i++)
			root.getChildren().add(btn[i]);

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("KISS example: SetButtons");
		primaryStage.show();

	}

	private void setButtons(Button[] btn, int[] numbers) {
		for (int i = 0; i < NUMSOFBUTTON; i++) {
			btn[i].setText(texts[numbers[i]]);
		}
	}

	private int[] getRandomNumbers() {
		int[] numbers = new int[NUMSOFBUTTON];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * NUMSOFBUTTON + 1);
		}
		return numbers;
	}

}
