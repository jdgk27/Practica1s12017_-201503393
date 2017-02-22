/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201503393;

import java.awt.Color;

/**
 *
 * @author Daniel De León
 */
public class Matriz {
    public Nodo_Matriz cabeza = new Nodo_Matriz();
    public int dimension;

    public void crearMatriz(int dimension) {
        /*this.cabeza.derecha = null;
        this.cabeza.abajo=null;
        this.cabeza.izquierda = null;
        this.cabeza.arriba=null;*/
        this.dimension=dimension;
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
        
        relleno(cabeza.derecha,cabeza.derecha);
        
        /*System.out.println("contenido!!!!!!!!!!!!!!!!!!!!");
        while(conteo!=dimension){
            aux=cabeza;
            Nodo_Matriz c1 = cabeza;
            Nodo_Matriz c2 = cabeza;
            Nodo_Matriz c3 = cabeza;

            for(int j=0;j<conteo-1;j++){
                c2=c2.abajo;
                y=j+2;
            }
            System.out.println("creando fila: "+y);
            aux=c2;

            for(int i=0;i<dimension-2;i++){
                if(i==dimension-3){
                    for(int j=0;j<dimension;j++){
                        c1=c1.derecha;
                    }
                    c3=c1;
                    for(int j=0;j<conteo-1;j++){
                        c3=c3.abajo;
                    }
                    aux.derecha=c3;
                    aux.derecha.izquierda=aux;
                    aux=aux.derecha;
                    aux.arriba=c1;
                    c1.abajo=aux;
                    c1=cabeza;
                    x=i+1+1;
                    System.out.println(x);
                }
                else{
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
            }

            /*c1=c1.derecha;
            for(int j=0;j<conteo-1;j++){
                    c1=c1.abajo;
                }

            if(c1 != null){
                aux.derecha=c1;
                c1 = aux.derecha;
            }
            conteo++;
        }*/
    }
    
    public void setPunteo(int x, int y, int punteo){
        /*Nodo_Matriz aux = new Nodo_Matriz();
        aux = cabeza;
        for(int i=0;i<x;i++){
            aux=aux.derecha;
        }
        for(int i=0;i<y;i++){
            aux=aux.abajo;
        }
        aux.setPunteo(punteo);*/
        int contador =0;
        Nodo_Matriz aux= cabeza;
        
        if(x !=0){
            do{
                aux = aux.abajo;
                contador++;
            } while(contador != x);
            if(y !=0){
                contador=0;
                do{
                    aux = aux.derecha;
                    contador++;
                } while(contador != y);
                aux.setPunteo(punteo);
            }
            else{
                aux.setPunteo(punteo);
            }
        }
        else{
            if(y !=0){
                contador = 0;
                do{
                    aux= aux.derecha;
                    contador++;
                } while(contador != y);
                aux.setPunteo(punteo);
            }
        }
        aux.setPunteo(punteo);
    }
    
    public void setColor(int x, int y, Color color) {
        Nodo_Matriz aux = new Nodo_Matriz();
        aux = cabeza;
        for(int i=0;i<x;i++){
            aux=aux.derecha;
        }
        for(int i=0;i<y;i++){
            aux=aux.abajo;
        }
        aux.setColor(color);
    }
    
    public Color getColor(int x, int y){
        int contador =0;
        Nodo_Matriz aux= cabeza;
        
        if(x !=0){
            do{
                aux = aux.abajo;
                contador++;
            } while(contador != x);
            if(y !=0){
                contador=0;
                do{
                    aux = aux.derecha;
                    contador++;
                } while(contador != y);
                return aux.getColor();
            }
            else{
                return aux.getColor();
            }
        }
        else{
            if(y !=0){
                contador = 0;
                do{
                    aux= aux.derecha;
                    contador++;
                } while(contador != y);
                return aux.getColor();
            }
        }
        return aux.getColor();
    }
    
    public int getPunteo(int x, int y){
        int contador =0;
        Nodo_Matriz aux= cabeza;
        
        if(x !=0){
            do{
                aux = aux.abajo;
                contador++;
            } while(contador != x);
            if(y !=0){
                contador=0;
                do{
                    aux = aux.derecha;
                    contador++;
                } while(contador != y);
                return aux.getPunteo();
            }
            else{
                return aux.getPunteo();
            }
        }
        else{
            if(y !=0){
                contador = 0;
                do{
                    aux= aux.derecha;
                    contador++;
                } while(contador != y);
                return aux.getPunteo();
            }
        }
        return aux.getPunteo();
    }
    
    public void relleno(Nodo_Matriz actual, Nodo_Matriz puntero){
        if(actual != null){
            Nodo_Matriz temp = actual.izquierda.abajo;
            if(actual.abajo==null){
                Nodo_Matriz nuevo = new Nodo_Matriz();
                if(temp != null){
                    if(temp.derecha == null){
                        temp.derecha=nuevo;
                        nuevo.izquierda=temp;
                        actual.abajo=nuevo;
                        nuevo.arriba=actual;
                        relleno(nuevo,puntero);
                    }
                    else{
                        temp.derecha.arriba=actual;
                        actual.abajo=temp.derecha;
                        relleno(puntero.derecha, puntero.derecha);
                    }
                }
            }
            else{
                if(temp != null){
                    if(temp.derecha == null){
                        temp.derecha = actual.abajo;
                        actual.abajo.izquierda = temp;
                        relleno(actual.abajo, puntero);
                    }
                }
            }
        }
    }
}
