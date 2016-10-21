/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_6;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ventas = Integer.parseInt(JOptionPane.showInputDialog("ventas"));
        if(ventas<=100)
            System.out.println("Baixo");
        else if(ventas>100 && ventas<=500)
            System.out.println("Medio");
        else if(ventas>500 && ventas<=1000)
            System.out.println("alto");
        else if(ventas>1000)
            System.out.println("primerira necesidade");
    }
    
}
