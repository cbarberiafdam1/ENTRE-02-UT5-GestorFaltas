/**
 * Un objeto de esta clase guarda la información de un estudiante
 *
 */
public class Estudiante {
    private final static String SEPARADOR = ",";
    private String nombre;
    private String apellidos;
    private int faltasNoJustificadas;
    private int faltasJustificadas;

    /**
     *  
     *  Inicializa los atributos a partir de la información recibida
     *  Esta información se encuentra en lineaDatos
     *  (ver enunciado) 
     *  
     */
    public Estudiante(String lineaDatos) {
        String[] informacion = lineaDatos.split(SEPARADOR);
        this.nombre = convertirNombre(informacion[0]);
        this.apellidos = informacion[1].toUpperCase();
        this.faltasNoJustificadas = Integer.parseInt(informacion[2]);
        this.faltasJustificadas = Integer.parseInt(informacion[3]);
    }

    private String convertirNombre(String nombre){
        String[] nombres = nombre.split(" ");
        int longitud = nombres.length;
        String nombreFinal = "";
        String inicial = "";
        for(int i = 0; i < longitud; i++){
            if(i == (longitud - 1)){
                inicial = String.valueOf(nombres[i].charAt(0));
                nombreFinal += inicial + nombres[i].substring(0);                
            }
            else if(nombres[i] != " "){
                inicial = String.valueOf(nombres[i].charAt(0));
                nombreFinal += inicial.toUpperCase() + ". ";
            }
        }
        return nombreFinal;
    }

    /**
     * accesor para el nombre completo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * mutador para el nombre
     *  
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * accesor para los apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *  mutador para los apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * accesor para el nº de faltas no justificadas
     */
    public int getFaltasNoJustificadas() {
        return faltasNoJustificadas;
    }

    /**
       * mutador para el nº de faltas no justificadas
     */
    public void setFaltasNoJustificadas(int faltasNoJustificadas) {
        this.faltasNoJustificadas = faltasNoJustificadas;
    }

    /**
     * accesor para el nº de faltas justificadas
     */
    public int getFaltasJustificadas() {
        return faltasJustificadas;
    }

    /**
     *  mutador para el nº de faltas justificadas
     */
    public void setFaltasJustificadas(int faltasJustificadas) {
        this.faltasJustificadas = faltasJustificadas;
    }

    /**
     *  se justifican n faltas que hasta el momento eran injustificadas
     *  Se asume n correcto
     */
    public void justificar(int n) {
        this.faltasNoJustificadas -= n;
        this.faltasJustificadas += n;
    }

    /**
     * Representación textual del estudiante
     * (ver enunciado)
     */
    public String toString() {
        String resultado = String.format("Apellidos y Nombre: %5s, %s\n Faltas No Justificadas: %3s\n Faltas Justificadas: %6s\n Apercibimientos: %9s\n",
        this.apellidos, this.nombre, this.faltasNoJustificadas, this.faltasJustificadas); 
        return resultado;
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("  ander ibai  ,  Ruiz Sena , 12, 23");
        System.out.println(e1);
        System.out.println();
        Estudiante e2 = new Estudiante(
                " pedro josé   andrés  ,  Troya Baztarrica , 42, 6 ");
        System.out.println(e2);
        System.out.println();
        Estudiante e3 = new Estudiante("  Javier  ,  Suescun  Andreu , 39, 9 ");
        System.out.println(e3);
        System.out.println();
        Estudiante e4 = new Estudiante("julen, Duque Puyal, 5, 55");
        System.out.println(e4);
        System.out.println();

        System.out.println("---------------------------------");
        e1.justificar(3);
        System.out.println(e1);
        System.out.println();

        System.out.println("---------------------------------");

        e3.justificar(12);
        System.out.println(e3);
        System.out.println();

    }
}
