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
public class EDCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        circularListClass Lista = new circularListClass();
        Lista.insert(30);
        Lista.showList();
        System.out.println("");
        Lista.insert(14);
        Lista.showList();
        System.out.println("");
        Lista.insert(6);
        Lista.showList();
        System.out.println("");
        Lista.searchNode(1);
        Lista.insert(1);
        Lista.showList();
        System.out.println("");
        Lista.searchNode(6);
        //Lista.eNode(1);
        //Lista.showList();
    }
    
}
