package com.github.iarlo.livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.github.iarlo.livraria.model.Livro;
import com.github.iarlo.livraria.service.LivroService;
import java.util.List;

@Controller

public class InicioController {

    private final LivroService livroService;

    //Injeção do service
    public InicioController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping("/")
        public String index (Model model) {
            List<Livro> livroslidos = livroService.buscarLivrosLidos();
            List<Livro> livroslista = livroService.buscarLivrosLista();
            List<Livro> livrosaicionados = livroService.buscarLivrosAdicionados();

            model.addAttribute("livroslidos", livroslidos);
            model.addAttribute("livroslista", livroslista);
            model.addAttribute("livrosaicionados", livrosaicionados);

            return "index";

        }

}
