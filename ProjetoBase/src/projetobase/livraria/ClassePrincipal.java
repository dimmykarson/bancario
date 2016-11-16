/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobase.livraria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import projetobase.beans.Livro;
import projetobase.estudo.exceptions.ValidacaoDeLivros;
import projetobase.exceptions.ValidacaoDeLivrosException;
import projetobase.util.BancoDeDados;

/**
 *
 * @author sticdev30
 */
public class ClassePrincipal {

    static Scanner s = new Scanner(System.in);
    static List<Livro> livros = new ArrayList<>();
    static int codigoBase = 1;
    static File arquivo = new File("C:/temp4/bancoDeDados.txt");

    public static void main(String[] args)
            throws IOException, ValidacaoDeLivrosException {
        BancoDeDados.lerArquivo(arquivo, livros);
        while (true) {
            System.out.println("========= Menu ============");
            System.out.println("1 - Cadastrar Livros");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Remover um livro");
            System.out.println("4 - Gravar Lista");
            System.out.println("5 - Recarregar Lista");
            System.out.println("0 - Sair");
            int escolha = s.nextInt();
            switch (escolha) {
                case 0:
                    System.out.println("Gravando dados!");
                    BancoDeDados.gravarLista(arquivo, livros);
                    System.out.println("Saindo, tchau!");
                    return;
                case 1:
                    cadastrarLivro();
                    BancoDeDados.escreverELer(arquivo, livros);
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    removerLivro();
                    BancoDeDados.escreverELer(arquivo, livros);
                    break;
                case 4:
                    BancoDeDados.gravarLista(arquivo, livros);
                    break;
                case 5:
                    BancoDeDados.lerArquivo(arquivo, livros);
                    break;
            }
        }
    }

    private static void cadastrarLivro() 
            throws ValidacaoDeLivrosException {
        System.out.println("Cadastrando Livros...");
        System.out.print("Informe o nome do livro: ");
        String nomeLivro = s.next();
        System.out.print("Informe o autor do livro: ");
        String nomeAutor = s.next();
        System.out.print("Qual a quantidade? ");
        int qt = s.nextInt();
        System.out.print("Qual a ISBN? ");
        String isbn = s.next();
        Livro l = new Livro();
        l.setTitulo(nomeLivro);
        l.setAutor(nomeAutor);
        l.setCodigo(codigoBase);
        l.setQtNoEstoque(qt);
        l.setIsbn(isbn);
        ValidacaoDeLivros.verificaLivro(l);

        codigoBase++;
        Livro l2 = testeDeUnidade(l);
        if (l2 == null) {
            livros.add(l);
            System.out.println("Livro cadastrado com sucesso!");
        } else {
            l2.setQtNoEstoque(l2.getQtNoEstoque() + l.getQtNoEstoque());
            System.out.println("Já existe um livro! Aumentando estoque!");
        }
    }

    private static void listarLivros() {
        System.out.println("Listando Livros...");
        for (Livro l : livros) {
            System.out.println(l.getCodigo() + " " + l.getTitulo() + " (" + l.getAutor() + ")" + "-" + l.getQtNoEstoque() + "-");
        }
    }

    private static void removerLivro() {
        System.out.println("Removendo Livro...");
        listarLivros();
        System.out.println("Qual livro você deseja remover? (selecione o código, digite -1 para todos!)");
        int escolha = s.nextInt();
        if (escolha == -1) {
            livros.clear();
        } else {
            Livro livroParaRemover = null;
            for (Livro l : livros) {
                if (l.getCodigo() == escolha) {
                    livroParaRemover = l;
                    break;
                }
            }
            if (livroParaRemover != null) {
                livros.remove(livroParaRemover);
                System.out.println("Livro removido com sucesso!");
            } else {
                System.out.println("Livro não listado!");
            }

        }
    }

    private static Livro testeDeUnidade(Livro l) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(l.getTitulo())
                    && livro.getAutor().equals(l.getAutor())) {
                return livro;
            }
        }
        return null;
    }
}
