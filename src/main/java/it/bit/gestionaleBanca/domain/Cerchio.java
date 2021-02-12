package it.bit.gestionaleBanca.domain;

public class Cerchio {

    private double raggio;
    private static int numCerchi;

    public double calcolaPerimetro(){
        return 0;
    }

    public Cerchio(double r){
        raggio = r;
        numCerchi++;
    }

    public static void main(String[] args) {

        Cerchio c1 = new Cerchio(10);
        c1.calcolaPerimetro();
        System.out.println(c1.numCerchi);       // può essere fraintesa per una variabile non-static
        System.out.println(Cerchio.numCerchi);      // più corretto

        Cerchio c2 = new Cerchio(20);
        c2.calcolaPerimetro();
        System.out.println(c2.numCerchi);


    }
}
