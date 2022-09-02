package br.edu.iffar.ce.models;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.edu.iffar.ce.Util;
import br.edu.iffar.ce.excecoes.TitularNotFoundException;

public class CaixaEletronico {
	
	Map<String, Titular> listaTetulares = new HashMap<>();

	
	public void addTitular(Titular titular) {
		this.listaTetulares.put(titular.getNome(), titular);
	}
	
	public void init() {
		while(true) {
			try {
				Titular t = this.listaTetulares.get(this.digiteTitular());
				
				if(t == null) {
					throw new TitularNotFoundException();
				}
				this.limpaTela();
				t.mostrarInfo();
				System.out.print("Selecione a sua conta:");
				
				Conta conta = t.getConta(Util.readInt());
				
				conta.mostrarSaldo();
				mostraOpcoes();
				
				switch (Util.readInt()) {
					case 1: {
						System.out.println("Informe o valor do saque: ");
						conta.sacar(Util.readInt());
						
						System.out.println("Saque realizado.");
						break;
					}
					case 2: {
						System.out.println("Informe o valor do Deposito: ");
						conta.depositar(Util.readInt());
						
						System.out.println("Deposito realizado.");
						break;
					}
				}
				
				
			}catch (TitularNotFoundException e) {
				System.out.println(e.getMessage());
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public String digiteTitular() throws IOException {
		System.out.print("Titular: ");
		return Util.readString();
	}
	
	public void mostraOpcoes() {
		System.out.print("""
				** Opcoes
				**
				** Sacar     1
				** Depositar 2
				**
				** Selecione: """);
	}
	
	public void limpaTela() {
		for (int i = 0; i < 30; i++) {
			System.out.println();
		}
	}
}
