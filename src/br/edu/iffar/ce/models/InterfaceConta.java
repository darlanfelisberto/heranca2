package br.edu.iffar.ce.models;

public interface InterfaceConta {
	public boolean sacar(float valor);

	public void depositar(float valor);
	
	public void mostrarSaldo();
	
}