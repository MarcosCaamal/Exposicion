
package pilasmetodos;

import java.util.Stack;
public class PilasMetodos {

    public static void main(String[] args) {
        Stack pila =new Stack();
        pila.push("elemento 1");
        pila.push("elemento 2");
        pila.push("elemento 3");
        
        System.out.println("1- push: "+ pila);
        pila.pop();
        System.out.println("2- pop: "+ pila);
       //Object z = pila.peek();
        System.out.println("3- peek: "+pila.peek());
        //boolean y = pila.empty();
        System.out.println("4- empty: "+pila.empty());
        System.out.println("5.- search: "+pila.search("elemento 2"));//desde arriba hacia abajo
       
        Stack <String> pila2=new Stack();
        for (int x=1;x<=10;x++){//llenado de una pila con un for
            pila2.push(Integer.toString(x));
        }
        while (!pila2.empty()){//vaciamos la pila imprimiendo con pantalla los valores quitados
            System.out.println(pila2.pop());
        }
        System.out.println("Datos de mi pila: "+pila2);//imprimimos e contenido de la pila*/
    }
    
}
