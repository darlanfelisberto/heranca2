package br.edu.iffar.ce.models;

import java.text.MessageFormat;

public class ContaPoupanca extends ContaImp{
	
	public static final String MSG_CONTA_POUPANCA = "O saldo de {0}, Conta poupança n° {1}, Saldo: {2,number,currency}\n";

	public ContaPoupanca(String nome) {
		super.nome = nome;
	}
	
	public void mostrarConta() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	public void mostrarSaldo() {
		super.mostrarSaldo(MessageFormat.format(MSG_CONTA_POUPANCA, this.nome,this.id,this.saldo));
	}
	
	public void depositar(float valor) {
		super.depositar(valor * 1.1f);
	}
	
	public void mostrarTipo() {
		System.out.println(this.getClass().getSimpleName());
	}
}
