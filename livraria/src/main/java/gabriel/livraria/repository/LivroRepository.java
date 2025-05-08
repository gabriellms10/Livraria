package gabriel.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gabriel.livraria.entity.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
