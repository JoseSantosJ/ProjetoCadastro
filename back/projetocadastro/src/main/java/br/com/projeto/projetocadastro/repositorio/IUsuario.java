package br.com.projeto.projetocadastro.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.projetocadastro.modelo.Usuario;


public interface IUsuario extends CrudRepository<Usuario, Integer>{
    
}
