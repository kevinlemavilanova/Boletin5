/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_7;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Opcion"));
        switch (opcion){
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("lado"));
                System.out.println(lado*lado);
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("altura"));                
                System.out.println(altura*base/2);
                break;
            case 3:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("radio"));
                System.out.println(Math.PI * Math.pow(radio, 2) );
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
            }
        }   
    }
