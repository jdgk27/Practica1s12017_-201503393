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
    public Nodo_Matriz cabeza;

    public void crearMatriz(int dimension) {
        this.cabeza.derecha = null;
        this.cabeza.abajo=null;
        this.cabeza.izquierda = null;
        this.cabeza.arriba=null;
        
        Nodo_Matriz nuevo = new Nodo_Matriz();
        Nodo_Matriz aux = cabeza;
        for(int i=0;i<dimension;i++){
            aux.derecha=nuevo;
            aux.derecha.izquierda=aux;
            aux=aux.derecha;
        }
        
    }
    
    /*public void insertar_col(int valor){
        Nodo_Matriz nuevo = new Nodo_Matriz(valor);
        boolean valido = false;
        if (cabeza.derecha == null){
            cabeza.derecha.insertar_col(nuevo);
            cabeza.derecha.izquierda = cabeza;
        }
        else{
            Nodo_Matriz aux = cabeza.derecha;
            while(valido == false){
                if(aux.derecha == null){
                    aux.derecha=nuevo;
                    aux.derecha.izquierda=aux;
                    valido = true;
                }
                else{
                    aux = aux.derecha;
                }
            }          
        }     
    }
    
    public void insertar_fila(int valor){
        Nodo_Matriz nuevo = new Nodo_Matriz(valor);
        boolean valido = false;
        if (cabeza.abajo == null){
            cabeza.abajo.insertar_col(nuevo);
            cabeza.abajo.arriba = cabeza;
        }
        else{
            Nodo_Matriz aux = cabeza.abajo;
            while(valido == false){
                if(aux.abajo == null){
                    aux.abajo=nuevo;
                    aux.abajo.arriba=aux;
                    valido = true;
                }
                else{
                    aux = aux.abajo;
                }
            }          
        }     
    }
    
    public void push(int punteo, int valorx,int valory){
        Nodo_Matriz nuevo = new Nodo_Matriz(-1);
        
    }

    public String Mostrar() throws NullPointerException {
        if (this.cabeza != null) {
            return this.cabeza.Mostrar();
        } else {
            return "La categoría está vacia";
        }
    }
    
    public void Letra(Nodo_Matriz nodo, String letra){
        
    }*/
}
