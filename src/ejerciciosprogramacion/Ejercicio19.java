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
    public static void main(String[] args){
            int r=0,c=0;
            
        int numero, exp, digito;
        double binario;
        

        do{  
            int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor en X"));
            numero=x;
        }while(numero<0);

        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;            
                binario = binario + digito * Math.pow(10, exp);   
                exp++;
                numero = numero/2;
        }
        int y = (int) binario; 
        
            
        
//        System.out.printf("Binario: %.0f %n", binario);
        
        JOptionPane.showMessageDialog(null, "El valor binario es " +y);
       
        
           
 
                
            
    }
}
