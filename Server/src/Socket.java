
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;


import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Socket extends Thread {
	
	public void run(){
		boolean active = true;
		try {
			ServerSocket serverSocket = new ServerSocket(30001);
			while(active) {
				java.net.Socket entrante = serverSocket.accept();
				BufferedReader lector = new BufferedReader(new InputStreamReader(entrante.getInputStream()));
				String mensaje = lector.readLine();
	
				Bandeja bandeja = new Bandeja();
				bandeja.mensajes(mensaje);
				entrante.close();	
			}
			

			

			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}