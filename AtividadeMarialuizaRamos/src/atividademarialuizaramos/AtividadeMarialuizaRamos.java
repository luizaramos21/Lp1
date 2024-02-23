/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividademarialuizaramos;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class AtividadeMarialuizaRamos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3,media,rec,medF;
        Scanner tex = new
        Scanner(System.in);
        System.out.println("Informe a nota da primeira prova");
        n1=tex.nextInt();
        System.out.println("Informe a nota da segunda pova");
        n2=tex.nextInt();
        System.out.println("Informe a nota da terceira pova");
        n3=tex.nextInt();
        media=(n1+n2+n3)/3;
        System.out.println("Sua média:"+media);
        if(media>=7){
            System.out.println("Aprovado!;)");
        }
        else{
            System.out.println("Voce esta de recuperação!");
            System.out.println("Escreva a nota da recuperação:");
            rec=tex.nextInt();
            medF=(media+rec)/2;
            System.out.println("Media da recuperação:"+medF);
            if(medF>=5){
                System.out.println("Aprovado!;)");
            }
            else{
                System.out.println("Reprovado!:(");
            }
            
        }
        
    }
    
}
