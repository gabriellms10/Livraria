package gabriel.livraria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Titulo;
	private String Autor;
	private String Editora;

	public Livro() {

	}

	public Livro(long id, String titulo, String autor, String editora) {
		Id = id;
		Titulo = titulo;
		Autor = autor;
		Editora = editora;
	}

	public long getId() {
		return Id;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getEditora() {
		return Editora;
	}

	public void setEditora(String editora) {
		Editora = editora;
	}

}
