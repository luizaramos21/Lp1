/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.Scanner;

public class JavaApplication29 {
    
   long cpf;
    String nome;
    int idade;
    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
       Pessoa p = new Pessoa();
        
        System.out.println("Digite o nome da pessoa");
        p.setNome(s.next());
        
        System.out.println("Digite o CPF da pessoa");
        p.setCpf(s.nextLong());
        
        System.out.println("Informe a idade da pessoa");
        p.setIdade(s.nextInt());
    }
    
}
