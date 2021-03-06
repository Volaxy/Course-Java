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
	
	private void updateLabel(Label label) {
		label.getStyleClass().remove("red");
		label.getStyleClass().remove("green");

		if(Integer.parseInt(label.getText()) >= 0) {
			label.getStyleClass().add("green");
		} else {
			label.getStyleClass().add("red");
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		String srcCSS = getClass().getResource("/application/style.css").toExternalForm();
		
		VBox mainBox = new VBox(10);
		
		mainBox.getStyleClass().add("main");
		
		Label labelTitle = new Label("Count"); 
		Label labelNumber = new Label("0");
		
		Button buttonDec = new Button("-");
		buttonDec.setOnAction(e -> {
			labelNumber.setText(Integer.toString(Integer.parseInt(labelNumber.getText()) - 1));
			updateLabel(labelNumber);
		});
		Button buttonInc = new Button("+");
		buttonInc.setOnAction(e -> {
			labelNumber.setText(Integer.toString(Integer.parseInt(labelNumber.getText()) + 1));
			updateLabel(labelNumber);
		});
		
		buttonDec.getStyleClass().add("button");
		buttonInc.getStyleClass().add("button");
		
		mainBox.getChildren().add(labelTitle);
		labelTitle.getStyleClass().add("title");
		mainBox.getChildren().add(labelNumber);
		labelNumber.getStyleClass().add("number");
		mainBox.setAlignment(Pos.CENTER);
		
		HBox buttons = new HBox(10);
		
		buttons.getChildren().add(buttonDec);
		buttons.getChildren().add(buttonInc);
		buttons.setAlignment(Pos.BOTTOM_CENTER);
		
		mainBox.getChildren().add(buttons);
		
		Scene mainScene = new Scene(mainBox, 200, 200);
		mainScene.getStylesheets().add(srcCSS);
		mainScene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
