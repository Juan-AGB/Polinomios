package noGui;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        Polinomio poli1 = new Polinomio();
        Polinomio poli2 = new Polinomio();
        Polinomio poliR = new Polinomio ();
        
//        int r;
//        do {
//            
//        } while (r != 0);
        
        Random rand = new Random ();
        //Los coeficientes, exponentes y número de polinomios se pueden cambiar al gusto
        for (int i = 0; i < 8; i++) {  //Al menos esa es la idea
            poli1.insertar(rand.nextInt(3)+1, rand.nextInt(5)+1);
        }
        for (int i = 0; i < 8; i++) {
            poli2.insertar(rand.nextInt(3)+1, rand.nextInt(5)+1);
        }
        
        poli1.ordenar();
        poli2.ordenar();
        
        poli1.simplificar();
        poli2.simplificar();
        
//        System.out.println("Sumando Listas...\n");
//        poliR.sumar(poli1, poli2);
//        poliR.mostrarTodo();
//        System.out.println("Restando Listas...\n");
//        poliR.restar(poli1, poli2);
//        poliR.mostrarTodo();
        System.out.println("Multiplicando Listas...\n");
        poliR.multiplicar(poli1, poli2);
        poliR.mostrarTodo();
//        System.out.println("Dividiendo Listas...\n");
//        poli.dividir(poli2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
