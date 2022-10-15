/* 
 * @author Luis Cordón
 * @date 14-10-2022
 * Clase que contiene la información general de todos los jugadores
*/
public class Jugador2{
    //Atributos
    protected String nombre;
    protected String pais;
    protected int errores;
    protected int aces;
    protected int servicios;

    //Constructor
    public Jugador2() {
        nombre = "";
        pais = "";
        errores = 0;
        aces = 0;
        servicios = 0;
    }
    
    /** 
     * @param nombre
     * @param pais
     * @param errores
     * @param aces
     * @param servicios
     */
    public Jugador2(String nombre, String pais, int errores, int aces, int servicios) {
        this.nombre = nombre;
        this.pais = pais;
        this.errores = errores;
        this.aces = aces;
        this.servicios = servicios;
    }

    //Getters & Setters 
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return String
     */
    public String getPais() {
        return this.pais;
    }

    
    /** 
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    
    /** 
     * @return int
     */
    public int getErrores() {
        return this.errores;
    }

    
    /** 
     * @param errores
     */
    public void setErrores(int errores) {
        this.errores = errores;
    }

    
    /** 
     * @return int
     */
    public int getAces() {
        return this.aces;
    }

    
    /** 
     * @param aces
     */
    public void setAces(int aces) {
        this.aces = aces;
    }

    
    /** 
     * @return int
     */
    public int getServicios() {
        return this.servicios;
    }

    
    /** 
     * @param servicios
     */
    public void setServicios(int servicios) {
        this.servicios = servicios;
    }


    //Efectividad
    /** 
     * @return float
     * Calcula la efectividad de los jugadores
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
        return
            "Nombre: " + getNombre() + "\n" +
            "País: " + getPais() + "\n" +
            "Errores: " + getErrores() + "\n" +
            "Aces: " + getAces() + "\n" +
            "Servicios: " + getServicios() + "\n";
    }
}