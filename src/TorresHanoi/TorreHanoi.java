
package TorresHanoi;

/**
 *
 * @autor VAlerio Pelicó Guox
 * 0901-16-11957
 */
import java.util.*;
public class TorreHanoi {
    static int movimiento;//Variable estatica necesaria para el conteo de los movimientos
    public static void main(String[] args) {  //Metodo principal Main   
        Scanner sc = new Scanner(System.in);  //Declaracion del Scanner para leer en consola
        int n; //Variable que se usara para obtener los datos en consola de los discos
        System.out.println("------------------------------");
        System.out.println("|   SOLUCION TORRES DE HANOI  |");
        System.out.println("------------------------------");
        System.out.println("Teclee el numero de discos: ");
        n = sc.nextInt();
        Hanoi(n,1,2,3); //LLama el metodo y hace referencia a las tres torres 
        System.out.println("El numero de movimientos es: "+movimiento); //Muestra el no. de movimientos
    }
    //Metodo donde instancea las tres torres necesarias para los movimientos 
    public static void Hanoi(int n, int origen,  int auxiliar, int destino){
        //Si es igual a cero mostrara un error, debido a las reglas del juego
        if(n<=0){
            System.out.println("Teclee un valor correcto!!!");
            System.exit(1);
        }
        //Empieza la recursividad
        //Si es igual a uno, movera el disco de origen a destino 
        if(n==1){
            movimiento = movimiento + 1; //Movimiento se incrementara en uno para saber cuantos movimientos se realizo
            System.out.println("Mover disco "+n +" de torre|"+ origen + "| a torre|" + destino+"|");
        }else{
            //Movientos a realizar para el minimo de movimientos llamando a los metodos
            Hanoi(n-1, origen, destino, auxiliar);
            movimiento = movimiento + 1; //Movimiento se incrementara en uno para saber cuantos movimientos se realizo
            System.out.println("Mover disco "+n +" de torre|"+ origen +"| a torre|" + destino+"|");
            //Movientos a realizar para el minimo de movimientos llamando a los metodos
            Hanoi(n-1, auxiliar, origen, destino); //
        }
    }
}
