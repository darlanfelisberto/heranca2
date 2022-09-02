package br.edu.iffar.ce.excecoes;

public class TitularNotFoundException  extends Exception{

	private static final long serialVersionUID = 1L;

	public TitularNotFoundException() {
		super("Titular não foi encontrado.");
	}
}
