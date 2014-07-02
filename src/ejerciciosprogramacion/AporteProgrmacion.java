/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosprogramacion;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AporteProgrmacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, opc;
        String S1="",S2="";
        Scanner ingreso = new Scanner(System.in);

        opc =menu();

        switch (opc) {
            case 1:
                System.out.println("Ejercicio 1 \nMira esta serie: 7, 6, 8, 4, 9, 2, 10, 0, 11, -2, ...\n"
                        + "Cree una función que recibe dos enteros: x e y. Si alguno de ellos es 0 o negativo, o si son mayores que 255,\n la función debe devolver -1"
                        + "De lo contrario, la función debe devolver la suma de los elementos X e Y de la serie.\n"
                        + "Por ejemplo: Si la función recibe x = 1, y = 3, se debería devolver: 15 \n(Debido a que la suma de la primera, más el tercer argumento es 7 +8 = 15).. Si la función recibe x = 8, y = 9, \nes conveniente devolver 11. (Debido a que la suma de la octava más el elemento noveno es 0 11 = 11).\n"
                        + "La función recibirá 2 enteros, y devuelve un entero.\n\n\n");

                System.out.println("Ingrese el valor de x");
                x = ingreso.nextInt();
                System.out.println("Ingrese el valor de y");
                y = ingreso.nextInt();

                System.out.println(" respuesta " + PrimerEjerccio(x, y));
                
                break;
            case 2:
                System.out.println("Ejercicio 2 \n Mira esta serie: 2, 2, 4, 12, 48, ... la semilla de esta serie fue el número 2\n Mira esta serie:. 3, 3, 6, 18, 72, ... la semilla de esta serie fue el número 3.\n"
                        + "Cree una función que recibe dos enteros: x, y  y. Si alguno de ellos es 0 o negativo,\n o si son mayores que 255, la función debe devolver -1\n"
                        + "La función debe devolver el elemento y de las series generadas por x.\n"
                        + "Por ejemplo, si la serie recibe x = 3, y = 4, es conveniente devolver 72, \nporque 72 es el cuarto elemento de la serie generado cuando x = 3.\n"
                        + "La función recibirá 2 enteros, y devuelve un entero.");
                System.out.println("Ingrese el valor de x");
                x = ingreso.nextInt();
                System.out.println("Ingrese el valor de y");
                y = ingreso.nextInt();

                System.out.println(" respuesta " + Ejerccio2(x, y));
              
                break;

            case 3:
                System.out.println("Ejercicio 3 \n Mira esta serie: 60, 30, 20, 15, 12 ... la semilla de esta serie fue el número 60.\n.Cree una función que recibe dos enteros: x, y y. Si alguno de ellos es 0 o negativo,\n o si son mayores que 255, la función debe devolver -1.\n"
                        + "La función debe devolver el elemento y de las series generadas por x.\nPor ejemplo: Si la función recibe x = 60, y = 3, devolverá 20,\n porque el 20 es el elemento 3 º en la serie genera cuando x = 60.\nLa función recibirá 2 enteros, devuelve un valor de punto flotante.");
                System.out.println("Ingrese el valor de x");
                x = ingreso.nextInt();
                System.out.println("Ingrese el valor de y");
                y = ingreso.nextInt();
                System.out.println(" respuesta " + Ejerccio3(x, y));
               
                break;

            case 4:

                System.out.println("Ejercicio 4 \n Dadas dos cadenas S1 y S2. Eliminar en S1 todos esos caracteres que se presentan en S2. \nDevolver un S1 limpio con los caracteres eliminados. Cualquier carácter se elimina tanto en mayúsculas como en minúsculas.\n"
                        + "Por ejemplo, dado:\n" +
"S1 = \"La vida es bella\" S2 = \"El santo\"\n" +
"La función debe devolver: \tvidb\nLa función recibirá 2 cadenas y devolver una cadena\n\n");
                
                System.out.println("Ingrese S1");
                S1=ingreso.next();
                System.out.println("Ingrese S2");
                S2=ingreso.next();
                System.out.println("S1="+S1+"\tS2"+S2);
                
                
                

                break;
            case 5:
                break;
            case 6:
                break;

            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;

            case 11:
                break;

            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;

        }

    }

    public static int PrimerEjerccio(int valorx, int valory) {
        int[] vector = new int[498];
        int i, par = 8, impar = 7, suma = 0;
        if (((valorx <= 0) || (valory <= 0)) || ((valorx > 255) || (valory > 255))) {
            return (-1);
        }
        for (i = 0; i < vector.length; i++) {
            if (i % 2 == 0) {

                vector[i] = par;
                par = vector[i] - 2;
            } else {

                vector[i] = impar++;
            }
        }
        for (i = 0; i < vector.length; i++) {
            suma = vector[valorx] + vector[valory];

        }
        return suma;
    }

    public static int Ejerccio2(int valorx, int valory) {
        //int[] vector = new int[498] ;
        int i, factorial = 1;
        if (((valorx <= 0) || (valory <= 0)) || ((valorx > 255) || (valory > 255))) {
            return (-1);
        }
        for (i = 1; i <= valory; i++) {
            factorial = factorial * i;
        }
        return valorx * factorial;
    }

    public static int menu() {
        int opcion = 0;
        Scanner op = new Scanner(System.in);
        do {
            System.out.println("\nSeleccione el ejercicio a revisar ingrese un número entre 1 y 24.para salir presione ingrese -1:\n ");
            opcion = op.nextInt();
        } while ((opcion > 25) || (opcion == 0) || (opcion < -2));
        return opcion;
    }

    public static float Ejerccio3(int valorx, int valory) {
        float res;
        if (((valorx <= 0) || (valory <= 0)) || ((valorx > 255) || (valory > 255))) {
            return (-1);
        }
        res=(float)valorx/valory;
        return res;
    }
}
