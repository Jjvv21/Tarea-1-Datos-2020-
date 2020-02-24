import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class WindowSendMessage {
	Stage SecondStage = new Stage();
	
	public Stage getSecondStage() {
		return SecondStage;
	}
	public void CreateSecondStage(Stage SecondStage) {
		StackPane root2 = new StackPane();
		Scene SecondScene = new Scene(root2,300,250);
		SecondStage.setTitle("Window Message");
		SecondStage.setScene(SecondScene);
		SecondStage.show();
	
	}
}
