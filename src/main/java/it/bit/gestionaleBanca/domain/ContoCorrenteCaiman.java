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
    public double preleva(double amount) {
        this.saldo -= 0.99*amount;
        return this.saldo;
    }

    @Override
    public double deposita(double amount){
        this.saldo = 1.1*amount;
        return saldo;
    }

    @Override
    public ContoCorrenteCaiman generaContoSecondario() {
        ContoCorrenteCaiman nuovoContoCaiman = new ContoCorrenteCaiman("abcd", 1000);
        double terzoSaldo = this.saldo/3;
        // this.saldo = this.saldo - terzoSaldo;
        setSaldo(this.getSaldo() - terzoSaldo);
        nuovoContoCaiman.setSaldo(terzoSaldo);

        /*ContoCorrente risultato = null;
        //risultato = (ContoCorrente) nuovoContoCaiman;
        risultato = nuovoContoCaiman;

        return risultato;*/
        return  nuovoContoCaiman;

        // return (ContoCorrente) nuovoContoCaiman;
    }
}
