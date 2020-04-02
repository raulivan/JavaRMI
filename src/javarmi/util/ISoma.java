package javarmi.util;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISoma  extends Remote{

	public double somar(double n1, double n2) throws RemoteException;
}
