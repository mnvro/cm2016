package tp18_19et20;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MonClient extends Socket {
	private boolean actif = true;
	public MonClient() throws UnknownHostException, IOException{
		super("127.0.0.1",2016);
	}
	public MonClient(String ip, int numPort) throws UnknownHostException, IOException{
		super(ip,numPort);
	}
	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		MonClient mc = new MonClient();
		while (mc.actif){
			System.out.println(".");
			Thread.sleep(100);
		}
	}
}
