/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.otavio.banco;

import br.com.faete.conglomerado.bancario.Conta;

/**
 *
 * @author sticdev30
 */
public class ContaO extends Conta{

    @Override
    public void imprimeSaldo() {
        System.out.println("Imprimindo saldo em O");
    }
    
}
