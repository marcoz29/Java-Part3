/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco Rivera
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int tamano; //variable para almacenar
        tamano = Integer.parseInt(JOptionPane.showInputDialog("Defina el tamano del array:")); //usuario ingresa el tamano del array
        int num[] = new int[tamano]; //se inicializa el array
        
        rellenarArray(num); //aqui se rellena
        
    }
    public static void rellenarArray(int lista[]){
        for(int i = 0; i<lista.length; i++){
        int a = (int)Math.floor(Math.random()*9+0);
            System.out.println("En el espacio " + i + " esta el valor: " + a);

            }//Fin del metodo rellenarArray
        }
}
