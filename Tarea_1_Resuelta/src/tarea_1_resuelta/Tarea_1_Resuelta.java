/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_1_resuelta;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Tarea_1_Resuelta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tamaño del arrray
        String texto = JOptionPane.showInputDialog("Introduzca el tamano del arreglo");

        //Se inicia el arreglo
        int num[] = new int[Integer.parseInt(texto)];

        //Se llama el metodo rellenar
        rellenarNumAleatorioArray(num, 0, 9);

        //Se llama al metodo demostrar
        mostrarArray(num);
    }

    //Metodo de rellenar el arreglo con numeros aleatorios
    public static void rellenarNumAleatorioArray(int num[], int a, int b) {
        for (int i = 0; i < num.length; i++) //Se genera numero aleatorio entre los parametros asignados
        {
            num[i] = ((int) Math.floor(Math.random() * (a - b) + b));
        }
    }

    public static void mostrarArray(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.println("En el espacio " + i + " esta el valor: " + num[i]);
        }
    }

}
