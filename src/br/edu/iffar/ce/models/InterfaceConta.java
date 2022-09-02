package br.edu.iffar.ce.models;

import br.edu.iffar.ce.excecoes.SaldoInsuficienteException;

public interface InterfaceConta {
	public boolean sacar(float valor) throws SaldoInsuficienteException;

	public void depositar(float valor);
	
	public void mostrarSaldo();
	
}