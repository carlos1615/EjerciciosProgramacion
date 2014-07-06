/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Ejercicio06 {
   public static String orden_inverso(String frase)throws IOException {
       String f = " ";

//      BufferedReader a=new BufferedReader(new InputStreamReader(System.in));

      
      String []Caracter=frase.split(" ");
      JOptionPane.showMessageDialog(null, frase);

      for(int i=Caracter.length-1;i>=0;i--){
           f =f + Caracter [i] + " ";
//       
           
     }
      JOptionPane.showMessageDialog(null, f);
       return f;
      

    }
   
    }

