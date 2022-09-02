package br.edu.iffar.ce.models;

import java.text.MessageFormat;

public class ContaCorrete extends Conta{

	public static final String MSG_CONTA_POUPANCA = "Conta Corrente n° {0}, Saldo: {1,number,currency}\n";
	
	public ContaCorrete() {
		super();
	}
	
	public void mostrarConta() {
		System.out.println("Conta Correte");
	}
	
	public void mostrarSaldo() {
		super.mostrarSaldo(MessageFormat.format(MSG_CONTA_POUPANCA, this.id,this.saldo));
	}

	public void mostrarTipo() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	public String getTipo() {
		return this.getClass().getSimpleName();
	}
}
