package MVC;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ButtonClickView {
	private ButtonClickModel model;
	private Stage stage;
	protected Label lbNumber;
	protected Button btnClick;
	
	protected ButtonClickView(Stage stage, ButtonClickModel model){
		this.stage = stage;
		this.model = model;
		stage.setTitle("Button Click MVC");
		
		GridPane pane = new GridPane();
		this.lbNumber = new Label();
		this.lbNumber.setText(Integer.toString(model.getValue()));
		pane.add(this.lbNumber, 0, 0);
		
		this.btnClick = new Button();
		this.btnClick.setText("Click Me!");
		pane.add(this.btnClick, 0, 1);
		
		Scene scene = new Scene(pane);	
		scene.getStylesheets().add(
		getClass().getResource("ButtonClickMVC.css").toExternalForm());
		stage.setScene(scene);
	}
	
	public void start() {
		stage.show();
	}
	
	public void stop() {
		stage.hide();
	}
	
	public Stage getStage() {
		return stage;
	}
	

}
