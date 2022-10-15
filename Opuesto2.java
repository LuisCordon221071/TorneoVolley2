/*
 * @author Luis Cordón
 * @date 14-10-2022
 * Clase que describe a un jugador opuesto/auxiliar
 */
public class Opuesto2 extends Jugador2{
    //Atributos
    private int ataques;
    private int bloqueosE;
    private int bloqueosF;

    //Constructor
    public Opuesto2() {
        super();
        ataques = 0;
        bloqueosE = 0;
        bloqueosF = 0;
    }

    
    /** 
     * @param ataques
     * @param bloqueosE
     * @param bloqueosF
     * @param nombre
     * @param pais
     * @param errores
     * @param aces
     * @param servicios
     */
    public Opuesto2(int ataques, int bloqueosE, int bloqueosF, String nombre, String pais, int errores, int aces, int servicios) {
        super(nombre, pais, errores, aces, servicios);
        this.ataques = ataques;
        this.bloqueosE = bloqueosE;
        this.bloqueosF = bloqueosF;
    }

    //Getters & Setters

    /** 
     * @return int
     */
    public int getAtaques() {
        return this.ataques;
    }

    
    /** 
     * @param ataques
     */
    public void setAtaques(int ataques) {
        this.ataques = ataques;
    }

    
    /** 
     * @return int
     */
    public int getBloqueosE() {
        return this.bloqueosE;
    }

    
    /** 
     * @param bloqueosE
     */
    public void setBloqueosE(int bloqueosE) {
        this.bloqueosE = bloqueosE;
    }

    
    /** 
     * @return int
     */
    public int getBloqueosF() {
        return this.bloqueosF;
    }

    
    /** 
     * @param bloqueosF
     */
    public void setBloqueosF(int bloqueosF) {
        this.bloqueosF = bloqueosF;
    }

    //Efectividad
    /** 
     * @return float
     * Calcula la efectividad de los opuestos/auxiliares
     */
    public float efectividad1(){
        float pases2 = errores;
        return pases2; 
    }

    //ToString
    @Override
    /** 
     * @return String
     */
    public String toString() {
        String resultado = super.toString();
        resultado = resultado + "Ataques: " + getAtaques() + "\n" +
            "Bloqueos efectivos: " + getBloqueosE() + "\n" +
            "Bloqueos fallidos: " + getBloqueosF() + "\n";
        return resultado;
    }
}