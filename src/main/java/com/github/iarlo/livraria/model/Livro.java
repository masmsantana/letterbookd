package com.github.iarlo.livraria.model;

public class Livro extends BaseModel {

    private String titulo;
    private String autor;
    private String descricao;
    private List<Review> reviews = new ArrayList<>();
    
    public Livro(String titulo, String autor, String descricao) {
        this.titulo = titulo;
        this.autor = autor;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Review> getReview() {
        return reviews;
    }

    public void addReview(Review review) {
    this.reviews.add(review);
    }
}
