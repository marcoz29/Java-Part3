/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana10_metodos;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Semana10_metodos {
    //Variables globales
    static String[] meses = new String[12];
    static int mes;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llenamos nuestro vector 
        CargarVector();
        
        //LLamar el metodo de interaccion.
        Interaccion();
    }
    
    private static void CargarVector(){
        //Este metodo cargara el vector
        meses[0] = "Enero";
        meses[1] = "Febrero";
        meses[2] = "Marzo";
        meses[3] = "Abril";
        meses[4] = "Mayo";
        meses[5] = "Junio";
        meses[6] = "Julio";
        meses[7] = "Agosto";
        meses[8] = "Setiembre";
        meses[9] = "Octubre";
        meses[10] = "Noviembre";
        meses[11] = "Diciembre";
        System.out.print("Vector cargando correctamente");
    }
    
    private static void Interaccion(){
        //Variables locales del metodo
        String opcion = JOptionPane.showInputDialog("Ingrese el numero de mes");
    
        //Convertir la opcion a numero
        int busqueda = Integer.parseInt(opcion);
        
        //Llamo el metodo de buscar mes.
        String mesEncontrado = BuscarMes(busqueda);
        
        //Notificar al usuario del mes detectado
        JOptionPane.showConfirmDialog(null, "El mes encontrado es:" + mesEncontrado);
    }
    
    private static String BuscarMes(int busqueda){
        //Variables locales del metodo
        int mesReal = busqueda - 1;
        String respuesta = meses[mesReal];
        return respuesta;
    }
}