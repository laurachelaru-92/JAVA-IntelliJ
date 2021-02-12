package it.bit.gestionaleBanca.domain;

public class ContoCorrenteCaimanSenzaEreditarieta {
    private ContoCorrente c = new ContoGold();

    public double getSaldo(){
        return this.c.getSaldo();
    }
    public void setSaldo(double newSaldo){
        this.c.setSaldo(newSaldo);
    }

    public void evadiLeTasse(){

    }
}
