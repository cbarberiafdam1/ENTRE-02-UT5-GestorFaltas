/**
 * Punto de entrada a la aplicación
 */
public class TestGestorFaltas {
    /**
     * Se acepta como argumento del main() el nº máximo de estudiantes
     * y una vez creado el gestor de faltas se muestra la información solicitada
     * (ver enunciado)
     */
    public static void main(String[] args) {
        GestorFaltas gestorFaltas = new GestorFaltas(14);
        gestorFaltas.leerDeFichero();
        gestorFaltas.toString();
        
        gestorFaltas.justificarFaltas("IRISO FLAMARIQUE", 6);
        System.out.println("Justificadas 6 faltas a IRISO FLAMARIQUE, Carla");
        
        gestorFaltas.ordenar();
        System.out.println("Ordenado de > a < nº de faltas injustificadas");
        
        gestorFaltas.toString();
        gestorFaltas.anularMatricula();
        gestorFaltas.toString();
    }
}
