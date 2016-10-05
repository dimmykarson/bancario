/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.wildon.cooperativa;

import br.com.faete.conglomerado.bancario.Comunicacao;
import br.com.faete.conglomerado.bancario.Conta;
import java.util.Random;

/**
 *
 * @author sticdev30
 */
public class ConversaComCentral
        implements Comunicacao {

    @Override
    public void creditarValor(Conta c, double v) {
        //Consultar do banco
        //Enviar recibo
        int r = new Random().nextInt();
        r /= 100;
        c.setSaldo(c.getSaldo() + r + v);
        System.out.println("Conta do cooperado atualizada");
    }

    @Override
    public void debitarValor(Conta c, double v) {
//Consultar do banco
        //Enviar recibo
        int r = new Random().nextInt();
        r /= 10;
        c.setSaldo(c.getSaldo() - r - v);
    }

    @Override
    public double saldo(Conta c) {
        return c.getSaldo() + 10;
    }

}
