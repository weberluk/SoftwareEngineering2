package webValidator;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class WebValidator_View {
	private WebValidator_Model model;
	private Stage stage;
	
	protected TextField txtWeb = new TextField();
	protected TextField txtPort = new TextField();
	protected Button btnValid = new Button("Valid");
	protected Button btnDoSomthing = new Button ("DoSomthing");
	protected Label lWebAdress = new Label("WebAdress: ");
	protected Label lPort = new Label("Port: ");
	
	public WebValidator_View(Stage stage, WebValidator_Model model) {
		this.model = model;
		this.stage = stage;
		
		stage.setTitle("WebValidator");
		
		HBox root = new HBox();
        Region spacer1 = new Region();
        Region spacer2 = new Region();
		root.getChildren().addAll(lWebAdress, txtWeb, lPort, txtPort, spacer1, btnValid, spacer2, btnDoSomthing);
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
	}
	
	/**
	 * Starting the view - make it visible
	 */
	
	public void start() {
		stage.show();
	}
	
	/**
	 * Stopping the view - make it invisible
	 */
	public void stop() {
		stage.hide();
	}
	
	/**
	 * Getter for the stage, so that the controller can access window events
	 * @return stage itself
	 */
	public Stage getStage(){
		return stage;
	}

}
