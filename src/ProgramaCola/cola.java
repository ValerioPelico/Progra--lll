package ProgramaCola;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valerio Pelicó Guox
 * 0901-16-19957
 */
public class cola {
    NodoCola inicio, fin;
    int tamaño;
    public cola(){
    inicio=fin=null; 
    tamaño=0;
    
    }
    public boolean estavacia(){
    return inicio==null; 
   
    }
   public void insertar (int elemento){
   NodoCola nuevo= new NodoCola(elemento);
   if (estavacia()){
   inicio= nuevo;
   }else { fin.siguiente=nuevo; 
   }
   fin=nuevo;
   tamaño++;
   }
   public int quitar(){
       int aux = inicio.dato;
       inicio=inicio.siguiente;
       tamaño--;
       return aux;
   
   }
   public int inicioCola(){
   return inicio.dato;
   }
   public int tamañoCola(){
   return tamaño;
   }
}
