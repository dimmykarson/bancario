/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobase.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import projetobase.beans.Livro;

/**
 *
 * @author sticdev30
 */
public class BancoDeDados {

    public static void escreverELer(File arquivo, List<Livro> livros) throws IOException {
        gravarLista(arquivo, livros);
        lerArquivo(arquivo, livros);
    }

    public static void gravarLista(File arquivo, List<Livro> livros) throws IOException  {
        FileWriter fw = new FileWriter(arquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Livro livro : livros) {
            bw.append(livro.getCodigo() + ";");
            bw.append(livro.getTitulo() + ";");
            bw.append(livro.getAutor() + ";");
            bw.append(livro.getIsbn() + ";");
            bw.append(livro.getQtPaginas() + ";");
            bw.append(livro.getQtNoEstoque() + "\n");
        }
        bw.close();
        fw.close();
    }

    public static void lerArquivo(File arquivo, List<Livro> livros) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        livros.clear();
        while (br.ready()) {
            String linha = br.readLine();
            String[] dados = linha.split(";");
            Livro l = new Livro();
            l.setCodigo(Integer.parseInt(dados[0]));
            l.setTitulo(dados[1]);
            l.setAutor(dados[2]);
            l.setIsbn(dados[3]);
            l.setQtPaginas(Integer.parseInt(dados[4]));
            l.setQtNoEstoque(Integer.parseInt(dados[5]));
            livros.add(l);
        }
        
        Collections.sort(livros);

        br.close();
        fr.close();
    }

}
