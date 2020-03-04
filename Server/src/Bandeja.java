import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Bandeja {

	
	
	
	public void BandejaEntrada(String Mensaje) {
		System.out.println(Mensaje);
		Main.label2.setText(Mensaje);
		Main.BandejaEntrada.getChildren().addAll(new Button("mensaje nuevo"));

		
	}
}
