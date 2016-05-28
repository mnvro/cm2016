package tp18_;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MonClient extends Socket {
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	public MonClient() throws UnknownHostException, IOException{
		super("127.0.0.1",2016);
		methodeCommuneConstructeur();
	}
	public MonClient(String ip, int numPort) throws UnknownHostException, IOException{
		super(ip,numPort);
		methodeCommuneConstructeur();
	}
	public void methodeCommuneConstructeur() throws IOException{
		ois = new ObjectInputStream(this.getInputStream());
		oos = new ObjectOutputStream(this.getOutputStream());
	}
	public static void main(String[] args) throws UnknownHostException, IOException {
		
			MonClient mc = new MonClient();
		
	}
}
