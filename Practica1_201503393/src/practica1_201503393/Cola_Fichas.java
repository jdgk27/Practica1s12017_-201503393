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
public class Cola_Fichas {
    private Nodo_Fichas primera;
    public int cuenta;

    public Cola_Fichas() {
        this.primera = null;
    }

    public void push(char letra) {
        Nodo_Fichas nuevo = new Nodo_Fichas(letra);

        if (this.primera == null) {
            this.primera = nuevo;
        } else {
            this.primera.Insertar(nuevo);
        }
    }

    public String Mostrar() throws NullPointerException {
        if (this.primera != null) {
            return this.primera.Mostrar();
        } else {
            return "La categoría está vacia";
        }
    }

    public Nodo_Fichas getCabeza() {
        return primera;
    }

    public void setCabeza(Nodo_Fichas cabeza) {
        this.primera = cabeza;
    }  
    
    public char pop(){
        char letra;
        letra = this.primera.getDato();
        this.primera = this.primera.adelante;
        return letra;
    }
}
