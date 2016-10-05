//Josué Alexis Ramírez Pérez A00513622 4º Semestre
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edcircular;

/**
 *
 * @author josuealexis96
 * @param <T> tipo de dato Genérico
 */
public class nodeClass <T>{
    //Atributos
    public nodeClass next;
    T data;
    
    //Metrodos
    
    //Constructor con dato
    public nodeClass (T data){
        this.data = data;
        this.next = null;
    }
    
    //Constructor Nulo
    public nodeClass (){
        this.data = null;
        this.next = null;
    }
    
    //Getters and Setters
    public T getData(){
        return this.data;
    }
    
    public void setData(T d){
        this.data = d;
    }
}