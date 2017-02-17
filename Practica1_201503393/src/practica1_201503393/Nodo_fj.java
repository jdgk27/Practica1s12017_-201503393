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
public class Nodo_fj {
     public Object dato;
    public Nodo_fj adelante;

    public Nodo_fj(Object dato) {
        this.dato = dato;
        this.adelante = null;
    }

    
    public String Mostrar() {        
        
        String retorno = this.dato+"\n";
        if (this.adelante != null) {
            retorno += this.adelante.Mostrar();
        }
        return retorno;      
    }

    public void Insertar(Nodo_fj nuevo) {
        if (this.adelante == null) {
            this.adelante = nuevo;
        } else {
            this.adelante.Insertar(nuevo);
        }
    }

    public Object getDato() {
        return this.dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo_fj getAdel() {
        return adelante;
    }
    
    public void setAdel(Nodo_fj adelante){
        this.adelante=adelante;
    }
}
