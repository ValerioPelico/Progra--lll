/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;
import ListasSimples.Lista;

import Nomina.Departamentos_empleados; // importamos los paquetes donde se encuntran las clases que mandaremos a llamar
import TorresHanoi.TorreHanoi;         // importamos los paquetes donde se encuntran las clases que mandaremos a llamar
import arbolBB.Vistaa;                 // importamos los paquetes donde se encuntran las clases que mandaremos a llamar
import Pila.Pila;                      // importamos los paquetes donde se encuntran las clases que mandaremos a llamar 
import ProgramaCola.ProyectoCola;      // importamos los paquetes donde se encuntran las clases que mandaremos a llamar
import java.util.*;                    
import javax.swing.JOptionPane;           
import planilla_ventana.Planilla_ventana;     // importamos los paquetes donde se encuntran las clases que mandaremos a llamar

/**
 *
 * @autor Valerio Pelicó
 * 0901-16-11957
 */
public class TodosLosProgramas {
    
    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here.
        Scanner teclado = new Scanner(System.in);
        int opcion=0;
           
            
        do{
            //JOptionPane.showMessageDialog(null, "Bienvenido: seleccione un programa" );
            System.out.println("Todos los Progrmas:\n");
            System.out.println("1. Nominas");
            System.out.println("2. Nominas con Base de Datos");
            System.out.println("3. Listas");
            System.out.println("4. Pilas");
            System.out.println("5. Torres De Hanoi");
            System.out.println("6. Colas");
            System.out.println("7. Arboles ABB");
            System.out.println("8. Salir\n");
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1: 
                    Departamentos_empleados.main(args); // llama el metodo main de la clase Departamento_empleados
                    break;
                case 2:
                    Planilla_ventana.main(args);        // llama el main de la clase planilla_ventana
                    break;
                case 3:
                    Lista.main(args);                   // llama el main de la clase lista
                    break;
                case 4:
                    Pila.main(args);                     // llama el main de la clase pila
                    break;
                case 5: 
                    TorreHanoi.main(args);               // llama el main de la clase torres de hanoi
                    break;
                case 6:ProyectoCola.main(args);           // llama el main de la clase cola 
                    
                    break;
                case 7:                                   // llama el main de la clase listas
                    Vistaa.main(args);
                case 8:
                    break;
                default: 
                    System.out.println("Opcion no valida");                   
            }
        }while(opcion!=8);
    }
   
}
