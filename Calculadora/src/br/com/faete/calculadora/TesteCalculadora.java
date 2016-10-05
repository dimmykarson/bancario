/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.calculadora;

import java.util.Scanner;

/**
 *
 * @author sticdev30
 */
public class TesteCalculadora {

    public static void main(String[] args) {
        CalculadoraExpert ce = new CalculadoraExpert();

        while (true) {
            System.out.println("Escolha a opção:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("0 - sair");

            int opcao = new Scanner(System.in).nextInt();

            if (opcao == 1) {
                System.out.println("Digite o primeiro operador");
                double a = new Scanner(System.in).nextDouble();
                System.out.println("Digite o segundo operador");
                double b = new Scanner(System.in).nextDouble();
                double resultado = ce.somar(a, b);
                System.out.println("Resultado é: " + resultado);
            } else if (opcao == 2) {
                System.out.println("Digite o primeiro operador");
                double a = new Scanner(System.in).nextDouble();
                System.out.println("Digite o segundo operador");
                double b = new Scanner(System.in).nextDouble();
                double resultado = ce.subtrair(a, b);
                System.out.println("Resultado é: " + resultado);
            } else if (opcao == 0) {
                break;
            }

        }
        System.out.println("Finalizando...");
        System.out.println("Finalizando...");
        System.out.println("Finalizando...");
        System.out.println("Finalizando...");
        System.out.println("Finalizando...");
        System.out.println("Finalizando...");
        System.out.println("Finalizando...");
        System.out.println("Finalizando...");
        System.out.println("Finalizando...");
        System.out.println("Finalizando...");
        System.out.println("Finalizando...");
        System.out.println("Finalizando...");
        System.out.println("Finalizando...");
        System.out.println("Finalizando...");
        System.out.println("Finalizando...");

    }
}
