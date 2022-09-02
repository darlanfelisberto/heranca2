package br.edu.iffar.ce.models;

import java.text.MessageFormat;
import java.time.LocalDateTime;

import br.edu.iffar.ce.Util;

public class ContaPoupanca extends Conta{
	
	public static final String MSG_CONTA_POUPANCA = "Conta poupança n° {0}, Saldo: {1,number,currency}\n";
	
	protected LocalDateTime ultimaAtualizacao = LocalDateTime.now();

	public ContaPoupanca() {
		super();
		this.depositar(1);
	}
	
	public void mostrarConta() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	public void mostrarSaldo() {
		this.atualizarSaldo();
		super.mostrarSaldo(MessageFormat.format(MSG_CONTA_POUPANCA, this.id,this.saldo));
	}
	
	public void depositar(float valor) {
		super.depositar(valor * 1.1f);
	}
	
	
	public void mostrarTipo() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	public void atualizarSaldo() {
		int segundos = Util.diferenca(ultimaAtualizacao);
		this.ultimaAtualizacao = LocalDateTime.now();
		this.saldo = this.saldo * (1 + 0.1f * segundos);
	}

	public String getTipo() {
		return this.getClass().getSimpleName();
	}
}
