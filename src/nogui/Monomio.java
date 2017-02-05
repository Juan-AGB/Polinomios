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
    public Monomio() {
        coe = 0;
        exp = 0;
        monoNext = null;
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
