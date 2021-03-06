package application;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private TextField email;
	
	@FXML
	private PasswordField password;
	
	public void enter() {
		 System.out.println(email.getText());
		 System.out.println(password.getText());
	}
	
}
