/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobase.beans;

/**
 *
 * @author sticdev30
 */
public class Livro {

    private int codigo;
    private String titulo;
    private String autor;
    private String isbn;
    private int qtPaginas;
    private int qtNoEstoque;

    public int getQtNoEstoque() {
        return qtNoEstoque;
    }

    public void setQtNoEstoque(int qtNoEstoque) {
        this.qtNoEstoque = qtNoEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQtPaginas() {
        return qtPaginas;
    }

    public void setQtPaginas(int qtPaginas) {
        this.qtPaginas = qtPaginas;
    }

}
