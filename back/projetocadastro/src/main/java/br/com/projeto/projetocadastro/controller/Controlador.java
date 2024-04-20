package br.com.projeto.projetocadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.projetocadastro.modelo.Usuario;
import br.com.projeto.projetocadastro.repositorio.IUsuario;


@RestController
@CrossOrigin(originPatterns = "*")
public class Controlador {

    @Autowired
    private IUsuario acao;

    @GetMapping("")
    public String boasvindas(){
        return "seja bem vindo, Desenvolvedor";
    }

    @GetMapping("/usuarios")
    public Iterable<Usuario> listadeusarios(){
        return acao.findAll();
    }

    @PostMapping("/cadastrar")
    public Usuario editarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioNovo = acao.save(usuario);
        return usuarioNovo;
    }


}
