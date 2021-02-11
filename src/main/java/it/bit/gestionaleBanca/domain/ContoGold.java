package it.bit.gestionaleBanca.domain;

public class ContoGold extends ContoCorrente {


    @Override
    public double preleva(double amount) {
        return 0;
    }

    @Override
    public ContoCorrente generaContoSecondario() {
        return null;
    }
}
