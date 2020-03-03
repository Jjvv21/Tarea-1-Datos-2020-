
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WindowSendMessage {
	Stage SecondStage = new Stage();
	BorderPane Interior = new BorderPane();
	static VBox cajaVertical = new VBox();
	ScrollPane EstructuraDeTexto = new ScrollPane(cajaVertical);
	
	
	public void CreateSecondStage(Stage SecondStage,TextField Text,Button Send,HBox hbox2) {
				
		
		
	
		EstructuraDeTexto.setStyle("-fx-background-color: white ;");
		EstructuraDeTexto.setMaxSize(300, 300);


	
		Text.setMaxWidth(303);
		
		Text.setPromptText("Escribe un mensaje");
		Text.setMinWidth(253);
		hbox2.getChildren().addAll(Text,Send);
		hbox2.setTranslateY(-65);
		
		Interior.setPrefSize(300, 500);
		Interior.setBottom(hbox2);
		Interior.setCenter(EstructuraDeTexto);
		Interior.setStyle("-fx-background-color:  #aae79f ;");
		
		Scene SecondScene = new Scene(Interior,300,500);
		SecondStage.setTitle("Window Message");
		SecondStage.setScene(SecondScene);
		SecondStage.show();
		
	
	}

	public Stage getSecondStage() {
		return SecondStage;
	}
	public VBox getVBox() {
		return cajaVertical;
	}

}
