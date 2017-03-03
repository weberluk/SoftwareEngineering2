package webValidator;

public class WebValidator_Controller {
	final protected WebValidator_Model model;
	final protected WebValidator_View view;
	
	//Valid for both for the button show / hide
	private boolean webValid = false;
	private boolean portValid = false;
	
	public WebValidator_Controller(WebValidator_Model model, WebValidator_View view) {
		this.model = model;
		this.view = view;

		// using lambda expression
		view.txtWeb.textProperty().addListener(
				// Parameters of any PropertyChangeListener
				(observable, oldValue, newValue) -> {
					validateWebAdress(newValue);
				});
		view.txtPort.textProperty().addListener(
				(observable,oldValue,newValue) -> {
					validatePort(newValue);
		});
		view.btnValid.pressedProperty().addListener(
				(observable,oldValue,newValue) -> {
					btnConnection();
				});
		view.btnDoSomthing.isPressed();
			
	}

	private void validatePort(String newValue) {
		boolean valid = model.isValidPort(newValue);
		greenRed(valid);
		portValid = valid;
		btnAcitvate();		
	}

	private void validateWebAdress(String newValue) {
		boolean valid = model.isValidWebAdress(newValue);
		greenRed(valid);
		webValid = valid;
		btnAcitvate();
	}
	
	private void greenRed(boolean valid){
		if (valid) {
			view.txtWeb.setStyle("-fx-text-inner-color: green;");
			view.txtPort.setStyle("-fx-text-inner-color: green;");
		} else {
			view.txtWeb.setStyle("-fx-text-inner-color: red;");
			view.txtPort.setStyle("-fx-text-inner-color: red;");
		}
		
	}
	private void btnAcitvate(){
		boolean valid = portValid && webValid;
		view.btnValid.setDisable(!valid);
	}
	
	private void btnConnection(){
		System.out.println("Connection...");
		System.out.println("Systeme werden geladen...");
		System.out.println("Warte auf Antwort des Servers...");
	}
	
}
