package com.github.iarlo.livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.github.iarlo.livraria.model.Livro;
import com.github.iarlo.livraria.service.LivrariaService;
import java.util.List;

@Controller
public class InicioController {

    private final LivrariaService livrariaService = new LivrariaService();

    @GetMapping("/")
    public String index(Model model) {
        List<Livro> livroslidos = livrariaService.listarTodos();
        List<Livro> livroslista = livrariaService.listarTodos();
        List<Livro> livrosaicionados = livrariaService.listarTodos();

        model.addAttribute("livroslidos", livroslidos);
        model.addAttribute("livroslista", livroslista);
        model.addAttribute("livrosadicionados", livrosaicionados);

        return "index";

    }

}
