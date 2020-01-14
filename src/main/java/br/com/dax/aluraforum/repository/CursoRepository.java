package br.com.dax.aluraforum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dax.aluraforum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nome);

}
