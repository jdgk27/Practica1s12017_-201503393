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
    public int punteo;
    public Nodo_Matriz arriba;
    public Nodo_Matriz abajo;
    public Nodo_Matriz izquierda;
    public Nodo_Matriz derecha;
    
    //public int dimension = MenuPrincipal.dimension;
    
    public Nodo_Matriz() {
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
            this.abajo.insertar_col(nuevo);
        }
        else{
            this.abajo = nuevo;
        }     
    }
    
    public void setLetra(String letra){
        this.letra = letra;
    }
    
    public String getLetra(){
        return this.letra;
    }
    
    public void setPunteo(int punteo){
        this.punteo = punteo;
    }
    
    public int getPunteo(){
        return this.punteo;
    }
    
    public String Mostrar() {        
        
        String retorno = this.letra+"\n";
        if (this.letra != null) {
            if (this.derecha != null){
                retorno += this.derecha.Mostrar();
            }
            else{
                retorno += this.abajo.Mostrar();
            }
        }
        return retorno;      
    }
}
