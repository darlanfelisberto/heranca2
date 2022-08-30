package br.edu.iffar.ce;
import java.util.ArrayList;

import br.edu.iffar.ce.models.ContaCorrete;
import br.edu.iffar.ce.models.ContaImp;
import br.edu.iffar.ce.models.ContaPoupanca;

public class Main {
	
	public static void main(String [] a) {
		ContaImp c = new ContaPoupanca("Malaquias");
		c.depositar(500);
		c.mostrarSaldo();
		
		ContaImp c2 = new ContaCorrete("Magda");
		c2.depositar(400);
		c2.mostrarSaldo();
		
		ContaImp c3 = new ContaPoupanca("Julia");
		c3.depositar(300);
		c3.mostrarSaldo();
		c3.mostrarTipo();
		
		ContaImp c4 = new ContaCorrete("Shalom");
		c4.depositar(200);
		c4.sacar(10);
		c4.mostrarSaldo();
		c4.mostrarTipo();
		
		ArrayList<String> l = new ArrayList<>();
		
		for(long q = 0;;q ++) {
			l.add(q + "" +q);
		}
		
	}

}
