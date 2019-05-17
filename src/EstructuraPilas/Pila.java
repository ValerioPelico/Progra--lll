package EstructuraPilas;

import java.util.Scanner;
/**
 *
 * @autor Angel Ruiz
 * 0901-16-17865
 */
public class Pila//Creacion de la clase pila
{   //encapsulamos los elementos
    private int tope,maximo;
    private String pila[];
    //Elementos de la pila
    public Pila(int m)

    {
        maximo=m;//Maximo de la pila
        pila=new String[maximo];
        tope=0;//Tope o cima
    }

    //Creacion del metodo agregar
    private void Agregar_elemento(String n)
    {
        //si tope es menor al maximo que puede tener la pila
        if(tope<maximo)
        {
           
            pila[tope]=n;
            tope++;//Tope ira incrementando 
            System.out.println("se ha agregado un dato con exito!!!!!");
        }
        else
        {
            System.out.println("pila llena");
        }
    }
     //Metodo eliminar de la pila
    private void Eliminar()
    {
        //Si no existe ningun elemento
        if(tope>0)
        {
            tope--;//Tope ira disminuyendo
            System.out.println("Dato eliminado");
        }
        else
        {
            System.out.println("Ya no hay datos para eliminar");
        }
    }
     //Metodo que muestra los elementos ingresados
    private void Mostrar()
    {
        //si la lista no esta vacia
        if(!Vacia())
        {//For que recorre todos los elementos
            for(int a=(tope-1);a>=0;a--)
            {//se muestran los elemntos en pantalla
                System.out.println(pila[a]);
            }
        }
        else 
            System.out.println("Pila vacia");
    }
    //metodo para buscar 
    private boolean Buscar(String dato)
    {//cramos una variable booleana
        boolean encontrado=false;
        //si la pila no esta vacia
        if(!Vacia())
        {//For que busca elemento deseado
            for(int a=(tope-1);a>=0;a--)
            {//si hay un elemento en la pila igual al dato que el usuario uso lo muestra en pantalla
                if(pila[a].equals(dato)) encontrado=true;
            }
        }
        else 
            System.out.println("No hay datos para buscar en la pila");
        return encontrado;
    }
    //Metodo si la pila esta vacia
    private boolean Vacia()
    {//si la pila no tiene datos esta vacia
        if(pila==null) return true;
        else return false;
    }
    
    //Main del programa
    public static void main(String arg[])
    {
        int intTamaño,opcion;
        String dato;
        Scanner teclado=new Scanner(System.in);
        System.out.println("--------------------------Programa de pilas----------------------------");
        System.out.println("ingrese el Tamaño de la pila: ");
        intTamaño=teclado.nextInt();
        Pila pila=new Pila(intTamaño);
        //Opciones a elegir
       
            
            
        do
        {
            System.out.println("\n1. Agregar dato");
            System.out.println("2. Eliminar dato");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Buscar dato");
            System.out.println("5. Salir");
            System.out.println("Que desea hacer? ");
            opcion=teclado.nextInt();
           
            switch(opcion)
            {
                case 1:
                    for(int i = 0; i<intTamaño; i++){
                    System.out.println("Escriba un dato: ");
                    dato=teclado.next();
                    pila.Agregar_elemento(dato);
                    }
                    break;
                case 2:
                    pila.Eliminar();
                    break;
                case 3:
                    System.out.print("\n");
                    pila.Mostrar();
                    break;
                case 4:
                    System.out.println("Dato a buscar: ");
                    dato=teclado.next();
                    if(pila.Buscar(dato)) System.out.println("Dato encontrado");
                    else
                        System.out.println("Dato no encontrado");
                    break;
            }
        }while(opcion!=5);
    }
}

