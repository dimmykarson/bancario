/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobase.estudo.exceptions;

import projetobase.beans.Livro;
import projetobase.exceptions.ValidacaoDeLivrosException;

/**
 *
 * @author sticdev30
 */
public class ValidacaoDeLivros {

    public static void verificaLivro(Livro livro)
            throws ValidacaoDeLivrosException {
        boolean existeErro = false;

        if (livro == null) {
            existeErro = true;
        }

        System.out.println(livro.getIsbn());
        if (livro.getIsbn() == null
                || livro.getIsbn() == ""
                || livro.getIsbn().equals("0")) {
            existeErro = true;
        }

        if (existeErro) {
            throw new ValidacaoDeLivrosException("O livro não passou nos teste");
        }

    }
}
