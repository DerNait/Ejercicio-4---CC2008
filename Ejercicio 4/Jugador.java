public class Jugador{

    //Atributos del jugador
    protected String nombre;
    protected String pais;
    protected int faltas;
    protected int golesDirectos;
    protected int totalLanzamientos;
    protected float efectividad;

    public Jugador(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos){
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.golesDirectos = golesDirectos;
        this.totalLanzamientos = totalLanzamientos;
    }

    public float getEfectividad(){
        return efectividad;
    }

    public String toString(){
        return "\n=== DATOS DEL JUGADOR: " + nombre + " ===\n\nNombre: " + nombre + "\nPais: " + pais + "\nFaltas: " + faltas + "\nGoles directos: " + golesDirectos + "\nTotal de lanzamientos: " + totalLanzamientos + "\nEfectividad: " + efectividad;
    }
}