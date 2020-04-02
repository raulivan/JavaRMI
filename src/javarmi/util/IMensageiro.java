package javarmi.util;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMensageiro extends Remote {

	public void enviarMensagem(String msg) throws RemoteException;
	public String receberMensagem() throws RemoteException;
}
