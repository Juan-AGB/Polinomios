package noGui;

import java.util.Objects;

public class Polinomio {
    
    private Monomio inicio;
    
    public Polinomio() {
        inicio = null;
    }
    
    public boolean isListaVacia() {
    return inicio == null;
    }
    
    public void insertar(Integer coe, Integer exp) {
        Monomio nuevo = new Monomio(coe,exp);
        if (isListaVacia()) {
            inicio = nuevo;
        } else {
            Monomio aux = inicio;
            
            while (aux.getMonoNext() != null) {
                aux = aux.getMonoNext();
            }
            aux.setMonoNext(nuevo);
        } 
    }
    public void mostrarTodo() {
        if (inicio.getCoe() != 0) {
            if (inicio.getCoe() != 1) {
                System.out.print(inicio.getCoe() + "X^" + inicio.getExp());
            }
            else {
                System.out.print("X^" + inicio.getExp());
            }
        }
        Monomio aux = inicio.getMonoNext();
        while (aux != null) {
            if (aux.getCoe() != 0) {
                if (aux.getCoe() > 0) {
                    System.out.print(" +");
                }
                if (aux.getCoe() != 1) {
                    System.out.print(" " + aux.getCoe());
                }
                System.out.print("X^" + aux.getExp());
            }
            aux = aux.getMonoNext();
        }
    }
    public void ordenar() {
        Monomio aux1 = inicio;
        while (aux1 != null) {
            Monomio aux2 = aux1.getMonoNext();
            while (aux2 != null) {
                if (aux1.getExp() > aux2.getExp()) {
                    Monomio aux3 = new Monomio(aux1.getCoe(),aux1.getExp());
                    aux1.setCoe(aux2.getCoe());
                    aux1.setExp(aux2.getExp());
                    aux2.setCoe(aux3.getCoe());
                    aux2.setExp(aux3.getExp());
                }
                aux2 = aux2.getMonoNext();
            }
            aux1 = aux1.getMonoNext();
        }
    }
    public void simplificar() {
        Monomio aux = inicio;
        Monomio aux2 = aux.getMonoNext();
        while (aux2 != null) {
            if (aux.getExp() == aux2.getExp()) {
                aux.setCoe(aux.getCoe() + aux2.getCoe());
                aux2 = aux2.getMonoNext();
                aux.setMonoNext(aux2); //
                }
            else {
                
                aux.setMonoNext(aux2);
                aux = aux2;
                aux2 = aux2.getMonoNext();
            }
        }
    }
    
    public void sumar(Polinomio poli1, Polinomio poli2) {
        Monomio auxPoli1 = poli1.getInicio();
        Monomio auxPoli2 = poli2.getInicio();
        
        while (auxPoli1 != null && auxPoli2 != null) {
            if (auxPoli1.getExp() > auxPoli2.getExp()) {
                this.insertar(auxPoli2.getCoe(), auxPoli2.getExp());
                auxPoli2 = auxPoli2.getMonoNext();
            }
            else {
                if (auxPoli1.getExp() < auxPoli2.getExp()) {
                    this.insertar(auxPoli2.getCoe(), auxPoli1.getExp());
                    auxPoli1 = auxPoli1.getMonoNext();
                } else {
                    this.insertar(auxPoli1.getCoe() + auxPoli2.getCoe(), auxPoli1.getExp());
                    auxPoli1 = auxPoli1.getMonoNext();
                    auxPoli2 = auxPoli2.getMonoNext();             
                }
            }
        }
        while (auxPoli1 != null) {
            this.insertar(auxPoli1.getCoe(), auxPoli1.getExp());
            auxPoli1 = auxPoli1.getMonoNext();
        }
        while (auxPoli2 != null) {
            this.insertar(auxPoli2.getCoe(), auxPoli2.getExp());
            auxPoli2 = auxPoli2.getMonoNext();
        }
    }
    public void restar(Polinomio poli1, Polinomio poli2) {
        Monomio auxPoli1 = poli1.getInicio();
        Monomio auxPoli2 = poli2.getInicio();
        
        while (auxPoli1 != null && auxPoli2 != null) {
            if (auxPoli1.getExp() > auxPoli2.getExp()) {
                this.insertar(auxPoli2.getCoe(), auxPoli2.getExp());
                auxPoli2 = auxPoli2.getMonoNext();
            }
            else {
                if (auxPoli1.getExp() < auxPoli2.getExp()) {
                    this.insertar(auxPoli2.getCoe(), auxPoli1.getExp());
                    auxPoli1 = auxPoli1.getMonoNext();
                } else {
                    this.insertar(auxPoli1.getCoe() - auxPoli2.getCoe(), auxPoli1.getExp());
                    auxPoli1 = auxPoli1.getMonoNext();
                    auxPoli2 = auxPoli2.getMonoNext();             
                }
            }
        }
        while (auxPoli1 != null) {
            this.insertar(auxPoli1.getCoe(), auxPoli1.getExp());
            auxPoli1 = auxPoli1.getMonoNext();
        }
        while (auxPoli2 != null) {
            this.insertar(auxPoli2.getCoe(), auxPoli2.getExp());
            auxPoli2 = auxPoli2.getMonoNext();
        }
    }
    public void multiplicar(Polinomio poli1, Polinomio poli2) {
        
    }
    public void dividir(Polinomio poli2) {
        
    }
    
    
    
    public Monomio getInicio() {
        return inicio;
    }
    public void setInicio(Monomio inicio) {
        this.inicio = inicio;
    }
}
