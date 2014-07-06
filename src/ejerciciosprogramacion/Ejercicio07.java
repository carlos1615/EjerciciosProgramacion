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
public class Ejercicio07 {
    public static String MayúsculasMinúsculas(String frase){
        int codigo;
        char x;
        String a="";
        String  aux;
        int longitud1 = frase.length();    
        char [] frase1= frase.toCharArray();    
        for (int i = 0; i < longitud1; i++)
        {
            if (frase.codePointAt(i)>=65 && frase.codePointAt(i)<=90)
            {
                codigo = frase.codePointAt(i);
                codigo =codigo+32;
                x=(char)codigo; 
                a=a+x;                    
            }
            else                  
            {
                a=a+frase1[i];                    
            }          
        }
        JOptionPane.showMessageDialog(null,a);
        return a;
    }
        
}
