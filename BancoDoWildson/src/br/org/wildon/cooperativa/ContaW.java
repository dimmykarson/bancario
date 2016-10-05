/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.wildon.cooperativa;

import br.com.faete.conglomerado.bancario.Conta;

/**
 *
 * @author sticdev30
 */
public class ContaW extends Conta {

    @Override
    public void imprimeSaldo() {
        System.out.println("Imprimindo saldo em W");
    }

}
