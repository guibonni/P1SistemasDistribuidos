package br.com.p1sd.model;

import java.io.Serializable;
import java.rmi.RemoteException;

public class Vet implements Serializable {
	
	private static final long serialVersionUID = 16330628642731456L;
	
	private int id;
	private String nome;
	private String cpf;
	
	public Vet(int id, String nome, String cpf) throws RemoteException {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "ID: " + this.id + ", Nome: " + this.nome + ", CPF: " + this.cpf;
	}
	
}