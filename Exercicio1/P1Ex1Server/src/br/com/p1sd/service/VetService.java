package br.com.p1sd.service;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import br.com.p1sd.remote.VetRemoteService;

public class VetService {
	
	public VetService() throws RemoteException {
		try {
			LocateRegistry.createRegistry(8282);
			Naming.rebind("rmi://localhost:8282/vet", new VetRemoteService());
			
			System.out.println("Service running on port 8282");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws RemoteException {
		new VetService();
	}

}
