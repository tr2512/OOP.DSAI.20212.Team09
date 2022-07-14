import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import java.io.IOException;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
	try {	
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/MainScreen.fxml"));
		Scene scene = new Scene(root, Color.BLACK);
		
		stage.setTitle("Cell Division");
		stage.setScene(scene);
		stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}	
}