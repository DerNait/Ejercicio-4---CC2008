/*
Kevin Josué Villagrán Mérida
Ejercicio #4 
Fecha de creación: 22/09/2023 8:30
Fecha de ultima modificación: 25/09/2023 21:13
*/

/*Se incluyo esta clase como abstracta, pues en el momento de creacion de este ejercicio, aun no se veia este tema, pero se nos permitio 
    modificar el programa para ajustarlo a clases abstractas y hacer overriding, aun si en el diseño original no era asi, siendo este el 
    unico cambio.*/ 
public abstract class Jugador{

    //Atributos del jugador
    protected String nombre;
    protected String pais;
    protected int faltas;
    protected int golesDirectos;
    protected int totalLanzamientos;
    protected float efectividad;

    public Jugador(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos){//Constructor donde se definen los atributos
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.golesDirectos = golesDirectos;
        this.totalLanzamientos = totalLanzamientos;
    }

    /*Metodo abstracto para obtener la efectividad que se define en las subclases. 
    Por las razones dichas anteriormente, esta clase paso a ser una abstracta, a diferencia de lo dicho en el analisis y diseño.*/
    public abstract float getEfectividad();

    //Se removio el toString, pues realmente no se necesita ya que las subclases cuentan con su propio toString que overridean. 
}