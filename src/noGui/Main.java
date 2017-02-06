package noGui;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Polinomio poli1 = new Polinomio();
        Polinomio poli2 = new Polinomio();
        
        Scanner sc = new Scanner(System.in);
        int r;
        Random rand = new Random ();
        
        //Los coeficientes, exponentes y número de polinomios se pueden cambiar al gusto
        for (int i = 0; i < 8; i++) {  //Al menos esa es la idea
            poli1.insertar(rand.nextInt(3)+1, rand.nextInt(5)+1);
        }   
        for (int i = 0; i < 8; i++) {
            poli2.insertar(rand.nextInt(3)+1, rand.nextInt(5)+1);
        }
        System.out.println("1) Imprimir polinomios\n"
                + "2) Ordenar polinomios(se imprimen al terminar el ordenamiento)\n"
                + "3) Simplificar polinomios(se imprimen al terminar el ordenamiento)\n"
                + "4) Sumar polinomios (Se imprime el polinomio resultante)\n"
                + "5) Restar polinomios (Se imprime el polinomio resultante)\n"
                + "6) Multiplicar polinomios (Se imprime el polinomio resultante)\n"
                + "7) Próximamente en la siguiente actualización :D\n"
                    + "0) Salir.");
        r = sc.nextInt();
        while (r != 0) {
            switch (r) {
                case 1:
                    System.out.println("Polinomio 1:\n");
                    poli1.mostrarTodo();
                    System.out.println("\nPolinomio 2:\n");
                    poli2.mostrarTodo();
                    break;
                case 2:
                    poli1.ordenar();
                    poli2.ordenar();
                    System.out.println("Polinomio 1:\n");
                    poli1.mostrarTodo();
                    System.out.println("\nPolinomio 2:\n");
                    poli2.mostrarTodo();
                    break;
                case 3:
                    poli1.ordenar();
                    poli2.ordenar();
                    poli1.simplificar();
                    poli2.simplificar();
                    System.out.println("Polinomio 1:\n");
                    poli1.mostrarTodo();
                    System.out.println("\nPolinomio 2:\n");
                    poli2.mostrarTodo();
                    break;
                case 4:
                    poli1.ordenar();
                    poli2.ordenar();
                    poli1.simplificar();
                    poli2.simplificar();
                    Polinomio poliS = new Polinomio();
                    poliS.sumar(poli1, poli2);
                    System.out.println("Polinomio resultante\n");
                    poliS.mostrarTodo();
                    break;
                case 5:
                    poli1.ordenar();
                    poli2.ordenar();
                    poli1.simplificar();
                    poli2.simplificar();
                    Polinomio poliR = new Polinomio();
                    poliR.restar(poli1, poli2);
                    System.out.println("Polinomio resultante\n");
                    poliR.mostrarTodo();
                    break;
                case 6:
                    poli1.ordenar();
                    poli2.ordenar();
                    poli1.simplificar();
                    poli2.simplificar();
                    Polinomio poliM = new Polinomio();
                    poliM.multiplicar(poli1, poli2);
                    System.out.println("Polinomio resultante\n");
                    poliM.mostrarTodo();
                    break;
            }
            System.out.println("\n...");
            r = sc.nextInt();
        }
        
//        System.out.println("Dividiendo Listas...\n");
//        poli.dividir(poli2);
    }
    
}
