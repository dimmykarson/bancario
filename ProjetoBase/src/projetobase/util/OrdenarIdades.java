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
public class OrdenarIdades {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Otavio", 29.4));
        pessoas.add(new Pessoa("Daniel", 30.8));
        pessoas.add(new Pessoa("Dimmy", 29.9));
        pessoas.add(new Pessoa("Luiz", 20.9));

        Collections.sort(pessoas);

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

    }

    private static class Pessoa implements Comparable<Pessoa> {

        private String nome;
        private double idade;

        public Pessoa(String nome, double idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getIdade() {
            return idade;
        }

        public void setIdade(double idade) {
            this.idade = idade;
        }

        @Override
        public int compareTo(Pessoa o) {
            if (this.idade < o.getIdade()) {
                return 1;
            } else if (this.idade > o.getIdade()) {
                return -1;
            } else {
                return 0;
            }

        }

        @Override
        public String toString() {
            return "Pessoa{" + "nome=" + nome + ", idade=" + idade + '}';
        }

    }
}
