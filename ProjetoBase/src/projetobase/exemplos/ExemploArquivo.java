/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobase.exemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author sticdev30
 */
public class ExemploArquivo {

    public static void main(String[] args) throws IOException {
//        FileWriter fw = 
//                new FileWriter(new File("C:/temp4/teste.txt"));
//        BufferedWriter bf = new BufferedWriter(fw);
//        bf.append("Dimmy");
//        bf.close();
//        fw.close();


        FileReader rd = new FileReader(new File("C:/temp4/teste.txt"));
        BufferedReader br = new BufferedReader(rd);
        
        while(br.ready()){
            String s = br.readLine();
            System.out.println(s);
        }
        
        br.close();
        
        rd.close();
        
        
    }
}
