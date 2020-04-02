package javarmi.servidor;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculadoraServer {

	public static void main(String[] args) {
		try {
			System.out.println("Iniciando o servidor...");
			
			LocateRegistry.createRegistry(1099);
			Somador somador = new Somador();
			Naming.rebind("rmi://127.0.0.1:1099/Calculadora",somador);
			
			System.out.println("Servidor Online...");
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
