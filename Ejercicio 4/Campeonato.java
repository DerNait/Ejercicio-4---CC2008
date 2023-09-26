import java.util.*;

public class Campeonato{

    public static void main(String[] args){
        ArrayList<Portero> porteros = new ArrayList<Portero>();
        ArrayList<Extremo> extremos = new ArrayList<Extremo>();

        Portero portero = new Portero("Kevin", "Guatemala", 5, 9, 13, 7, 3);
        System.out.println(portero.getEfectividad());

        System.out.println("\n=== BIENVENIDO AL PROGRAMA DEL CAMPEONATO INTERNACIONAL DE FUTBOL ===\n");
        registrarJugadores(porteros, extremos);
    }

    public static void registrarJugadores(ArrayList<Portero> porteros, ArrayList<Extremo> extremos){
        Scanner scan = new Scanner(System.in);
        String opcion;

        System.out.println("=== REGISTRAR JUGADORES === ");
        System.out.println("¿Qué tipo de jugador es? (Escoga entre 1 y 2)");
        System.out.println("1. Portero");
        System.out.println("2. Extremo");
        opcion = scan.nextLine();

        switch(opcion){
            case "1":
                System.out.println("\n=== PORTERO === ");
                System.out.println("¿Cual es su nombre?");
                System.out.println("¿De que pais viene?");
                System.out.println("¿Cuantas faltas tiene?");
                System.out.println("¿Cuantos goles directos ha hecho?");
                System.out.println("¿Cual es su total de lanzamientos?");
                System.out.println("¿Cuantas paradas efectivas ha hecho");
                System.out.println("¿Cuantos goles ha recibido?");
                break;
            case "2":
                break;
            default:
                System.out.println("Ingrese un valor valido entre 1 y 2.");
                break;
        }
    }
}