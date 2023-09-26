/*
Kevin Josué Villagrán Mérida
Ejercicio #4 
Fecha de creación: 22/09/2023 8:30
Fecha de ultima modificación: 25/09/2023 21:13
*/
public class Portero extends Jugador{

    //Atributos
    private int paradasEfectivas;
    private int golesRecibidos;

    Portero(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos, int paradasEfectivas, int golesRecibidos){//Constructor, donde se definen los atributos
        super(nombre,pais,faltas,golesDirectos,totalLanzamientos);
        this.paradasEfectivas = paradasEfectivas;
        this.golesRecibidos = golesRecibidos;
    } 

    /*Se incluyo este metodo como un override, pues en el momento de creaciond este ejercicio, aun no se veia este tema, pero se nos permitio 
    modificar el programa para ajustarlo a clases abstractas y hacer overriding, aun si en el diseño original no era asi, siendo este el 
    unico cambio.*/ 
    @Override
    public float getEfectividad(){//Metodo que overridea el metodo getEfectividad, que sirve para calcular y devolver la efectividad del portero
        try{
            efectividad = ((paradasEfectivas - golesRecibidos)*100/(paradasEfectivas+golesRecibidos))+golesDirectos*100/totalLanzamientos;
        }
        catch(Exception e){
            efectividad = 0;
        }
        
        return efectividad;
    }

    public String toString(){//Muestra a detalle los datos del portero
        return "\n=== DATOS DEL PORTERO: " + nombre + " ===\n\nNombre: " + nombre + "\nPais: " + pais + "\nFaltas: " + faltas + "\nGoles directos: " + golesDirectos + "\nTotal de lanzamientos: " + totalLanzamientos + "\nParadas efectivas: " + paradasEfectivas + "\nGoles recibidos: " + golesRecibidos + "\nEfectividad: " + this.getEfectividad();
    }
}