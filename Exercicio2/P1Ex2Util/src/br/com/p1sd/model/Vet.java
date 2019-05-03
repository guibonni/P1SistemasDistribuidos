package br.com.p1sd.model;

public class Vet {
	
	private int id;
	private String nome;
	private String cpf;
	
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
	
	public String toJson() {
		String json = "";
		
		json += "{";
		json += "\"id\":\"" + this.id + "\",";
		json += "\"nome\":\"" + this.nome + "\",";
		json += "\"cpf\":\"" + this.cpf + "\"";
		json += "}";
		
		return json;
	}
	
}