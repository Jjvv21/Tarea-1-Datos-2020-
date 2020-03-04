
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
	
	/**
	 * Esta funcion se encarga de crear la interfaz para la ventana que tendra el cliente 
	 * que envia el mensaje al servidor
	 * @param SecondStage
	 * @param Text
	 * @param Send
	 * @param hbox2
	 * @param remitente
	 */
	public void CreateSecondStage(Stage SecondStage,TextField Text,Button Send,HBox hbox2, TextField remitente) {
				
		
		
	
		EstructuraDeTexto.setStyle("-fx-background-color: white ;");
		EstructuraDeTexto.setMaxSize(300, 300);


		remitente.setPromptText("¿Quién lo envía?");
		
		Text.setMaxWidth(303);
		Text.setPromptText("Escribe un mensaje");
		Text.setMinWidth(253);
		
		hbox2.getChildren().addAll(Text,Send);
		hbox2.setTranslateY(-65);
		
		Interior.setTop(remitente);
		Interior.setPrefSize(300, 500);
		Interior.setBottom(hbox2);
		Interior.setCenter(EstructuraDeTexto);
		Interior.setStyle("-fx-background-color:  #aae79f ;");
		
		Scene SecondScene = new Scene(Interior,300,500);
		SecondStage.setTitle("Window Message");
		SecondStage.setScene(SecondScene);
		SecondStage.setResizable(false);
		SecondStage.show();
		
	
	}

	public Stage getSecondStage() {
		return SecondStage;
	}
	public VBox getVBox() {
		return cajaVertical;
	}

}
