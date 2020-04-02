package javarmi.servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javarmi.util.IMensageiro;

public class Mensageiro extends UnicastRemoteObject implements IMensageiro{

	protected Mensageiro() throws RemoteException{
		super();
	}
	
	@Override
	public void enviarMensagem(String msg) throws RemoteException {
		System.out.println(msg);
		
	}

	@Override
	public String receberMensagem() throws RemoteException {
		return "Alo Mundo, teste Java RMI";
	}
}
