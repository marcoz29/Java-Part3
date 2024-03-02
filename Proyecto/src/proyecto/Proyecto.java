/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco.Rivera
 */
public class Proyecto {

    /* Declarar arrayList de los libros.
     * Esta estructura me permitirá almacenar todos los registros de los 
     * Libros que requiere la biblioteca del Rincon.
     */
    public static ArrayList<Proyect> Biblioteca = new ArrayList();
    private static String libro;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaraciones
        String menu = "************** Biblioteca.Rincon - Control de libros ************** \n"
                + "Menú principal - Digite una opción: \n"
                + "1 - Guardar un libro. \n"
                + "2 - Modificar un libro. \n"
                + "3 - Consultar un libro. \n"
                + "4 - Eliminar un libro. \n"
                + "5 - Listar los libros. \n"
                + "6 - Salir.";
        // Variable para almacenar la opción ingresada por el usuario.
        int opcion;
        boolean operacion;

        // Variables para solicitar datos del vehículo al usuario.
        int libro;
        String accion;
        String cienciaFiccion;
        String cocina;
        String drama;
        String historia;
        String matematicas;
        String romance;

        // Objetos
        Proyect myProyect;

        do {
            // Obtener la opción ingresada por el usuario del menú.            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            // Controlar las opciones.
            switch (opcion) {
                case 1: // Guardar un libro.
                    // Solicitamos los datos al usuario.
                    libro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de libro."));
                    accion = JOptionPane.showInputDialog("Ingrese un libro de accion.");
                    cienciaFiccion = JOptionPane.showInputDialog("Ingrese un libro de cienciaFiccion.");
                    cocina = JOptionPane.showInputDialog("Ingrese un libro de cocina.");
                    drama = JOptionPane.showInputDialog("Ingrese un libro de drama.");
                    historia = JOptionPane.showInputDialog("Ingrese un libro de historia.");
                    matematicas = JOptionPane.showInputDialog("Ingrese un libro de matematicas.");
                    romance = JOptionPane.showInputDialog("Ingrese el libro un Romance.");

                    // Creamos la instancia del objeto
                    myProyect = new Proyect(libro, accion, cienciaFiccion, cocina, drama, historia, matematicas, romance);

                    // Evaluamos la operación.
                    operacion = myProyect.Guardar();
                    if (operacion == true) {
                        JOptionPane.showMessageDialog(null, "Libro ingresado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya existe un libro registrado con el nombre: " + libro);
                    }
                    break;
                case 2: // Actualizar un libro.
                    // Solicitamos los datos al usuario (libro).
                    libro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de libro"));

                    // Creamos la instancia del objeto.
                    myProyect = new Proyect(libro);

                    // Solicitar los otros datos al usuario.
                    accion = JOptionPane.showInputDialog("Ingrese el libro de accion.");
                    cienciaFiccion = JOptionPane.showInputDialog("Ingrese el libro de cienciaFiccion.");
                    cocina = JOptionPane.showInputDialog("Ingrese el libro de cocina.");
                    drama = JOptionPane.showInputDialog("Ingrese el libro de drama.");
                    historia = JOptionPane.showInputDialog("Ingrese el libro de historia.");
                    matematicas = JOptionPane.showInputDialog("Ingrese el libro de matematicas.");
                    romance = JOptionPane.showInputDialog("Ingrese el libro de romance.");

                    // Asignamos los nuevos valores.
                    myProyect.SetAccion(accion);
                    myProyect.SetCienciaFiccion(cienciaFiccion);
                    myProyect.SetCocina(cocina);
                    myProyect.SetDrama(drama);
                    myProyect.SetHistoria(historia);
                    myProyect.SetMatematicas(matematicas);
                    myProyect.SetRomance(romance);

                    // Actualizamos los libros.
                    operacion = myProyect.Actualizar();

                    // Evaluar la operación
                    if (operacion) { // True cuando actualiza
                        JOptionPane.showMessageDialog(null, "Libro actualizado correctamente.");
                    } else { // False cuando no existe
                        JOptionPane.showMessageDialog(null, "No existe un libro registrado con el nombre: " + libro);
                    }
                    break;
                case 3: // Consultar un vehículo.
                    // Solicitamos los datos al usuario (el libro de la biblioteca).
                    libro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del libro de la biblioteca."));

                    // Creamos la instancia del objeto
                    myProyect = new Proyect(libro);

                    // Consultamos el vehículo.
                    myProyect = myProyect.Consultar();

                    // Evualuamos el resultado.
                    if (myProyect != null) {
                        String informacion = "-- Datos de libros. -- \n"
                                + "Libro: " + myProyect.GetLibro() + "\n"
                                + "Accion: " + myProyect.GetAccion() + "\n"
                                + "CienciaFiccion: " + myProyect.GetCienciaFiccion() + "\n"
                                + "Cocina: " + myProyect.GetCocina() + "\n"
                                + "Drama: " + myProyect.GetDrama() + "\n"
                                + "Historia: " + myProyect.GetHistoria() + "\n"
                                + "Matematicas: " + myProyect.GetMatematicas() + "\n"
                                + "Romance: " + myProyect.GetRomance() + "\n";

                        JOptionPane.showMessageDialog(null, informacion);
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe un libro registrado con el nombre: " + libro);
                    }
                    break;
                case 4: // Eliminar un vehículo.
                    // Solicitamos los datos al usuario.
                    libro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el libro de la biblioteca."));

                    // Creamos la instancia del objeto
                    myProyect = new Proyect(libro);

                    // Evaluamos la operación.
                    operacion = myProyect.Eliminar();
                    if (operacion) {
                        JOptionPane.showMessageDialog(null, "Libro eliminado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe un libro registrado con la nombre: " + libro);
                    }
                    break;
                case 5: // Listar los vehículos existentes
                    // Creamos la instancia del objeto
                    myProyect = new Proyect();
                    String listado = "-- Libros registrados. -- \n";

                    // Recorremos los vehpiculos registrados.
                    for (Proyect libros : myProyect.Listar()) {
                        listado += "Libro: " + libros.GetLibro() + "\n"
                                + "Accion: " + libros.GetAccion() + "\n"
                                + "CienciaFiccion: " + libros.GetCienciaFiccion() + "\n"
                                + "Cocina: " + libros.GetCocina() + "\n"
                                + "Drama: " + libros.GetDrama() + "\n"
                                + "Historia: " + libros.GetHistoria() + "\n"
                                + "Matematicas: " + libros.GetMatematicas() + "\n"
                                + "Romance: " + libros.GetRomance() + "\n";
                    }

                    // Mostramos el resultado de los vehículos existentes.
                    JOptionPane.showMessageDialog(null, listado);
                    break;
            }
        } while (opcion <= 5);
    }

}