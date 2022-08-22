
public class Main {
	
	public static void main(String [] a) {
		ContaImp c = new ContaImp();
		c.setNome("Malaquias");
		c.setTipo("Corrente");
		c.mostraTipo();
		c.mostrarSaldo();
		
		ContaImp c2 = new ContaImp();
		c2.setNome("Magda");
		c2.setTipo("Corrente");
		c2.mostraTipo();
		c2.mostrarSaldo();
		
		ContaImp c3 = new ContaImp();
		c3.setNome("Julia");
		c3.setTipo("Pupança");
		c3.mostraTipo();
		c3.mostrarSaldo();

		ContaImp c4 = new ContaImp();
		c4.setNome("Shalom");
		c4.setTipo("Corrente");
		c4.mostraTipo();
		c4.mostrarSaldo();

	}

}
