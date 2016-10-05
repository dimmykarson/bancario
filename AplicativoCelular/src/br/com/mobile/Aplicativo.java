/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mobile;

import br.com.faete.conglomerado.bancario.Comunicacao;
import br.com.faete.conglomerado.bancario.Conta;
import br.com.otavio.banco.ComunicacaoOtavioBank;
import br.com.otavio.banco.ContaO;
import br.org.wildon.cooperativa.ContaW;
import br.org.wildon.cooperativa.ConversaComCentral;
import java.util.Scanner;

/**
 *
 * @author sticdev30
 */
public class Aplicativo {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Tratar com Otavio Bank");
            System.out.println("2 - Tratar com Cooperativa Wildson");
            System.out.println("0 - Sair");
            
            int opcao = s.nextInt();
            Comunicacao con = null;
            Conta conta = null;
            if (opcao == 0) {
                System.out.println("Saíndo...");
                break;
            }
            switch (opcao) {
                case 1:
                    System.out.println("Trabando com Otavio bank");
                    con = new ComunicacaoOtavioBank();
                    conta = new ContaO();
                    break;
                case 2:
                    System.out.println("Trabando com Cooperativa Wildson");
                    con = new ConversaComCentral();
                    conta = new ContaW();
                    break;
            }
            if (con == null) {
                continue;
            }
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Enviar dinheiro");
            System.out.println("2 - Debitar dinheiro");
            System.out.println("3 - Saldo da conta");
            System.out.println("0 - Sair desse menu");
            int opcao2 = s.nextInt();
            System.out.println("Informe o número da conta");
            long numeroDaConta = s.nextLong();
            conta.setNumero(numeroDaConta);
            if (opcao2 == 0) {
                continue;
            }
            switch (opcao2) {
                case 1:
                    System.out.println("Qual o montante?");
                    double credito = s.nextDouble();
                    con.creditarValor(conta, credito);
                    break;
                case 2:
                    System.out.println("Qual o montante?");
                    double debito = s.nextDouble();
                    con.debitarValor(conta, debito);
                    break;
                case 3:
                    System.out.println("Imprimindo saldo");
                    System.out.println(con.saldo(conta));
                    break;
            }
            
        }
        
    }
}
