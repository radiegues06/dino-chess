
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage primaryStage;

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Dino Chess");
		
		Parent root = FXMLLoader.load(Main.class.getResource("dino/chess/view/ChessBoard.fxml"));		
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
			
	}

	public static void main(String[] args) {
		launch(args);
	}
}
