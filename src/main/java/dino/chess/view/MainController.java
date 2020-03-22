package dino.chess.view;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.util.List;

import dino.chess.model.BoardPosition;
import dino.chess.model.PieceRules;

public class MainController {	
	
	@FXML
	private GridPane board; 
	
	@FXML
	public void pieceClicked(MouseEvent event) {
		
		Node source = (Node) event.getSource();
		String pieceName = ((ImageView)source).getId();
		
		List<BoardPosition> possiblePositions = PieceRules.getPossiblePiecePositions(pieceName);
		
		
		
//		System.out.println(GridPane.getColumnIndex(source.getParent()).toString());
//		System.out.println(GridPane.getRowIndex(source.getParent()).toString());
		
		System.out.println("clicou!");
	}
	
	@FXML
	public void pieceReleased(MouseEvent event) {
		
		Node source = (Node) event.getSource();
		
		System.out.println(((ImageView)event.getSource()).getId());
		
//		System.out.println(GridPane.getColumnIndex(source.getParent()).toString());
//		System.out.println(GridPane.getRowIndex(source.getParent()).toString());
		
		System.out.println("soltou!");
	}
	

	@FXML
	public void pieceDragged(MouseEvent event) {
		System.out.println(((ImageView)event.getSource()).getId());
		System.out.println("arrastou!");
		
	}
	
}
