import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;



public class Bandeja {

	List<String> mensajes = new ArrayList<>();
	private static int i2;

	
	public void setpuerto(String numero) {
		Main.Numero.setText("Tu numero es: "+numero);
	}
	public void NumMensajes() {
		int i=0;
		this.i2=i;
		i++;
	}
	
	public void BandejaEntrada(String Mensaje,Button newMessage,String numero) {
		List<String> mensajes = new ArrayList<>();
		mensajes.add(Mensaje);
		Main.label2.setText(Mensaje);
		newMessage.setStyle("-fx-background-color: white;");
		newMessage.setOnAction(new EventHandler<ActionEvent>() {
	 		public void handle(ActionEvent e) {
	 			
	 			Main.label2.setText(mensajes.get(i2));
	 			
	 		}
		});
		
		Main.BandejaEntrada.getChildren().addAll(newMessage);
		

		
	}
}
