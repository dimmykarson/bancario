/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobase.livraria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import projetobase.beans.Livro;

/**
 *
 * @author sticdev30
 */
public class ClassePrincipal {

    static Scanner s = new Scanner(System.in);
    static List<Livro> livros = new ArrayList<Livro>();
    static int codigoBase = 1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("========= Menu ============");
            System.out.println("1 - Cadastrar Livros");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Remover um livro");
            System.out.println("0 - Sair");
            int escolha = s.nextInt();
            switch (escolha) {
                case 0:
                    System.out.println("Saindo, tchau!");
                    return;
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    removerLivro();
                    break;
            }

        }

    }

    private static void cadastrarLivro() {
        System.out.println("Cadastrando Livros...");
        System.out.print("Informe o nome do livro: ");
        String nomeLivro = s.next();
        System.out.print("Informe o autor do livro: ");
        String nomeAutor = s.next();
        Livro l = new Livro();
        l.setTitulo(nomeLivro);
        l.setAutor(nomeAutor);
        l.setCodigo(codigoBase);
        codigoBase++;
        livros.add(l);
        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void listarLivros() {
        System.out.println("Listando Livros...");
        for (Livro l : livros) {
            System.out.println(l.getCodigo() + " " + l.getTitulo() + " (" + l.getAutor() + ")");
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

}
