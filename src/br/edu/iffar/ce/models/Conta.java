package br.edu.iffar.ce.models;

import br.edu.iffar.ce.excecoes.SaldoInsuficienteException;

public abstract class Conta implements Comparable<Conta> {
	private static int sequencial;

	protected Integer id;
	protected float saldo;
	
	public Conta() {
		this.id = Conta.getSequencial();
	}

	public static int getSequencial() {
		return ++sequencial;
	}

	public boolean sacar(float valor) throws SaldoInsuficienteException{
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException();
		}
		
		this.saldo -= valor;
		return true;
	}

	public void depositar(float valor) {
		this.saldo = saldo + valor;
	}
	
	public void mostrarSaldo() {
		this.mostrarSaldo("A conta n° " + this.id + ", Saldo: " + this.saldo);
	}
	
	public void mostrarSaldo(String msg) {
		System.out.println(msg);
	}

	public int compareTo(Conta o) {
		return this.id.compareTo(o.id);
	}
	
	public abstract void mostrarTipo();
	
	public abstract String getTipo();
}