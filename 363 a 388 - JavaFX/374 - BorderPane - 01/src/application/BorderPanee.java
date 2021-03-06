package application;

import javafx.scene.layout.BorderPane;

public class BorderPanee extends BorderPane {
	
	public BorderPanee() {
		Box b1 = new Box().withText("Top");
		setTop(b1);
		Box b2 = new Box().withText("Left");
		setLeft(b2);
		Box b3 = new Box().withText("Right");
		setRight(b3);
		Box b4 = new Box().withText("Bottom");
		setBottom(b4);
		Box b5 = new Box().withText("Center");
		setCenter(b5);
	}
	
}
