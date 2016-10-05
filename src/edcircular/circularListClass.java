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
 */
public class circularListClass <T> {
    
    //Atributos
    public nodeClass pivot;
    
    //Constructor
    public circularListClass(){
        pivot = null;
    }
    
    //Métodos
    public void insert(T data){
        //Creamos nuestro nodo a insertar
        nodeClass node = new nodeClass(data);
        if(!isEmpty()){//Si no está vacia la lista
            //Insertamos el nodo al inicio y recorremos los nodos
            node.next = pivot;
            findLast().next = node;
            pivot = node;
        }
        else{//Si la lista esta vacia
            pivot = node;
            node.next = pivot;
        }
    }
    
    public boolean isEmpty(){
        return pivot == null;
    }
    
    private nodeClass findLast(){//Se esta creando un metodo que sera utilizado en el metodo de
        //insertar un nodo para de esta forma ubicar el ultimo nodo y que apunte al nodo creado
        nodeClass aux = pivot;//Empezamos por crear un apuntador auxiliar que este apuntando
        //a nuestro pivote
        do{//Entramos a un ciclo en donde empezaremos a recorrer nuestra lista
            aux = aux.next;
        } 
        while(aux.next != pivot);//Todo esto mientras que lo que sigue no este apuntando a pivote
        //Esto nos sirve para ubicar el ultimo nodo, ya que el ultimo nodo siempre esta apuntando al nodo
        //en donde el pivote esta apuntando
        return aux;
    }
    
    /*
    public boolean eNode(T data){//Se crea un método para borrar un nodo en especifico
        nodeClass aux = searchNode(data);//Se crea nodo que se utiliza para guardar el valor
        //del dato que se desea buscar en el nodo usando el metodo searchNode
        if (aux==null){//Si al recorrer los nodos, el auxiliar llega hasta el valor null
            //significa que no se encontro el nodo
            System.out.println("No se encontró el nodo");//y por este motivo se manda un mensaje
            //notificando que el nodo no se encontró
            return false;//regresando así un valor boolean falso
        }
        else{
            if(aux == pivot){//Si al comparar el auxiliar con el primer nodo y exitosamente es el nodo
                //que se esta buscando
                pivot = pivot.next;//Se elimina el primer nodo
            }
        }
        return true;
    }
    */
    
    public nodeClass searchNode(T data){//Se crea un metodo con el cual estaremos buscando
        //un dato que querramos encontrar en nuestra lista circular
        nodeClass point = pivot;//creamos un puntero que este apuntando al pivote para ir
        //verificando nodo por nodo
        if(isEmpty()){
            System.out.println("La lista está vacia");//En caso de que la lista este vacia
            //Se desplegara un mensaje confirmando esto anterior
            return null;
        }
        else{//De lo contrario
            if(point.data == data){//Si se realiza una comparación entre el dato que esta en el nodo
                //apuntado y el dato que estamos intentando buscar en la lista
                return point;//Se regresa el valor del nodo y ahi termina nuestra busqueda
            }
            else{//Si lo contrario no se cumple quiere decir que no se encuentra en el pivote y
                point = point.next;//se necesita mover el puntero para ir verificando valor por valor
                while(point.data != data && point != pivot){//El puntero se va recorriendo mientras se cumplan dos condiciones
                    //si el valor del puntero es diferente al valor que queremos encontrar y si no estamos en el pivote
                    point = point.next;
                }
                if(point.data == data){//Si el Apuntador encontro el dato, despliega el mensaje
                    //comunicando que el nodo se encuentra en la lista
                    System.out.println("El nodo esta disponible en el la lista");
                    return point;//Regresando de esta forma el valor que se encontro en el nodo apuntado
                }
                else{//En caso contrario, recorrio toda la lista y no encontro el número
                    //y de la misma forma, desplegara un mensaje comunicando que el valor no se encontró en
                    //la lista
                    System.out.println("El nodo no se encuentra disponible dentro de la lista");
                    return null;
                }
            }
        }
    }
    
    public void showList(){
        if(isEmpty()){
            System.out.println("La lista está vacia");
        }
        else{
            nodeClass aux;
            aux = pivot;
            System.out.print("pivot == >");
            do{
                System.out.print(" [ " + aux.getData() + " ] ==>");
                aux = aux.next;
            } while(aux.next != pivot.next);
        }
    }
}