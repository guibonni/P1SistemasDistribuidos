package br.com.p1sd.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import br.com.p1sd.model.Vet;

public interface IVetRemoteService extends Remote {
	
	void insert(Vet v) throws RemoteException;
	
	List<Vet> getAll() throws RemoteException;
	
}
