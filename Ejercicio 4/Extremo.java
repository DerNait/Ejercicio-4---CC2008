public class Extremo extends Jugador{

    private int pases;
    private int asistenciasEfectivas;

    public Extremo(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos, int pases, int asistenciasEfectivas){
        super(nombre,pais,faltas,golesDirectos,totalLanzamientos);
        this.pases = pases;
        this.asistenciasEfectivas = asistenciasEfectivas;

        efectividad = ((pases + asistenciasEfectivas - faltas)*100/(pases + asistenciasEfectivas + faltas)) + golesDirectos*100/totalLanzamientos;
    }

    public String toString(){
        return "\n=== DATOS DEL EXTREMO: " + nombre + " ===\n\nNombre: " + nombre + "\nPais: " + pais + "\nFaltas: " + faltas + "\nGoles directos: " + golesDirectos + "\nTotal de lanzamientos: " + totalLanzamientos + "\nPases: " + pases + "\nAsistencias efectivas: " + asistenciasEfectivas + "\nEfectividad: " + efectividad;
    }
}