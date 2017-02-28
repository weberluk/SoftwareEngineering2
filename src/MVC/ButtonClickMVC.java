package MVC;

import javafx.application.Application;
import javafx.stage.Stage;

public class ButtonClickMVC extends Application {
	private ButtonClickView view;
	private ButtonClickController controller;
	private ButtonClickModel model;
	
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage){
		model = new ButtonClickModel();
		controller = new ButtonClickController(model,view);
		view = new ButtonClickView(primaryStage,model);
	}
	
	@Override
	public void stop(){
		if (view != null)
			view.stop();
	}
	
}
