package dino.chess.model;

import java.util.ArrayList;
import java.util.List;

public class PieceRules {
	
	public static List<BoardPosition> getPossiblePiecePositions(String pieceName) {
		
		List<BoardPosition> possiblePiecePositions = new ArrayList<>();
		
		if (pieceName.contains("blackRook")) {
			return getRookPositions();
		}
		
		return null;
		
	}

	private static List<BoardPosition> getRookPositions() {
		
		
		
		return null;
	}

}
