
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
	
	
	public void CreateSecondStage(Stage SecondStage,TextField Text,Button Send,TextField Number,HBox hbox) {
				
	 	
		Number.setPromptText("Numero De Telefono");
		Number.setMinWidth(243);
		
		hbox.getChildren().addAll(Send,Number);
		hbox.setTranslateY(74);		
		

		
		
	
		EstructuraDeTexto.setStyle("-fx-background-color: white ;");
		EstructuraDeTexto.setMaxSize(300, 300);


	
		Text.setMaxWidth(303);
		Text.setTranslateY(-75);
		Text.setPromptText("Escribe un mensaje");
		
		
		Interior.setPrefSize(300, 500);
		Interior.setTop(hbox);
		Interior.setBottom(Text);
		Interior.setCenter(EstructuraDeTexto);
		Interior.setStyle("-fx-background-color: gray ;");
		
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
