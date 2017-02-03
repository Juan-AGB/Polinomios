package noGui;

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
        
        Monomio aux = inicio;
        while (aux != null) {
            aux.mostrar();
            aux = aux.getMonoNext();
        }
    }
    public void simplifica() {
        
    }
    public void sumar() {
        
    }
    public void restar() {
        
    }
    public void multiplicar() {
        
    }
    public void dividir() {
        
    }
    
    
    
    public Monomio getInicio() {
        return inicio;
    }
    public void setInicio(Monomio inicio) {
        this.inicio = inicio;
    }
}
