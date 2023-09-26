/*
Kevin Josué Villagrán Mérida
Ejercicio #4 
Fecha de creación: 22/09/2023 8:30
Fecha de ultima modificación: 25/09/2023 21:13
*/
public class Extremo extends Jugador{

    //Atributos
    private int pases;
    private int asistenciasEfectivas;

    public Extremo(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos, int pases, int asistenciasEfectivas){//Constructor donde se definen los atributos
        super(nombre,pais,faltas,golesDirectos,totalLanzamientos);
        this.pases = pases;
        this.asistenciasEfectivas = asistenciasEfectivas;
    }

    /*Se incluyo este metodo como un override, pues en el momento de creaciond este ejercicio, aun no se veia este tema, pero se nos permitio 
    modificar el programa para ajustarlo a clases abstractas y hacer overriding, aun si en el diseño original no era asi, siendo este el 
    unico cambio.*/ 
    @Override
    public float getEfectividad(){//Metodo que overridea el metodo getEfectividad, que sirve para calcular y devolver la efectividad del extremo
        try{
            efectividad = ((pases + asistenciasEfectivas - faltas)*100/(pases + asistenciasEfectivas + faltas)) + golesDirectos*100/totalLanzamientos;
        }
        catch(Exception e){
            efectividad = 0;
        }
        
        return efectividad;
    }

    public String toString(){//Muestra a detalle los datos del extremo
        return "\n=== DATOS DEL EXTREMO: " + nombre + " ===\n\nNombre: " + nombre + "\nPais: " + pais + "\nFaltas: " + faltas + "\nGoles directos: " + golesDirectos + "\nTotal de lanzamientos: " + totalLanzamientos + "\nPases: " + pases + "\nAsistencias efectivas: " + asistenciasEfectivas + "\nEfectividad: " + this.getEfectividad();
    }
}