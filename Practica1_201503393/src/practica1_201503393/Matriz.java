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
public class Matriz {
    private Nodo_Matriz cabeza;

    public Matriz() {
        this.cabeza.derecha = null;
        this.cabeza.abajo=null;
    }
    
    public void insertar_col(int valor){
        Nodo_Matriz nuevo = new Nodo_Matriz(valor);
        if (cabeza.derecha != null){
            cabeza.derecha.insertar_col(nuevo);
        }
        else{
            cabeza.derecha = nuevo;
        }     
    }
    
    public void insertar_fila(int valor){
        Nodo_Matriz nuevo = new Nodo_Matriz(valor);
        if (cabeza.abajo != null){
            cabeza.abajo.insertar_col(nuevo);
        }
        else{
            cabeza.abajo = nuevo;
        }     
    }
    
    public void push(int valor){
        
    }

    public String Mostrar() throws NullPointerException {
        if (this.cabeza != null) {
            return this.cabeza.Mostrar();
        } else {
            return "La categoría está vacia";
        }
    }
    
    public void Letra(Nodo_Matriz nodo, String letra){
        
    }
}
