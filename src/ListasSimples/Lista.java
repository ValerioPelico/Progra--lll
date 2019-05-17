

package ListasSimples;
import ListasSimples.Libro;
import Main.TodosLosProgramas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @autor Angel Ruiz
 * 0901-16-17865
 */
public class Lista {

    public static void main(String[] args) {//main
        Scanner leer = new Scanner(System.in); //Leer valores de entrada
        ArrayList <Libro> libros = new ArrayList <>(); //Declaracion del array de forma dinamica
        String [] menu = {"1 - Ingreso de libro", "2 - Eliminar libro (buscando por ISBN)", "3 - Mostrar la lista por ISBN", "4 - Salir"};
        int respuesta = 0; //variable que se utilizara en el switch
        int isbn;          
        String autor;
        String titulo;
        int contadorComprobante = 0; //variable contador
        
        //While del menu
        while (respuesta != 4) { //Mientras se diferente de 4 (Opciones del menu)
            
            //Imprimimos menu
            for ( int contador = 0; contador < menu.length; contador++ ) {
                System.out.print("\n"+menu[contador]);
            }
            
            System.out.print("\n¿Opcion?    ");
            respuesta = leer.nextInt();
            
            switch (respuesta) {
                
                case 1: //Ingreso de los datos 
                    System.out.print("\nISBN:  ");
                    isbn = leer.nextInt();
                    leer.nextLine();
                    System.out.print("\nTítulo:  ");
                    titulo = leer.nextLine();
                    System.out.print("\nAutor:  ");
                    autor = leer.nextLine();
                    libros.add(new Libro(isbn, titulo, autor));
                    
                    break;
                    
                case 2://Emiminar un ingreso
                    System.out.print("\nIntroduce codigo ISBN a eliminar: ");
                    isbn = leer.nextInt();
                    //contadorComprobante = 1;
                    for ( int contador = 0; contador < libros.size(); contador++ ) {
                        if (isbn == libros.get(contador).getISBN()) {
                            libros.remove(contador);
                            System.out.print("\nLibro borrado.\n");
                            contadorComprobante = 0;
                        }else {
                             System.out.print("\nNo se encuentra el código ISBN en la base de datos.\n"); 
                             contadorComprobante++;
                        }
                    }
                    break;
                
                case 3://Mostrar los datos ingresados por isbn
                    leer.nextLine();
                    System.out.print("\nBuscar ISBN: ");
                    isbn = leer.nextInt();
                    
                    for ( int contador = 0; contador < libros.size(); contador++ ) {
                        if ( isbn == libros.get(contador).getISBN() ) {
                            System.out.print("\n"+"Autor: "+libros.get(contador).getAutor()+",  "+"Titulo: "+libros.get(contador).getTitulo()+",  "+"ISBN: "+libros.get(contador).getISBN()+"\n");
                        }
                    }
                    break; //cuarta opcion, salir           
            }
                    
        }
    }
}