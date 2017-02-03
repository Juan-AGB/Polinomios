package noGui;

public class Monomio {
    
    private Integer coe;
    private Integer exp;
    private Monomio monoNext;

    public Monomio(Integer coe, Integer exp) {
        this.coe = coe;
        this.exp = exp;
        monoNext = null;
    }
    
    public void mostrar() {
        System.out.println(this.coe + "X^" + this.exp + "\n");
    }
    
    public Monomio getMonoNext() {
        return monoNext;
    }
    public void setMonoNext(Monomio monoNext) {
        this.monoNext = monoNext;
    }
    public Integer getCoe() {
        return coe;
    }
    public void setCoe(Integer coe) {
        this.coe = coe;
    }
    public Integer getExp() {
        return exp;
    }
    public void setExp(Integer exp) {
        this.exp = exp;
    }
}
