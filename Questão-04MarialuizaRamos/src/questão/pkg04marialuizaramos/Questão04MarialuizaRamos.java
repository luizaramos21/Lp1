/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg04marialuizaramos;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Questão04MarialuizaRamos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0, num;
        Scanner teclado = new Scanner(System.in);
            System.out.println("Informe um valor inteiro maior ou igual a 0:");
            num= teclado.nextInt();
            if(num == 0){ 
                cont = 1;
            }
            else{
                while(num > 0){
                    num/=10;
                    cont++;
                }
        }
        System.out.println("A quantidade de digitos desse numero é:"+cont);    
    }
    
       
