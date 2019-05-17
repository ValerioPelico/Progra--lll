/**
 *
 * @autor Angel Ruiz
 * 0901-16-17865
 */
package EstructuraColas;

import java.util.*;
public class Cola {
    public static void main( String args[] ){
       Scanner leer = new Scanner(System.in);
 
       colagenerica obj = new colagenerica();
 
       int op;
       int num;
 
       do{
          menu();
          op = leer.nextInt();
 
          switch(op){
              case 1:
                     System.out.println( "Numero a insertar" );
                     num = leer.nextInt();
                     if(obj.inscola(num)){
                        System.out.println( "fre"+obj.fre+"fin"+obj.fin+"aux"+obj.max );
                        System.out.println( "El numero "+num+" se inserto en la cola ["+obj.dret+"]" );
                        System.out.println();
                     }
                     else{
                          System.out.println( "Cola llena" );
                     }
                     break;
              case 2:
                    if(obj.retcola()){
                       System.out.println( "El dato retirado fue: "+obj.dret );
                    }
                    else{
                        System.out.println( "Cola vacia" );
                    }
                    break;
              case 3:
                    if(obj.fre==-1 && obj.fin==-1){
                       System.out.println( "Cola vacia" );
                    }
                    else{
                         System.out.println( "Estado de la cola:" );
                         for(int i=obj.fre; i<=obj.fin; i++){
                            System.out.print(obj.c[i]+" \t");
                         }
                         break;
                    }
          }
       }
       while(op != 4);
    }
 
    public static void menu(){
       System.out.println( "\n\t Menu para colas \n" );
       System.out.println( "1.- Insertar" );
       System.out.println( "2.- Retirar" );
       System.out.println( "3.- Estado" );
       System.out.println( "4.- Fin" );
       System.out.println( "\n Selecciona" );
    }
}