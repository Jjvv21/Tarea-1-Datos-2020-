import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	

	public void Conexion(String Mensaje,int Puerto,String remitente) throws UnknownHostException, IOException {
		Socket cliente = new Socket("localhost",Puerto);
		OutputStreamWriter writer = new OutputStreamWriter(cliente.getOutputStream());
		writer.write(remitente+": "+Mensaje);
		writer.close();
		cliente.close();
	}

}	
