package br.cefet.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cefet.livraria.entities.Livro;

public interface LivroRepository extends JpaRepository <Livro, Long> {

}
