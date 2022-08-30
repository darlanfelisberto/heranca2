package br.edu.iffar.ce.models;

public abstract class ContaImp implements Conta,Comparable<ContaImp> {
	private static int sequencial;

	protected int id;
	protected float saldo;
	protected String nome;

	
	public ContaImp() {
		this.id = ContaImp.getSequencial();
	}
	
	public ContaImp(String nome) {
		this();
		this.nome = nome;
	}

	public static synchronized int getSequencial() {
		return ++sequencial;
	}

	public boolean sacar(float valor) {
		this.saldo -= valor;
		return true;
	}

	public void depositar(float valor) {
		this.saldo = saldo + valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void mostrarSaldo() {
		this.mostrarSaldo("A conta n° " + this.id + ", Saldo: " + this.saldo);
	}
	
	public void mostrarSaldo(String msg) {
		System.out.println(msg);
	}
	
	public abstract void mostrarTipo();
	
	public int compareTo(ContaImp o) {
		if(this.id>0) {
			return 1;
		}
		if(this.id<0) {
			return 1;
		}
		return 0;
	}
}