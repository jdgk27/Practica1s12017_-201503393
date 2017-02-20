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
    public Nodo_Matriz arriba;
    public Nodo_Matriz abajo;
    public Nodo_Matriz izquierda;
    public Nodo_Matriz derecha;
    
    //public int dimension = MenuPrincipal.dimension;
    
    public Nodo_Matriz(int valor) {
        this.valor = valor;
        this.arriba = null;
        this.abajo = null;
        this.izquierda = null;
        this.derecha = null;
    }
  
    public void insertar_col(Nodo_Matriz nuevo){
        if (this.derecha != null){
            this.derecha.insertar_col(nuevo);
        }
        else{
            this.derecha = nuevo;
        }     
    }
    
    public void insertar_fila(Nodo_Matriz nuevo){
        if (this.abajo != null){
            this.abajo.insertar_col(valor);
        }
        else{
            this.abajo = nuevo;
        }     
    }
    
    public String Mostrar() {        
        
        String retorno = this.dato+"\n";
        if (this.adelante != null) {
            retorno += this.adelante.Mostrar();
        }
        return retorno;      
    }
}
