/*
 * @author Luis Cordón
 * @date 14-10-2022
 * Clase que modela el Torneo de Voleibol. 
 */
import java.util.ArrayList;
public class TorneoV2{
    //Atributos
    private ArrayList<Jugador2> listaJugadores;

    //Constructor
    public TorneoV2() {
        listaJugadores = new ArrayList<Jugador2>();
    }

    /** 
     * Agrega un jugador a su lista correspondiente
     * @param tipo : 1 si es líbero, 2 si es opuesto/auxiliar y 3 si es pasador
     * @param recibos
     * @param ataques
     * @param bloqueosE
     * @param bloqueosF
     * @param pases
     * @param fintas
     * @param nombre
     * @param pais
     * @param errores
     * @param aces
     * @param servicios
     */
    public void agregarJugador(int tipo, int recibos,int ataques, int bloqueosE, int bloqueosF, int pases, int fintas, String nombre, String pais, int errores, int aces, int servicios){
        switch (tipo){
            //Libero
            case 1:{ 
                Libero2 jugLibero = new Libero2(recibos, nombre, pais, errores, aces, servicios);
                listaJugadores.add(jugLibero);
                break;
            }
            //Opuesto/Auxiliar
            case 2:{
                Opuesto2 jugOpuesto = new Opuesto2(ataques, bloqueosE, bloqueosF, nombre, pais, errores, aces, servicios);
                listaJugadores.add(jugOpuesto);
                break;
            }
            //Pasador
            case 3:{
                Pasador2 jugPasador = new Pasador2(pases, fintas, nombre, pais, errores, aces, servicios);
                listaJugadores.add(jugPasador);
                break;
            }
        }
    }

    
    /** 
     * Calcula los pasadores con un 80% o más de efectividad en sus pases
     * @return String
     */
    public String pasadoresBuenos(){
        String resultado = "";
        resultado = "\n----------\n";
        for (Jugador2 jug: listaJugadores){
            if(jug instanceof Pasador2){
                if(jug.efectividad1()>80){
                    resultado = resultado + jug.toString() + "\n";
                }
            } 
        }
        return resultado;
    }

    
    /** 
     * Muestra los 3 mejores líberos del torneo
     * @return String
     * 
     */
    public String mejoresLiberos(){
        String resultado = "";
        resultado = "\n----------\n";
        for (Jugador2 jug : listaJugadores){            
            if(jug instanceof Libero2){
                resultado = resultado + jug.toString() + "\n";
            } 
        }            
        return resultado;
    }

    
    /** 
     * Muestra los jugadores inscritos en el torneo
     * @return String
     */
    public String obtenerJugadores(){
        String resultado = "JUGADORES\n---------------\n";
        for (Jugador2 jug : listaJugadores){
            resultado = resultado + jug.toString();
            if (jug instanceof Libero2)
                resultado = resultado + "Tipo: Líbero\n-----------------------------\n";
            if (jug instanceof Opuesto2)
                resultado = resultado + "Tipo: Opuesto\n-----------------------------\n";
            if (jug instanceof Pasador2)
                resultado = resultado + "Tipo: Pasador\n-----------------------------\n";
        }
        return resultado;
    }
}