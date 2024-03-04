package br.cefet.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cefet.livraria.entities.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

}
