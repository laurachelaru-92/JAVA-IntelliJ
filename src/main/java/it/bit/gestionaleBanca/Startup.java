package it.bit.gestionaleBanca;

// Si può evitare di fare l'import, ma allora bisogna usare il namespace completo della classe
// Non si può importare la classe e basta, ma si deve importare il package
// Non si possono importare classi dalla source directory (cartella java)
import it.bit.gestionaleBanca.domain.ContoCorrente;
import it.bit.gestionaleBanca.domain.ContoCorrenteCaiman;

public class Startup {

    public static void main(String[] args) {

        ContoCorrente c = new ContoCorrente();
        c.setSaldo(1000);
        c.deposita(1000);
        System.out.println(c.getSaldo());
        
        ContoCorrenteCaiman cn = new ContoCorrenteCaiman("", 1.2);
        cn.deposita(1000);

        ContoCorrente x = new ContoCorrenteCaiman("", 1.2);
        x.deposita(1000);
    }
}

//ereditarieta  - is a

//composizione - has a
