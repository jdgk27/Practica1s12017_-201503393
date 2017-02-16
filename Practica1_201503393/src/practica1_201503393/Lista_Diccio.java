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
public class Lista_Diccio {
    private Nodo_Diccio primera;
    public int cuenta;

    public Lista_Diccio() {
        this.primera = null;
        cuenta=1;
    }

    public void push(Object dato) {
        Nodo_Diccio nuevo = new Nodo_Diccio(dato);

        if (this.primera == null) {
            this.primera = nuevo;
        } else {
            this.primera.Insertar(nuevo);
            cuenta++;
        }
    }

    public String Mostrar() throws NullPointerException {
        if (this.primera != null) {
            return this.primera.Mostrar();
        } else {
            return "La categoría está vacia";
        }
    }

    public Nodo_Diccio getCabeza() {
        return primera;
    }

    public void setCabeza(Nodo_Diccio cabeza) {
        this.primera = cabeza;
    }
    
    public Nodo_Diccio indice;
    
    public String Buscar(Object buscar) {
        indice = this.primera;
        for (indice = primera; indice != null; indice = indice.adelante) {
            if ( buscar.toString().equals(indice.getDato())) {
                String asd = "Dato: "+indice.getDato(); 
                return asd;
            }
        }
        return null;
    }
    
    public void Eliminar(Object buscar){
        Nodo_Diccio actual, anterior;
        boolean encontrado;
        actual= primera;
        anterior= null;
        encontrado= false;
        
        while ((actual!=null)&& (!encontrado)){
            encontrado=(actual.getDato().equals(buscar));
            if(!encontrado){
                anterior=actual;
                actual=actual.adelante;
            }
        } 
        if (actual != null){
            if(actual==primera){
                primera=actual.adelante;
            }else{
                anterior.adelante=actual.adelante;
            }
            actual=null;
        }
    }
    
    public Object[] enviarD(){
        Object dat[]=new String[cuenta];
        System.out.println(cuenta);
        Nodo_Diccio n;
        int k = 0;
        n = primera;
        while (n != null){
            dat[k]=n.dato;
            n = n.adelante;
            k++;
        }
        return dat;
    }
}
