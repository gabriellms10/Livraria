package gabriel.livraria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gabriel.livraria.entity.Livro;
import gabriel.livraria.exceptions.EntidadeNaoEncontradaExcepition;
import gabriel.livraria.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;

	public List<Livro> listar() {
		List<Livro> livros = repository.findAll();
		return livros;

	}

	public Livro buscarOuFalhar(Long id) {
		return repository.findById(id).orElseThrow(() -> new EntidadeNaoEncontradaExcepition(
				String.format("Não existe um cadastro de livro de codigo %d.", id)));
	}
}
