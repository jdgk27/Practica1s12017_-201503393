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
public class Nodo_Juga {
   public String titulo;
    
    public Nodo_Juga siguiente;
    public Lista_fj ls;
    
    public Nodo_Juga(String titulo, Lista_fj ls){
        this.titulo = titulo;
        this.siguiente = this;
        this.ls=ls;
    }
    
    public void Insertar (Nodo_Juga nvo){
        if (this.siguiente == null) {
            this.siguiente = nvo;
        } else {
            this.siguiente.Insertar(nvo);
        }
    }
    
    public String Mostrar(){
        String retorno = "Categoría: " + this.titulo + "\r\n";
        if (this.siguiente != null) {
            retorno += this.siguiente.Mostrar();
        }
        return retorno;
    }
    
    
    public Nodo_Juga get(int nth, int pos){
        if (nth == pos) {
            return this;
        } else {
            if (this.siguiente != null) {
                return this.siguiente.get(nth, pos + 1);
            } else {
                return null;
            }
        }
    }
    
    public Nodo_Juga getSiguiente(){
        return this.siguiente;
    }
    
    public void setSiguiente(Nodo_Juga siguiente){
        this.siguiente=siguiente;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public void setAbajo(Lista_fj ls){
        this.ls=ls;
    }
    
    public Lista_fj getAbajo(){
        return this.ls;
    }
    
}
