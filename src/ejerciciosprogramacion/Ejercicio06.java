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
   public static void main(String [] args)throws IOException {

//      BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
String frase;
      frase=JOptionPane.showInputDialog("Ingrese una frase : ");
      String []Caracter=frase.split(" ");
      JOptionPane.showMessageDialog(null, frase);

      for(int i=Caracter.length-1;i>=0;i--){
          System.out.print(Caracter[i]+" ");
//          JOptionPane.showMessageDialog(null, Caracter[i]+ "");
      }
      

    }
    }

