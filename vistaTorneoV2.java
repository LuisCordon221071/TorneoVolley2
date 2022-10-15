// Universidad del Valle de Guatemala
// Luis Alberto Cordón Salguero
// 221071
// 14 de octubre del 2022
// Ejercicio 5
import java.util.Scanner;
public class vistaTorneoV2{
    
    /** 
     * @param args
     */
    public static void main(String[] args){
        TorneoV2 cgb = new TorneoV2();
        Scanner teclado = new Scanner(System.in);
        String menu = "1. Agregar jugador\n2. Mostrar jugadores\n3. Mejores líberos\n4. Pasadores buenos\n5. Salir\n";
        int opcion = 1;
        System.out.println(menu);
        System.out.println("Ingrese una opción: ");
        opcion = teclado.nextInt();
        teclado.nextLine();
        while (opcion<5 && opcion>=1){
            switch (opcion){
                case 1: {
                    try{
                        System.out.println("Ingrese la posición del jugador (1: Líbero, 2: Opuestos/Auxiliar, 3:Pasador): ");
                        int tipo = teclado.nextInt();
                        teclado.nextLine();
                        String nombre, pais;
                        int errores, aces, servicios, recibos=0, ataques=0, bloqueosE=0, bloqueosF=0, pases=0, fintas=0;
                        System.out.println("Ingrese el nombre: ");
                        nombre = teclado.nextLine();
                        System.out.println("Ingrese la nacionalidad: ");
                        pais = teclado.nextLine();
                        System.out.println("Ingrese el número de erorres: ");
                        errores = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingrese el número de aces: ");
                        aces = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingrese el número de servicios: ");
                        servicios = teclado.nextInt();
                        teclado.nextLine();
                        if (tipo==1){
                            System.out.println("Ingrese el número de recibos: ");
                            recibos = teclado.nextInt();
                            teclado.nextLine();
                        }
                        if (tipo==2){
                            System.out.println("Ingrese el número de ataques: ");
                            ataques = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Ingrese el número de bloqueos efectivos: ");
                            bloqueosE = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Ingrese el número de bloqueos fallidos: ");
                            bloqueosF = teclado.nextInt();
                            teclado.nextLine();
                        }
                        if (tipo==3){
                            System.out.println("Ingrese el número de pases: ");
                            pases = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Ingrese el número de fintas: ");
                            fintas = teclado.nextInt();
                            teclado.nextLine();
                        }
                        cgb.agregarJugador(tipo, recibos, ataques, bloqueosE, bloqueosF, pases, fintas, nombre, pais, errores, aces, servicios);
                        System.out.println(menu);
                        System.out.println("Ingrese una opción: ");
                        opcion = teclado.nextInt();
                        teclado.nextLine();
                }
                catch (Exception e){
                    teclado.next();
                    System.out.println("Ocurrió un error, vuelva a intentarlo");
                    System.out.println(menu);
                    System.out.println("Ingrese una opción: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    }
                    break;
                }
                case 2:{
                    System.out.println("JUGADORES INSCRITOS EN EL TORNEO:\n\n ");
                    System.out.println(cgb.obtenerJugadores());
                    System.out.println(menu);
                    System.out.println("Ingrese una opción: ");
                    opcion = teclado.nextInt();
                    break;
                }
                case 3:{
                    System.out.println("Los mejores líberos son: ");
                    System.out.println(cgb.mejoresLiberos());
                    System.out.println(menu);
                    System.out.println("Ingrese una opcion: ");
                    opcion = teclado.nextInt();
                    break;
                }
                case 4:{
                    System.out.println("Los pasadores con una efectividad mayor al 80% son: ");
                    System.out.println(cgb.pasadoresBuenos());
                    System.out.println(menu);
                    System.out.println("Ingrese una opcion: ");
                    opcion = teclado.nextInt();
                    break;
                }
            }
        }
    }
}