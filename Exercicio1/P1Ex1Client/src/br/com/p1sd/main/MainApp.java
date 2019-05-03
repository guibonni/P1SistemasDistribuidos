package br.com.p1sd.main;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.com.p1sd.model.Vet;
import br.com.p1sd.remote.IVetRemoteService;

public class MainApp {
	
	public static void main(String[] args) {
		try {
			IVetRemoteService vetObj = (IVetRemoteService) Naming.lookup("rmi://localhost:8282/vet");
			
			Vet v1 = new Vet(1, "Bob", "12345678900");
			Vet v2 = new Vet(2, "Charlie", "98765432199");
			
			vetObj.insert(v1);
			vetObj.insert(v2);
			
			for (Vet vet : vetObj.getAll()) {
				System.out.println(vet.toString());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

}
