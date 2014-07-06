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
public class Ejercicio08 {
     public static String ContarA(String frase){
       int c=0,longitud;
        
        frase=" "+ frase;         
        char[] frase1 =frase.toCharArray();        
        for (int i = 0; i< frase.length() ; i++)
        {
            if (frase1[i]=='A'||frase1[i]=='a') 
            {
                c=c+1;
                for (int j = i; j < frase.length(); j++) 
                {
                    if (frase1[j]==' ') 
                    {
                      i=j;
                      j=frase.length();                      
                    }   
                }                
            }            
        }        
        JOptionPane.showMessageDialog(null,frase);
        JOptionPane.showMessageDialog(null,"Hay "+c+ " palabras que tiene/n letras A");
        return frase;
    }
}
