/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// EJERCICIO 2
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Numero1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Numero2"));
        
        if(n1>=n2)
            System.out.println("Resta: "+ (n1-n2));
        
        System.out.println("Suma: "+ (n1+n2));
    }
    
}
