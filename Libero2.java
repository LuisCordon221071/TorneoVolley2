/*
 * @author Luis Cordón
 * @date 14-10-2022
 * Clase que describe a un jugador líbero
 */
public class Libero2 extends Jugador2{
    //Atributo
    private int recibos;
    
    //Constructor
    public Libero2() {
        super();
        recibos = 0;
    }

    public Libero2(int recibos, String nombre, String pais, int errores, int aces, int servicios) {
        super(nombre, pais, errores, aces, servicios);
        this.recibos = recibos;
    }
    
    //Getters & Setters
    
    /** 
     * @return int
     */
    public int getRecibos() {
        return this.recibos;
    }

    
    /** 
     * @param recibos
     */
    public void setRecibos(int recibos) {
        this.recibos = recibos;
    }

    //Mejores Líberos
    /** 
     * @return float
     * Calcula la efectividad de los líberos
     */
    public float efectividad1(){
        float mejor2 = recibos - errores;
        float mejor3 = mejor2*100;
        float mejor4 = recibos + errores;
        float mejor5 = mejor3/mejor4;
        float mejor6 = aces*100;
        float mejor7 = mejor6/servicios;
        float mejor8 = mejor5+mejor7;
        return mejor8;
    }

    //ToString
    @Override
    /** 
     * @return String
     */
    public String toString() {
        String resultado = super.toString();
        resultado = resultado + "Recibos: " + getRecibos() + "\n";
        return resultado;
    }
}