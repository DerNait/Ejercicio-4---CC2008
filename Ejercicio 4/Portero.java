public class Portero extends Jugador{

    private int paradasEfectivas;
    private int golesRecibidos;

    Portero(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos, int paradasEfectivas, int golesRecibidos){
        super(nombre,pais,faltas,golesDirectos,totalLanzamientos);
        this.paradasEfectivas = paradasEfectivas;
        this.golesRecibidos = golesRecibidos;

        if((paradasEfectivas == 0 && golesRecibidos == 0) || totalLanzamientos == 0)
            efectividad = 0
        else
            efectividad = ((paradasEfectivas - golesRecibidos)*100/(paradasEfectivas+golesRecibidos))+golesDirectos*100/totalLanzamientos;
    } 

    public String toString(){
        return "\n=== DATOS DEL PORTERO: " + nombre + " ===\n\nNombre: " + nombre + "\nPais: " + pais + "\nFaltas: " + faltas + "\nGoles directos: " + golesDirectos + "\nTotal de lanzamientos: " + totalLanzamientos + "\nParadas efectivas: " + paradasEfectivas + "\nGoles recibidos: " + golesRecibidos + "\nEfectividad: " + efectividad;
    }
}