package gabriel.livraria.exceptions;

public class EntidadeNaoEncontradaExcepition extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EntidadeNaoEncontradaExcepition(String msg) {
		super(msg);
	}
}
