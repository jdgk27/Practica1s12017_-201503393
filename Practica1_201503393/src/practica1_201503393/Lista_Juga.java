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
public class Lista_Juga {
    public Nodo_Juga nc;
    private Lista_fj ls;
    public int conteo;
    
    public Lista_Juga(){
        nc=null;
        ls=null;
        conteo=1;
    }
    
    public Lista_Juga insertar(String titulo, Lista_fj ls){
        Nodo_Juga nuevo;
        nuevo=new Nodo_Juga(titulo, ls);
        
        if(nc != null){
            nuevo.siguiente=nc.siguiente;
            nc.siguiente=nuevo;
            conteo++;
        }
        nc=nuevo;
        return this;
    }
    
    public boolean estaVacia(){
        if(nc != null){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void eliminar(String eli){
        Nodo_Juga actual;
        boolean encontrado=false;
        
        actual=nc;
        while((actual.siguiente != nc) && (!encontrado)){
            encontrado=(actual.siguiente.titulo == eli);
            if(!encontrado){
                actual=actual.siguiente;
            }
        }
        encontrado=(actual.siguiente.titulo==eli);
        
        if(encontrado){
            Nodo_Juga p;
            p=actual.siguiente;
            if(nc==nc.siguiente){
                nc=null;
            }
            else{
                if(p==nc){
                    nc=actual;
                }
                actual.siguiente=p.siguiente;
            }
            p=null;
        }
    }
    
    public void agregar (Lista_fj ls){
        this.ls=ls;
    }
    
    public void mostrar(){
        Nodo_Juga p;
        if(nc !=null){
            p=nc.siguiente;
            do{
                System.out.println("\t"+"Jugador:"+p.titulo);
                System.out.println("Fichas: \n"+p.ls.Mostrar());
                p=p.siguiente;
            }
            while(p !=nc.siguiente);
        }
        else{
            System.out.println("\t No hay jugadores");
        }
    }
    
    public String[] enviarT(){
        Nodo_Juga p;
        String[]tit=new String[conteo];
        System.out.println(conteo);
        int i=0;
        if(nc !=null){
            p=nc.siguiente;
            do{
                if(i<conteo){
                    tit[i]=p.titulo;
                    System.out.println(p.titulo);
                    System.out.println(tit[i]);
                    p=p.siguiente;
                    i++;
                }
            }
            while(p !=nc.siguiente);
        }
        return tit;
    }
    
    public Nodo_Juga buscar(String vamo){
        Nodo_Juga hola;
        boolean encontrado=false;
        
        hola=nc;
        System.out.println(nc.titulo);
        while((hola.siguiente != nc) && (!encontrado)){
            encontrado=(hola.siguiente.titulo.equals(vamo));
            if(!encontrado){
                hola=hola.siguiente;
            }
        }
        return hola.siguiente;
    }
    
    public String[] todo(){
        Nodo_Juga p;
        String[]todai=new String[(conteo*(nc.ls.cuenta))-conteo];
        System.out.println((conteo*(nc.ls.cuenta))-conteo);
        int i=0;
        if(nc !=null){
            for(int j=0; j<todai.length;j++){
                p=nc.siguiente;
                do{
                    try{//if(i<conteo){
                        String[] aux=(String[]) p.ls.enviarD();
                        todai[i]=aux[j];
                        System.out.println(p.titulo);
                        System.out.println(todai[i]);
                        p=p.siguiente;
                        i++;
                    }
                    catch(Exception ex){}
                }
                while(p !=nc.siguiente);
            }
        }
        return todai;
    }
}
