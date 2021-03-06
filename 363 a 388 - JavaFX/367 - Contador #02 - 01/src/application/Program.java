package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Program extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox mainBox = new VBox(10);
		
		Label labelTitle = new Label("Count"); 
		Label labelNumber = new Label("0");
		
		Button buttonDec = new Button("-");
		buttonDec.setOnAction(e -> {
			labelNumber.setText(Double.toString(Double.parseDouble(labelNumber.getText()) - 1));
		});
		Button buttonInc = new Button("+");
		buttonInc.setOnAction(e -> {
			labelNumber.setText(Double.toString(Double.parseDouble(labelNumber.getText()) + 1));
		});
		
		mainBox.getChildren().add(labelTitle);
		mainBox.getChildren().add(labelNumber);
		
		mainBox.setAlignment(Pos.CENTER);
		
		HBox buttons = new HBox(10);
		
		buttons.getChildren().add(buttonDec);
		buttons.getChildren().add(buttonInc);
		
		buttons.setAlignment(Pos.BOTTOM_CENTER);
		
		mainBox.getChildren().add(buttons);
		
		Scene mainScene = new Scene(mainBox, 100, 150);
		
		primaryStage.setScene(mainScene);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
