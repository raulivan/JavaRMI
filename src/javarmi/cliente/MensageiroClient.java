package javarmi.cliente;

import java.rmi.Naming;
import java.rmi.Remote;

import javarmi.util.IMensageiro;

public class MensageiroClient {

	public static void main(String[] args) {
		try {
			System.out.println("Iniciando o Cliente...");
			
			IMensageiro cliente = (IMensageiro) Naming.lookup("rmi://127.0.0.1:1099/MensageiroService");
			cliente.enviarMensagem("Opa, tudo certo por aí?");
			String msg = cliente.receberMensagem();
			System.out.println(msg);
			
		}catch (Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
	}
}
