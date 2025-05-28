package com.aula.front.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import java.util.List;


@Controller
@RequestMapping("/")
public class usuariocontroller {
    @Autowired
    private UserRepository usuariorepositorio2;

    public String usuariocontroller(Model model) {// model é atributo do springboot}
        model.addAttribute("usuariocontroller", "Bem vindo(a) a Primeira Página do site!");
        return "primeiraPagina";
    }
    @GetMapping("info")
    public String infoUsuario(Model model) {
        List<usuariomodel> pessoa = usuariorepositorio2.findAll();
                return "candidate/info";
    }


    @GetMapping("/login ")
    public String loginUsuario() {
        return "login";
    }

    @PostMapping("/create")
    public String cadastroUsuario(Model model, Pessoa pessoa){

        System.out.println(pessoa.nome);
        System.out.println(pessoa.email);
        System.out.println(pessoa.usuario);

        model.addAttribute("pessoa", pessoa);
        return "candidate/info";
    }

    record Pessoa (String nome, String email, String usuario){}

}
