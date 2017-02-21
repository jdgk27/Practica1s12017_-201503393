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
    public Nodo_Matriz cabeza = new Nodo_Matriz();

    public void crearMatriz(int dimension) {
        /*this.cabeza.derecha = null;
        this.cabeza.abajo=null;
        this.cabeza.izquierda = null;
        this.cabeza.arriba=null;*/
        
        Nodo_Matriz nuevo = new Nodo_Matriz();
        Nodo_Matriz aux = cabeza;
        int x =0;
        int y=0;
        System.out.println("primera fila!!!!!!!!!!!!!!!!!!!!");
        for(int i=0;i<dimension;i++){
            aux.derecha=nuevo;
            aux.derecha.izquierda=aux;
            aux=aux.derecha;
            System.out.println((i +1) + "," + 1);
        }
        
        System.out.println("ultima columna!!!!!!!!!!!!!!!!!!!!");
        for(int i=0;i<dimension;i++){
            aux.abajo=nuevo;
            aux.abajo.arriba=aux;
            aux=aux.abajo;
            System.out.println(dimension + "," + (i+1));
        }
        
        System.out.println("ultima fila!!!!!!!!!!!!!!!!!!!!");
        for(int i=0;i<dimension;i++){
            aux.izquierda=nuevo;
            aux.izquierda.derecha=aux;
            aux=aux.izquierda;
            System.out.println((dimension -i) + "," + dimension);
        }
        
        System.out.println("primera columna!!!!!!!!!!!!!!!!!!!!");
        for(int i=0;i<dimension-1;i++){
            aux.arriba=nuevo;
            aux.arriba.abajo=aux;
            aux=aux.arriba;
            System.out.println(1 + "," + (dimension -i));
        }
        
        aux.arriba=cabeza;
        cabeza.abajo=aux;
        int conteo=2;
        
        System.out.println("contenido!!!!!!!!!!!!!!!!!!!!");
        while(conteo!=dimension){
            aux=cabeza;
            Nodo_Matriz c1 = cabeza;
            Nodo_Matriz c2 = cabeza;

            for(int j=0;j<conteo-1;j++){
                c2=c2.abajo;
                y=j+2;
            }
            System.out.println("creando fila: "+y);
            aux=c2;

            for(int i=0;i<dimension-2;i++){
                for(int j=-1;j<i;j++){
                    c1=c1.derecha;
                }
                aux.derecha=nuevo;
                aux.derecha.izquierda=aux;
                aux=aux.derecha;
                aux.arriba=c1;
                c1.abajo=aux;
                c1=cabeza;
                x=i+1+1;
                System.out.println(x);
            }

            c1=c1.derecha;
            for(int j=0;j<conteo-1;j++){
                    c1=c1.abajo;
                }

            if(c1 != null){
                aux.derecha=c1;
                c1 = aux.derecha;
            }
            conteo++;
        }
    }
    
    public void setPunteo(int x, int y, int punteo){
        Nodo_Matriz aux = new Nodo_Matriz();
        aux = cabeza;
        for(int i=0;i<x;i++){
            aux=aux.derecha;
        }
        for(int i=0;i<y;i++){
            aux=aux.abajo;
        }
        aux.setPunteo(punteo);
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
