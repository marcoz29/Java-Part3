package semana8_estructura_de_control;

/**
 *
 * @author Marco
 * @email 208460031@castrocarazo.ac.cr
 */
public class Semana8_estructura_de_control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Estructura de control de tipo seleccion
        if (10 > 5) {
            //Sentencia #1
        }
        
        if (10 > 12) {
            //Sentencia #1
        } else {
            //Sentencia #2
        }
        
        if (15 == 10) {
            //Sentencia #1
        } else if (15 == 8){
            //Sentencia #2
        } else {
            //Sentencia #3
        }
        
        //Select - case
        int dia = 5;
        switch (dia) {
            case 1:
                //El dia lunes
                break;
            case 2:
                //El dia martes
                break;
            case 3:
                //El dia miercoles
                break;
            case 4:
                //El dia jueves
                break;
            case 5:
                //El dia viernes
                break;
            case 6:
                //El dia sabado
                break;
            case 7:
                //El dia domingo
                break;
            default:
                // No se dectecto el dia.
                break;
        }
        
        //Estructura de control - bucle - mientras
        int control = 0;
        int sumatoria = 0;
        while (control < 5) {            
            //Sentencia
            System.out.println("Control vale: " + control);
            sumatoria = control + 1;
            control = sumatoria;
            System.out.println("Control valor final: " + control);
            System.out.println("---------------------------");
        }
        
        //Estructura de control - Bucle - Hacer mientras
        int control_validar = 0;
        int sumatoria_validar = 0;
        do {
            // Sentencia
            System.out.println("Control vale: " + control_validar);
            sumatoria_validar = control_validar + 1;
            control_validar = sumatoria_validar;
            System.out.println("Control valor fina: " + control_validar);
            System.out.println("---------------------------");
        } while (control_validar < 5);
        
        //Estructura de control - bucle - For
        for (int control_for = 0; control_for < 10; control_for++) {
            System.out.println("Control valor ciclo/vuelta: " + control_for);
        }
    }
}