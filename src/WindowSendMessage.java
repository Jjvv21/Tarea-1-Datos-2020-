import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class WindowSendMessage {
	Stage SecondStage = new Stage();
	
	public Stage getSecondStage() {
		return SecondStage;
	}
	public void CreateSecondStage(Stage SecondStage,TextArea Text,Button Send,TextField Number,HBox hbox) {
		BorderPane root2 = new BorderPane();
	 	root2.setStyle("-fx-background-color: gray ;");
	 	
	
		Label labelMensaje = new Label("Mensaje De Texto");
		labelMensaje.setTranslateX(100);
		labelMensaje.setTranslateY(30);
		
		Number.setPromptText("Numero De Telefono");
		hbox.getChildren().addAll(Send,Number);
		root2.setTop(labelMensaje);
		
		Text.setMaxSize(400, 400);
		root2.setCenter(Text);
		root2.setBottom(hbox);
		
		Scene SecondScene = new Scene(root2,600,500);
		SecondStage.setTitle("Window Message");
		SecondStage.setScene(SecondScene);
		SecondStage.show();
		
	
	}
}
