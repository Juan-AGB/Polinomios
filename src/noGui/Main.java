package noGui;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        Polinomio poli = new Polinomio();
        Polinomio poli2 = new Polinomio();
        Polinomio poliR = new Polinomio ();
        Random rand = new Random ();
        //Los coeficientes, exponentes y número de polinomios se pueden cambiar al gusto
        for (int i = 0; i < 10; i++) {  //Al menos esa es la idea
            poli.insertar(rand.nextInt(5)+1, rand.nextInt(3)+1);
        }
        for (int i = 0; i < 10; i++) {
            poli2.insertar(rand.nextInt(5)+1, rand.nextInt(3)+1);
        }
        
//        System.out.println("Imprimiendo 1er Polinomio");
//        poli.mostrarTodo();
//        System.out.println("Imprimiendo 2o Polinomio");
//        poli2.mostrarTodo();
        
        poli.ordenar();
        poli2.ordenar();
        
        //System.out.println("Ordenando..." + "\n1er Polinomio:\n");
        //poli.mostrarTodo();
        //System.out.println("\n2o Polinomio:\n");
        //poli2.mostrarTodo();
        
        //System.out.println("Reduciendo..." + "\n1er Polinomio");
        poli.simplificar();
        //poli.mostrarTodo();
        //System.out.println("Reduciendo..." + "\n2o Polinomio");
        poli2.simplificar();
        //poli2.mostrarTodo();
        
        System.out.println("Sumando Listas...\n");
        poliR.sumar(poli, poli2);
        poliR.mostrarTodo();
//        System.out.println("Restando Listas...\n");
//        poli.sumar(poli2);
//        
//        System.out.println("Multiplicando Listas...\n");
//        poli.sumar(poli2);
//        
//        System.out.println("Dividiendo Listas...\n");
//        poli.sumar(poli2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
