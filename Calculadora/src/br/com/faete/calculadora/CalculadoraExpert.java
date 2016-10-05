/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete.calculadora;

/**
 *
 * @author sticdev30
 */
public class CalculadoraExpert
        extends ModeloCalculadora {


    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        return a / b;
    }

    public double raiz(double a) {
        return Math.sqrt(a);
    }

    public double cubica(double a) {
        return Math.cbrt(a);
    }

    public double seno(double a) {
        return Math.sin(a);
    }

    public double cosseno(double a) {
        return Math.cos(a);
    }

    public double logBase10(double a) {
        return Math.log10(a);
    }

}
