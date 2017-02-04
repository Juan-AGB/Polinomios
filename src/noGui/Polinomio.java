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
