/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.conglomerado.bancario;

/**
 *
 * @author sticdev30
 */
public interface Comunicacao {

    public void creditarValor(Conta c, double v);

    public void debitarValor(Conta c, double v);

    public double saldo(Conta c);
}
