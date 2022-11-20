package jonatansandoval.proyectofuturo;
/**
 *
 * @author Jonatan Sandoval Alarcón
 */
public class ProyectoFuturo {
    public static void main(String[] args) {
        System.out.println("Estudiante "+args[0]+":"); // Jonatan Sandoval Alarcón
        String valor1 = args[1]; // Número de módulos
        String valor2 = args[2]; // Número de horas de estudio semanal
        System.out.println("Veredicto: "+veredicto(valor1,valor2));
    }
    private static String veredicto(String valor1, String valor2){
        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) > Integer.valueOf(valor2)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
}