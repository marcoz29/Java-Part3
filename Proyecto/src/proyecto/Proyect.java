/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.ArrayList;

/**
 *
 * @author Marco.Rivera
 */
public class Proyect {
    // Atributos - Privados *
    private int libro; // Atributo llave o identificador
    private String accion;
    private String cienciaFiccion;
    private String cocina;
    private String drama;
    private String historia;
    private String matematicas;
    private String romance;
    

    // Propiedades de escritura - Públicos *
    public void SetLibro(int pLibro){
        this.libro = pLibro;
    }
    public void SetAccion(String pAccion) {
        this.accion = pAccion;
    }

    public void SetCienciaFiccion(String pCienciaFiccion) {
        this.cienciaFiccion = pCienciaFiccion;
    }

    public void SetCocina(String pCocina) {
        this.cocina = pCocina;
    }

    public void SetDrama(String pDrama) {
        this.drama = pDrama;
    }

    public void SetHistoria(String pHistoria) {
        this.historia = pHistoria;
    }

    public void SetMatematicas(String pMatematicas) {
        this.matematicas = pMatematicas;
    }

    public void SetRomance(String pRomance) {
        this.romance = pRomance;
    }

    // Propiedades de lectura - Públicos *
    public int GetLibro(){
        return this.libro;
    }
    public String GetAccion() {
        return this.accion;
    }

    public String GetCienciaFiccion() {
        return this.cienciaFiccion;
    }

    public String GetCocina() {
        return this.cocina;
    }

    public String GetDrama() {
        return this.drama;
    }

    public String GetHistoria() {
        return this.historia;
    }

    public String GetMatematicas() {
        return this.matematicas;
    }

    public String GetRomance() {
        return this.romance;
    }

    // Métodos CONSTRUCTORES
    // Constructor vacio
    public Proyect() {
    }

    // Constructor llave
    public Proyect(int pLibro) {
        this.libro = pLibro;
    }

    // Constructor  lleno
    public Proyect(int pLibro, String pAccion, String pCienciaFiccion, String pCocina, String pDrama, String pHistoria, String pMatematicas, String pRomance) {
        this.libro = pLibro;
        this.accion = pAccion;
        this.cienciaFiccion = pCienciaFiccion;
        this.cocina = pCocina;
        this.drama = pDrama;
        this.historia = pHistoria;
        this.matematicas = pMatematicas;
        this.romance = pRomance;
    }

    // Métodos para manipulación de información.
    public boolean Guardar() {
        // Consultar si el libro ya existe.
        Proyect myProyect = this.Consultar();

// Validar si el libro existe.
        if (myProyect == null) {
            // Si no existe el libro (o sea es null), se procede a guardarlo y retornar true.
            return Proyecto.Biblioteca.add(this);
        } else {
            // La consulta arrojó datos por lo que se detectó un duplicado se retorna false.
            return false;
        }
    }

    public boolean Actualizar() {
        // Consultar si el libro existe.
        Proyect myProyect = this.Consultar();

        // Validar si el libro existe.
        if (myProyect != null) {
            // Borramos el registro anterior del libro asociado a su nombre.
            Proyecto.Biblioteca.remove(myProyect);

            // Agregamos el registro actualizado.
            return Proyecto.Biblioteca.add(this);
        } else {
            return false;
        }
    }

    public boolean Eliminar() {
        // Consultar si el libro existe.
        Proyect myProyect = this.Consultar();

        // Validar si el libro existe.
        if (myProyect != null) {
            // Borramos el registro del libro asociado a su nombre.
            return Proyecto.Biblioteca.remove(myProyect);
        } else {
            return false;
        }
    }

    public Proyect Consultar() {
        // Declaro la variable local a utilizar como respuesta al proceso.
        Proyect myProyect = null;

        // Realizar la búsqueda del libro con la el nombre ingresado o (atributo llave).
        for (Proyect Registro : Proyecto.Biblioteca) {
            if (Registro.libro == (this.libro)) {
                myProyect = Registro;
                break;
            } else {
            }
        }

        return myProyect;
    }

    public ArrayList<Proyect> Listar() {
        // Retorna los valores de la lista.
        return Proyecto.Biblioteca;
    }
}
