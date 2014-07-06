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
public class Ejercicio19 {
      public static int Binario(int numero){
            int r=0,c=0;
            int  exp, digito;
        double binario;
         
        
        while(numero<0);
        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2; 
                numero = numero/2;
                binario = binario + digito * Math.pow(10, exp);   
               if (digito==1) {
                c=c+1;
                }
  exp++;
        }
         int y = (int) binario; 
        JOptionPane.showMessageDialog(null, "El valor binario es " +y);
         JOptionPane.showMessageDialog(null, "El numero de 1 de este binario contiene " +c);
         return c;
       }
}
