package br.cefet.livraria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cefet.livraria.entities.Usuario;
import br.cefet.livraria.repositories.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;

	@GetMapping
	public List<Usuario> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Usuario findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}

	@PostMapping
	public Usuario insert(@RequestBody Usuario usuario) {
		return repository.save(usuario);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

	@PutMapping("/")
	public void update(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}

}
