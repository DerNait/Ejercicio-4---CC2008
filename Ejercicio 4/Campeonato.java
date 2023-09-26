/*
Kevin Josué Villagrán Mérida
Ejercicio #4 
Fecha de creación: 22/09/2023 8:30
Fecha de ultima modificación: 25/09/2023 21:13
*/
import java.util.*;//Importamos el paquete de util, que incluye gran parte de lo que utiliza el codigo.

public class Campeonato{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);//Scanner para que el usuario introduzca datos
        //Lista de porteros y extremos
        ArrayList<Portero> porteros = new ArrayList<Portero>();
        ArrayList<Extremo> extremos = new ArrayList<Extremo>();

        boolean salir = false;
        String opcion;

        System.out.println("\n=== BIENVENIDO AL PROGRAMA DEL CAMPEONATO INTERNACIONAL DE FUTBOL ===");

        while(!salir){//Ciclo del menu principal del programa

            System.out.println("\n¿Que desea hacer?");
            System.out.println("1. Registrar jugadores");
            System.out.println("2. Mostrar todos los jugadores registrados en el campeonato");
            System.out.println("3. Mostrar los 3 mejores porteros");
            System.out.println("4. Mostrar la cantidad de extremos con mas de 85% de efectividad");
            System.out.println("5. Salir");
            opcion = scan.nextLine();

            switch(opcion){//Dependiendo de que escoja el usuario, se llamara el metodo correspondiente
                case "1": 
                    registrarJugadores(porteros, extremos);
                    break;
                case "2":
                    mostrarRegistrados(porteros, extremos);
                    break;
                case "3":
                    mejoresPorteros(porteros);
                    break;
                case "4":
                    mejoresExtremos(extremos);
                    break;
                case "5"://Salir
                    System.out.println("¡Hasta pronto!");
                    salir = true;
                    break;
                default://En caso de introducir algo fuera del rango de opciones del menu
                    System.out.println("\nIngrese un valor numerico valido entre 1 y 5.");
            }
        }
    }

    public static void registrarJugadores(ArrayList<Portero> porteros, ArrayList<Extremo> extremos){
        Scanner scan = new Scanner(System.in);
        String opcion;
        boolean anException = false;//Servira para que el usuario entre en bucle si coloca valores erroneos. 

        //Atributos generales
        String nombre;
        String pais;
        int faltas = 0;
        int golesDirectos = 0;
        int totalLanzamientos = 0;

        //Extremo
        int pases = 0;
        int asistenciasEfectivas = 0;

        //Portero 
        int paradasEfectivas = 0;
        int golesRecibidos = 0;

        System.out.println("=== REGISTRAR JUGADORES === "); //El jugador escoge entre portero y extremo
        System.out.println("¿Qué tipo de jugador es? (Escoga entre 1 y 2)");
        System.out.println("1. Portero");
        System.out.println("2. Extremo");
        System.out.println("3. Regresar");
        opcion = scan.nextLine();

        switch(opcion){
            case "1"://Se toman los datos del portero
                System.out.println("\n=== PORTERO === ");
                System.out.println("¿Cual es su nombre?");
                nombre = scan.nextLine();
                System.out.println("¿De que pais viene?");
                pais = scan.nextLine();

                do{//Ciclo que se interrumpe solo si no hay un error en el dato que introduce el usuario
                System.out.println("¿Cuantas faltas tiene?");
                    try{
                        faltas = Integer.parseInt(scan.nextLine());
                        anException = false;
                    }catch(Exception e){
                        System.out.println("\nIntroduzca un valor numerico valido");
                        anException = true;
                    }
                } while(anException);
                
                do{
                System.out.println("¿Cuantos goles directos ha hecho?");
                    try{
                        golesDirectos = Integer.parseInt(scan.nextLine());
                        anException = false;
                    }catch(Exception e){
                        System.out.println("\nIntroduzca un valor numerico valido");
                        anException = true;
                    }
                } while(anException);

                do{
                System.out.println("¿Cual es su total de lanzamientos?");
                    try{
                        totalLanzamientos = Integer.parseInt(scan.nextLine());
                        anException = false;
                    }catch(Exception e){
                        System.out.println("\nIntroduzca un valor numerico valido");
                        anException = true;
                    }
                } while(anException);
                
                do{
                System.out.println("¿Cuantas paradas efectivas ha hecho?");
                    try{
                        paradasEfectivas = Integer.parseInt(scan.nextLine());
                        anException = false;
                    }catch(Exception e){
                        System.out.println("\nIntroduzca un valor numerico valido");
                        anException = true;
                    }
                } while(anException);
                
                do{
                System.out.println("¿Cuantos goles ha recibido?");
                    try{
                        golesRecibidos = Integer.parseInt(scan.nextLine());
                        anException = false;
                    }catch(Exception e){
                        System.out.println("\nIntroduzca un valor numerico valido");
                        anException = true;
                    }
                } while(anException);
                
                //Se crea el portero con base a los datos que introdujo el usuario y se agrega a la lista de porteros
                Portero portero = new Portero(nombre, pais, faltas, golesDirectos, totalLanzamientos, paradasEfectivas, golesRecibidos);
                porteros.add(portero);
                break;
            case "2":
                //Se tomans los datos del extremo
                System.out.println("\n=== EXTREMO === ");
                System.out.println("¿Cual es su nombre?");
                nombre = scan.nextLine();
                System.out.println("¿De que pais viene?");
                pais = scan.nextLine();

                do{
                System.out.println("¿Cuantas faltas tiene?");
                    try{
                        faltas = Integer.parseInt(scan.nextLine());
                        anException = false;
                    }catch(Exception e){
                        System.out.println("\nIntroduzca un valor numerico valido");
                        anException = true;
                    }
                } while(anException);
                
                do{
                System.out.println("¿Cuantos goles directos ha hecho?");
                    try{
                        golesDirectos = Integer.parseInt(scan.nextLine());
                        anException = false;
                    }catch(Exception e){
                        System.out.println("\nIntroduzca un valor numerico valido");
                        anException = true;
                    }
                } while(anException);

                do{
                System.out.println("¿Cual es su total de lanzamientos?");
                    try{
                        totalLanzamientos = Integer.parseInt(scan.nextLine());
                        anException = false;
                    }catch(Exception e){
                        System.out.println("\nIntroduzca un valor numerico valido");
                        anException = true;
                    }
                } while(anException);

                do{
                System.out.println("¿Cuantos pases ha hecho?");
                    try{
                        pases = Integer.parseInt(scan.nextLine());
                        anException = false;
                    }catch(Exception e){
                        System.out.println("\nIntroduzca un valor numerico valido");
                        anException = true;
                    }
                } while(anException);
                
                do{
                System.out.println("¿Cuantas asistencias efectivas ha hecho?");
                    try{
                        asistenciasEfectivas = Integer.parseInt(scan.nextLine());
                        anException = false;
                    }catch(Exception e){
                        System.out.println("\nIntroduzca un valor numerico valido");
                        anException = true;
                    }
                } while(anException);

                //Se crea el extremo con base a los datos que introdujo el usuario y se agrega a la lista de extremos
                Extremo extremo = new Extremo(nombre, pais, faltas, golesDirectos, totalLanzamientos, pases, asistenciasEfectivas);
                extremos.add(extremo);
                break;
            case "3"://Si introduce el 3, regresara al menu, esto cancelara el registro de un jugador
                break;
            default://Si introduce algo fuera del rango de valores de las opciones, le dira el siguiente mensaje
                System.out.println("Ingrese un valor valido entre 1 y 2. Regresando al menu...");
                break;
        }
    }

    public static void mostrarRegistrados(ArrayList<Portero> porteros, ArrayList<Extremo> extremos){
        System.out.println("\n=== Porteros registrados ===");
        if(porteros.size() > 0){//Si en la lista de porteros hay al menos un portero
            for(Portero portero : porteros)//Por cada portero que haya en la lista, se imprimiran sus datos
                System.out.println(portero);
        }
        else
            System.out.println("\nNo hay porteros registrados...");//Si la lista de porteros es de 0

        System.out.println("\n=== Extremos registrados ===");
        if(extremos.size() > 0){//Si en la lista de extremos hay al menos un extremo
            for(Extremo extremo : extremos)//Por cada extremo que haya en la lista, se imprimiran sus datos
                System.out.println(extremo);
        }
        else
            System.out.println("\nNo hay extremos registrados...");//Si la lista de extremos es de 0
    }

    public static void mejoresPorteros(ArrayList<Portero> porteros){
        ArrayList<Float> efectividades = new ArrayList<Float>();//Lista del valor de efectividad de cada portero
        ArrayList<Portero> porterosMejores = new ArrayList<Portero>();//Lista de mejores porteros

        for(Portero portero : porteros)//A cada portero en la lista, se obtiene su efectividad y esta se agrega a la lista de efectividades
            efectividades.add(portero.getEfectividad());

        Collections.sort(efectividades);//Se ordena la lista de efectividad 

        for(int i = efectividades.size()-1; i >= 0; i--){//Compara las efectividades de los porteros con las que hay en la lista ordenada de efectividades
            for(int j = 0; j < porteros.size(); j++){
                if(porteros.get(j).getEfectividad() == efectividades.get(i)){
                    if(!porterosMejores.contains(porteros.get(j)))
                        porterosMejores.add(porteros.get(j));//Si las efectividades coinciden, se agrega este portero a la lista de mejores porteros
                }
            }
        }

        System.out.println("\n=== Los tres mejores porteros del campeonato ===");//Se imprimen los tres mejores porteros si es que hay porteros registrados
        if(porterosMejores.size() > 0){
            for(int i = 0; i < 3; i++){
                if(i < porterosMejores.size()){
                    if(porterosMejores.get(i) != null)
                        System.out.println(porterosMejores.get(i));
                }
            }
        }
        else
            System.out.println("\nNo hay porteros registrados...");//Si no hay porteros registrados
    }

    public static void mejoresExtremos(ArrayList<Extremo> extremos){
        int cantidadExtremos = 0;//Se define la cantidad de extremos

        if(extremos.size() > 0){//Mientras la lista de extremos tenga al menos un elemento
            for(Extremo extremo : extremos){
                if(extremo.getEfectividad() > (200*0.85))//Si el extremo tiene efectividad de mas del 85%, se incrementa la cantidad de extremos
                    cantidadExtremos++;
            }
            System.out.println("\nCantidad de extremos con mas de un 85% de efectividad: " + cantidadExtremos);//Se imprime la cantidad de extremos con mas del 85% de efectividad
        }
        else
            System.out.println("\nNo hay extremos registrados...");//Si no hay extremos
    }
}