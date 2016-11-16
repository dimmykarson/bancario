/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobase.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author sticdev30
 */
public class Teste {

    static List<Produto> vendidos;

    public static void main(String[] args) {
        vendidos = new ArrayList<>();
        vendidos.add(new Produto("Farinha", 10));
        vendidos.add(new Produto("Arroz", 0));
        vendidos.add(new Produto("Carne", 7));
        vendidos.add(new Produto("Cerveja", 2));
        vendidos.add(new Produto("Rapadura", 18));

//        System.out.println("O mais vendido é: "
//                + maisVendido(vendidos).getDescricao());
        Collections.sort(vendidos);

        Produto p = vendidos.get(0);

        System.out.println("O mais vendido é: "
                + p.getDescricao());
    }

    private static Produto maisVendido(List<Produto> ps) {
        Produto pAux = null;
        for (Produto p : ps) {
            if (pAux == null) {
                pAux = p;
            } else if (p.getQtVendidos()
                    > pAux.getQtVendidos()) {
                pAux = p;
            }
        }
        return pAux;
    }

    private static class Produto implements Comparable<Produto> {

        private String descricao;
        private double qtVendidos;

        public Produto(String descricao, double qtVendidos) {
            this.descricao = descricao;
            this.qtVendidos = qtVendidos;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public double getQtVendidos() {
            return qtVendidos;
        }

        public void setQtVendidos(double qtVendidos) {
            this.qtVendidos = qtVendidos;
        }

        @Override
        public int compareTo(Produto o) {
            if (this.getQtVendidos() < o.getQtVendidos()) {
                return 1;
            } else {
                return -1;
            }
        }

    }

}
