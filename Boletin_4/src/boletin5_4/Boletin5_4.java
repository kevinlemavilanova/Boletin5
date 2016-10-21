/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;

/**
 *
 * @author klemavilanova
 */
public class Boletin5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome1 = "Pepe";
        String nome2 = "Pedro";
        float peso1 = 70.8f;
        float peso2 = 65.4f;
        if(peso1>peso2)
            System.out.println(nome1 +" pesa "+ (peso1-peso2) + " mas que "+ nome2);
        else
            System.out.println(nome2 +" pesa "+ (peso2-peso1) + " mas que "+ nome1);
    }
    
}
