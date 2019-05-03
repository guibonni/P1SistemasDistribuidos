package br.com.p1sd.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import br.com.p1sd.model.Vet;

public class VetRemoteService extends UnicastRemoteObject implements IVetRemoteService {
	
	private static final long serialVersionUID = -5669810749796063578L;
	
	private static List<Vet> vets = new ArrayList<>();
	
	public VetRemoteService() throws RemoteException {}
	
	@Override
	public void insert(Vet v) throws RemoteException {
		vets.add(v);
	}
	
	@Override
	public List<Vet> getAll() throws RemoteException {
		return vets;
	}

}
