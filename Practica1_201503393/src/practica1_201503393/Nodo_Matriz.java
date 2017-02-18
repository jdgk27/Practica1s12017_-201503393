/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201503393;

/**
 *
 * @author Daniel De León
 */
public class Nodo_Matriz {
    
    public String letra;
    public int valor;
    public Nodo_Matriz cabeza;
    public Nodo_Matriz arriba;
    public Nodo_Matriz abajo;
    public Nodo_Matriz izquierda;
    public Nodo_Matriz derecha;
    
    //public int dimension = MenuPrincipal.dimension;
    
    public Nodo_Matriz(int valor) {
        this.cabeza.derecha=null;
        this.cabeza.abajo=null;
        this.valor = valor;
        this.arriba = null;
        this.abajo = null;
        this.izquierda = null;
        this.derecha = null;
    }
  
    public void insertar_col(int valor){
        Nodo_Matriz nuevo = new Nodo_Matriz(valor);
        if (cabeza.derecha != null){
            cabeza.derecha.insertar_col(valor);
        }
        else{
            cabeza.derecha = nuevo;
        }     
    }
    
    public void insertar_fila(int valor){
        Nodo_Matriz nuevo = new Nodo_Matriz(valor);
        if (cabeza.abajo != null){
            cabeza.abajo.insertar_col(valor);
        }
        else{
            cabeza.abajo = nuevo;
        }     
    }
}
