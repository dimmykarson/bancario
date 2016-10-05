/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mobile;

import br.com.faete.conglomerado.bancario.Conta;
import br.com.otavio.banco.ContaO;
import br.org.wildon.cooperativa.ContaW;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sticdev30
 */
public class Apresentacao {

    public static void main(String[] args) {
        List<Conta> lista
                = new ArrayList<>();

        
        Conta contaDaniel = new ContaW();
        contaDaniel.setNumero(1212L);
        contaDaniel.setSaldo(12);

        Conta contaLucas = new ContaO();
        contaLucas.setNumero(132L);
        contaLucas.setSaldo(2.75);

        
        lista.add(contaLucas);
        lista.add(contaDaniel);

//        lista.size();
//
//        int tam = lista.size();
//        for (int i = 0; i < tam; i++) {
//            Conta c = lista.get(i);
//            System.out.println(c.getNumero() + " - Saldo:" + c.getSaldo());
//        }

        for (Conta c : lista) {
            System.out.println(c.getNumero() + " - Saldo:" + c.getSaldo());
        }

    }
}
