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
public class Nodo_Fichas {
    public char letra;
    public Nodo_Fichas adelante;

    public Nodo_Fichas(char letra) {
        this.letra = letra;
        this.adelante = null;
    }
  
    public String Mostrar() {        
        
        String retorno = this.letra+"\n";
        if (this.adelante != null) {
            retorno += this.adelante.Mostrar();
        }
        return retorno;      
    }

    public void Insertar(Nodo_Fichas nuevo) {
        if (this.adelante == null) {
            this.adelante = nuevo;
        } else {
            this.adelante.Insertar(nuevo);
        }
    }

    public char getDato() {
        return this.letra;
    }

    public void setDato(char letra) {
        this.letra = letra;
    }

    public Nodo_Fichas getAdel() {
        return adelante;
    }
    
    public void setAdel(Nodo_Fichas adelante){
        this.adelante=adelante;
    }
}
