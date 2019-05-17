/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;
import ListasSimples.Lista;
import EstructuraColas.Cola;
import EstructuraPilas.Pila;
import Nomina.Departamentos_empleados;
import TorresHanoi.TorreHanoi;
import arbolBB.Vistaa;
import java.util.*;
import planilla_ventana.Planilla_ventana;
/**
 *
 * @autor Angel Ruiz
 * 0901-16-17865
 */
public class TodosLosProgramas {
    
    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here.
        Scanner teclado = new Scanner(System.in);
        int opcion;
           
            
        do{
            System.out.println("\n\n");
            System.out.println("\t   _____________________");
            System.out.println("\t\tMENU PRINCIPAl");
            System.out.println("\t   ---------------------");
            System.out.println("\t1. Nominas");
            System.out.println("\t2. Nominas con Base de Datos");
            System.out.println("\t3. Listas Simples");
            System.out.println("\t4. Pilas");
            System.out.println("\t5. Torres De Hanoi");
            System.out.println("\t6. Colas");
            System.out.println("\t7. Arboles ABB");
            System.out.println("\t8. Salir");
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1: 
                    Departamentos_empleados.main(args);
                    break;
                case 2:
                    Planilla_ventana.main(args);
                    break;
                case 3:
                    Lista.main(args);
                    break;
                case 4:
                    Pila.main(args);
                    break;
                case 5: 
                    TorreHanoi.main(args);
                    break;
                case 6:
                    Cola.main(args);
                    break;
                case 7: 
                    Vistaa.main(args);
                case 8:
                    break;
                default: 
                    System.out.println("Opcion no valida");
            }
        }while(opcion!=8);
    }
   
}
