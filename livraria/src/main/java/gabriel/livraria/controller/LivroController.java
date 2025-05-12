package gabriel.livraria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gabriel.livraria.entity.Livro;
import gabriel.livraria.exceptions.EntidadeNaoEncontradaExcepition;
import gabriel.livraria.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	private LivroService service;

	@GetMapping("/id")
	public List<Livro> listar() {
		List<Livro> livros = service.listar();
		return livros;
	}

	public ResponseEntity<Livro> buscar(@PathVariable Long id) {

		try {
			Livro livro = service.buscarOuFalhar(id);
			return ResponseEntity.ok(livro);
		} catch (EntidadeNaoEncontradaExcepition e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

}
