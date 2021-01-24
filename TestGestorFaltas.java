/**
 * Punto de entrada a la aplicaci�n
 */
public class TestGestorFaltas {
    /**
     * Se acepta como argumento del main() el n� m�ximo de estudiantes
     * y una vez creado el gestor de faltas se muestra la informaci�n solicitada
     * (ver enunciado)
     */
    public static void main(String[] args) {
        GestorFaltas gestorFaltas = new GestorFaltas(14);
        gestorFaltas.leerDeFichero();
        gestorFaltas.toString();
        
        gestorFaltas.justificarFaltas("IRISO FLAMARIQUE", 6);
        System.out.println("Justificadas 6 faltas a IRISO FLAMARIQUE, Carla");
        
        gestorFaltas.ordenar();
        System.out.println("Ordenado de > a < n� de faltas injustificadas");
        
        gestorFaltas.toString();
        gestorFaltas.anularMatricula();
        gestorFaltas.toString();
    }
}
