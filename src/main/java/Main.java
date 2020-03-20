
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage primaryStage;
	private AnchorPane chessBoard;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Dino Chess");
		
		initRootLayout();
	}
	
	public void initRootLayout() {
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("dino/chess/view/ChessBoard.fxml"));
        try {
			chessBoard = (AnchorPane) loader.load();
			
			// Mostra a scene (cena) contendo o root layout.
            Scene scene = new Scene(chessBoard);
            primaryStage.setScene(scene);
            primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
