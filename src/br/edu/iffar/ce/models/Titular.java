package br.edu.iffar.ce.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Titular {

	private String nome;
	private String cpf;
	
	List<Conta> listaConta = new ArrayList<>();
	
	public Titular(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Conta getConta(int index) throws Exception {
		index = index -1;
		if(index >= 0 && index <= this.listaConta.size()) {
			return this.listaConta.get(index);
		}
		throw new Exception("Conta nao pode ser recuperada");
	}
	
	public Titular addConta(Conta conta) {
		this.listaConta.add(conta);
		return this;
	}

	public void mostrarInfo() {
		
		System.out.println("Nome: "+this.nome+", Cpf: "+ this.cpf);
		int cont = 1;
		for(Conta c : this.listaConta) {
			System.out.println(cont++ + " : " + c.getTipo());
		}
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

	public List<Conta> getListaConta() {
		return listaConta;
	}

	public void setListaConta(List<Conta> listaConta) {
		this.listaConta = listaConta;
	}

	public int hashCode() {
		return nome.hashCode();
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titular other = (Titular) obj;
		return Objects.equals(nome, other.nome);
	}	
}
