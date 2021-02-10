package it.bit.gestionaleBanca.domain;

public class ContoCorrenteCaimanSenzaEreditarieta {
    private ContoCorrente c = new ContoCorrente();

    public double getSaldo(){
        return this.c.getSaldo();
    }
    public void setSaldo(double newSaldo){
        this.c.setSaldo(newSaldo);
    }

    public void evadiLeTasse(){

    }
}
