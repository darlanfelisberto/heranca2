
public class ContaImp implements Conta,Comparable<ContaImp> {
	private static int sequencial;

	private int id;
	private float saldo;
	private String nome;
	private String tipo;

	public ContaImp() {
		this.id = ContaImp.getSequencial();
	}

	public static synchronized int getSequencial() {
		return ++sequencial;
	}

	public boolean sacar(float valor) {
		this.saldo -= valor;
		return true;
	}

	public void depositar(float valor) {
		this.saldo = saldo + valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void mostrarSaldo() {
		System.out.println("A conta n° " + this.id + ", Saldo: " + this.saldo);
	}
	
	public void mostraTipo() {
		System.out.println("Tipo " + this.tipo);
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int compareTo(ContaImp o) {
		if(this.id>0) {
			return 1;
		}
		if(this.id<0) {
			return 1;
		}
		return 0;
	}
}