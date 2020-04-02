package javarmi.servidor;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class MensageiroServer {

	public MensageiroServer() {
		try {
			System.out.println("Iniciando o servidor...");
			
			LocateRegistry.createRegistry(1099);
			Mensageiro mensageiro = new Mensageiro();
			Naming.rebind("rmi://127.0.0.1:1099/MensageiroService",mensageiro);
			
			System.out.println("Servidor Online...");
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args) {
		new MensageiroServer();
	}
}
