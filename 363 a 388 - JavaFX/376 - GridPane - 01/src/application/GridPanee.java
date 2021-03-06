package application;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class GridPanee extends GridPane {
	
	public GridPanee() {
		Box b1 = new Box();
		Box b2 = new Box();
		
		setGridLinesVisible(true);
		
		getColumnConstraints().addAll(cc(), cc(), cc(), cc(), cc());
		getRowConstraints().addAll(rc(), rc(), rc(), rc(), rc());
		
		add(b1, 0, 0, 2, 2);
		add(b2, 1, 1, 2, 2);
	}
	
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		
		cc.setPercentWidth(20);
		cc.setFillWidth(true);
		
		return cc;
	}
	
	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		
		rc.setPercentHeight(20);
		rc.setFillHeight(true);
		
		return rc;
	}
	
}
