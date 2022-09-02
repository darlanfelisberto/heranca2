package br.edu.iffar.ce;
import java.util.ArrayList;
import java.util.List;

import br.edu.iffar.ce.models.ContaCorrete;
import br.edu.iffar.ce.models.CaixaEletronico;
import br.edu.iffar.ce.models.Conta;
import br.edu.iffar.ce.models.ContaPoupanca;
import br.edu.iffar.ce.models.Titular;

public class Main {
	
	public static void main(String [] a) {
		CaixaEletronico ce = new CaixaEletronico();
		
		ce.addTitular(
				new Titular("malaquias", "74125896300")
				.addConta(new ContaCorrete())
				.addConta(new ContaPoupanca())
		);
		
		ce.addTitular(
				new Titular("Magda", "58741236900")
				.addConta(new ContaCorrete())
				.addConta(new ContaPoupanca())
		);
		ce.addTitular(
				new Titular("Shalon", "89745632100")
				.addConta(new ContaCorrete())
				.addConta(new ContaPoupanca())
		);
		ce.addTitular(
				new Titular("Julia", "8523654")
				.addConta(new ContaCorrete())
				.addConta(new ContaPoupanca())
		);
		
		
		ce.init();
	}
}
