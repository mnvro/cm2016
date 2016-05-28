package tp18_19et20;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MonServeur extends ServerSocket {
	private ArrayList<Socket> clients = 
			new ArrayList<Socket>();
	private boolean actif = true;
	public MonServeur() throws IOException {
		super(0);  // ouvre le serveur sur un port dispo choisi par l'OS
		methodeCommuneConstructeurs();
	}
	
	public MonServeur(int numPort) throws IOException {
		super(numPort);
		methodeCommuneConstructeurs();
	}
	public void methodeCommuneConstructeurs() throws IOException{
		while(actif){
			System.out.println("On attend un client");
			clients.add(this.accept());
			System.out.println("On a reçu un nouveau client");
		}
	}
	public static void main(String[] args) throws IOException {
		MonServeur ms = new MonServeur(2016);
	}

}
