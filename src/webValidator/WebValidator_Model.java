package webValidator;

public class WebValidator_Model {
	protected boolean isValidWebAdress(String newValue) {
		boolean valid = false;
		String[] parts = newValue.split("\\.");

		// Check for a 4 part numeric address
		if (parts.length == 4) {
			valid = true;
			for (String part : parts) {
				try {
					int value = Integer.parseInt(part);
					if (value < 0 && value > 255) {
						valid = false;
					}
				} catch (NumberFormatException e) {
					valid = false;
				}
			}
		}
		
		// Check for a symbolic address
		if(parts.length >= 2) {
			valid = true;
			for (String part : parts){
				if(part.length() < 2){
					valid = false;
				}
			}
			
		}
		return valid;
	}

	//Validate Port-Number
	public boolean isValidPort(String newValue) {
		boolean valid = false;
		
		// is it empty?
		if(newValue.length() > 0){
			// is it an integer?
			try{
				int value = Integer.parseInt(newValue);
				// is it valid?
				if (value > 0 && value < 85000){
					valid = true;
				}
			} catch (NumberFormatException e){
				valid = false;
			}

		}
		return valid;
	}

}
