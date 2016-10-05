/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.otavio.banco;

import br.com.faete.conglomerado.bancario.Comunicacao;
import br.com.faete.conglomerado.bancario.Conta;

/**
 *
 * @author sticdev30
 */
public class ComunicacaoOtavioBank
        implements Comunicacao {

    @Override
    public void creditarValor(Conta c, double v) {
        System.out.println("Creditando "
                + "valor na conta"
                + c.numero);
    }

    @Override
    public void debitarValor(Conta c, double v) {
        System.out.println("Debitando "
                + "valor na conta"
                + c.numero);
    }

    @Override
    public double saldo(Conta c) {
        return c.getSaldo();
    }

}
