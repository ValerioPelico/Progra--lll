package ListasSimples;

import Nomina.*;

/**
 *
 * @autor Angel Ruiz
 * 0901-16-17865
 */
public class Libro implements Comparable <Libro> { //Clase abstracta, implemtentacion de la interfaz libro
    //variables a utilizar 
    private int isbn;
    private String titulo;
    private String autor;
    
    public Libro () {}
    
    public Libro (int isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }
    //Metodos getter y setter  
    
    //Getters, obtine el valor asignado a un atributo
    public int getISBN () {
        return this.isbn;
    }
    
    public String getAutor () {
        return this.autor;
    }
    
    public String getTitulo () {
        return this.titulo;
    }
    //Setters asigna un valor inicial a un atributo
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor (String autor) {
        this.autor = autor;
    }
    
    @Override
    public int compareTo(Libro o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}