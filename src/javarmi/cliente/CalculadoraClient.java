package javarmi.cliente;

import java.rmi.Naming;

import javarmi.util.IMensageiro;
import javarmi.util.ISoma;

public class CalculadoraClient {

	public static void main(String[] args) {
		try {
			System.out.println("Iniciando o Cliente...");
			ISoma cliente = (ISoma) Naming.lookup("rmi://127.0.0.1:1099/Calculadora");
			double resultado = cliente.somar(10, 10);
			System.out.println(resultado);
			
		}catch (Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
		}

	}

}
