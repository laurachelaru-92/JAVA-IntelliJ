package it.bit.gestionaleBanca.domain;

public class ContoCorrenteCaiman extends ContoCorrente{

    private String codiceSegreto;
    public ContoCorrenteCaiman(String codiceSegreto, double saldo){
        super(saldo);
//        super();
//        this.saldo = saldo;
        this.codiceSegreto = codiceSegreto;

    }
    public void evadiLeTasse(){
        System.out.println(this.saldo);
    }

    @Override
    public double deposita(double amount){
        this.saldo = 1.1*amount;
        return saldo;
    }
}
