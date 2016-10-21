/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// EJERCICIO 1
        int n = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
        if(n>0) System.out.println(n + " e positivo");
    }
    
}
