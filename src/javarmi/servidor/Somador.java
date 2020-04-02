package javarmi.servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javarmi.util.ISoma;

public class Somador extends UnicastRemoteObject implements ISoma{

	protected Somador() throws RemoteException{
		super();
	}

	@Override
	public double somar(double n1, double n2) throws RemoteException {
		// TODO Auto-generated method stub
		return n1 + n2;
	}

	

	
	
	
}
