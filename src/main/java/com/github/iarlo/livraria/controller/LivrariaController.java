package com.github.iarlo.livraria.controller;

import com.github.iarlo.livraria.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivrariaController {

    @Autowired
    private LivroService livroService;

    // Listar livros
    @GetMapping
    public String listarLivros(Model model) {
        List<Livro> livros = livroService.listarTodos();
        model.addAttribute("livros", livros);
        return "lista-livros";
    }

    // Adicionar livro (GET para exibir formulário)
    @GetMapping("/novo")
    public String exibirFormularioAdicionar(Model model) {
        model.addAttribute("livro", new Livro());
        return "form-livro";
    }

    // Adicionar livro (POST para salvar)
    @PostMapping
    public String adicionarLivro(@ModelAttribute Livro livro) {
        livroService.salvar(livro);
        return "redirect:/livros";
    }

    // Editar livro
    @GetMapping("/editar/{id}")
    public String exibirFormularioEditar(@PathVariable Long id, Model model) {
        Livro livro = livroService.buscarPorId(id);
        model.addAttribute("livro", livro);
        return "form-livro";
    }

    @PostMapping("/editar/{id}")
    public String editarLivro(@PathVariable Long id, @ModelAttribute Livro livro) {
        livro.setId(id);
        livroService.atualizar(livro);
        return "redirect:/livros";
    }

    // Excluir livro
    @GetMapping("/delete/{id}")
    public String excluirLivro(@PathVariable Long id) {
        livroService.excluir(id);
        return "redirect:/livros";
    }

    // Visualizar detalhes
    @GetMapping("/{id}")
    public String visualizarDetalhes(@PathVariable Long id, Model model) {
        Livro livro = livroService.buscarPorId(id);
        model.addAttribute("livro", livro);
        return "detalhes-livro";
    }
}

