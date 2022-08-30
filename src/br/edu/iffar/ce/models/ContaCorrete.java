package br.edu.iffar.ce.models;

import java.text.MessageFormat;

public class ContaCorrete extends ContaImp{

	public static final String MSG_CONTA_POUPANCA = "O saldo de {0}, Conta Corrente n° {1}, Saldo: {2,number,currency}\n";
	
	public ContaCorrete(String nome) {
		super(nome);
	}
	
	public void mostrarConta() {
		System.out.println("Conta Correte");
	}
	
	public void mostrarSaldo() {
		super.mostrarSaldo(MessageFormat.format(MSG_CONTA_POUPANCA, this.nome,this.id,this.saldo));
	}

	public void mostrarTipo() {
		System.out.println(this.getClass().getSimpleName());
	}
}
