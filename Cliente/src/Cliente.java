import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	

	public void Conexion(String Mensaje,int Puerto) throws UnknownHostException, IOException {
		System.out.println(Puerto);
		Socket cliente = new Socket("127.89.02",Puerto);
		OutputStreamWriter writer = new OutputStreamWriter(cliente.getOutputStream());
		writer.write(Mensaje);
		writer.close();
		cliente.close();
	}

}	
