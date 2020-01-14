package br.com.dax.aluraforum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dax.aluraforum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	List<Topico> findByCursoNome(String nomeCurso);

}
