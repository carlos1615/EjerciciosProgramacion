/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Ejercicio10 {
    public static void main(String args[]) {
        int x,y,S=0;
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número en X"));
        y=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un número en Y"));
         
        for (int i = x; i <= y; i++) {
            S=0; 
            for (int j = 1  ; j < i; j++) {
                if ((i % j)==0) {
                    S =S+j;
                }
                if ((i==y)&&((i%j)!=0)) {
                    S=0; 
                }
            }
            if (S==i) {
                JOptionPane.showMessageDialog(null, "El número perfecto menor entre "+ x+" y "+y+ " es = " +S);
                i=y;
            }
        }
            if(S==0) {
                JOptionPane.showMessageDialog(null, "no existen números perfectos ente "+ x+" y "+y);
            }
    } 
}


