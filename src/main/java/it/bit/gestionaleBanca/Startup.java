package it.bit.gestionaleBanca;

// Si può evitare di fare l'import, ma allora bisogna usare il namespace completo della classe
// Non si può importare la classe e basta, ma si deve importare il package
// Non si possono importare classi dalla source directory (cartella java)

import it.bit.gestionaleBanca.domain.ContoCorrente;
import it.bit.gestionaleBanca.domain.ContoCorrenteCaiman;
import it.bit.gestionaleBanca.domain.ContoGold;
import it.bit.gestionaleBanca.domain.interfacce.Animale;
import it.bit.gestionaleBanca.domain.interfacce.Gatto;

public class Startup {

    public static void main(String[] args) {
        Animale cat = new Gatto();
        ContoCorrente c = new ContoGold();
        c.setSaldo(1000);
        c.deposita(1000);
        System.out.println(c.getSaldo());
        
        ContoCorrenteCaiman cn = new ContoCorrenteCaiman("", 1.2);
        cn.deposita(1000);
        ContoCorrenteCaiman nuovoConto = cn.generaContoSecondario();
        ContoCorrente x = new ContoCorrenteCaiman("", 1.2);

        ContoCorrente z = null;
        if (Math.random() > 0.5){
            z = new ContoGold();
        } else {
            z = new ContoCorrenteCaiman("", 1234);
        }

        z.deposita(200);

        x.deposita(1000);

        ContoCorrente cc = new ContoCorrenteCaiman("", 1002);

        gestisciContoCorrente(new ContoGold());
        gestisciContoCorrente(new ContoCorrenteCaiman("", 1003));
        gestisciContoCorrente(new ContoGold());


    }

    public static void gestisciContoCorrente(ContoCorrente c){
        c.preleva(10);
    }

    public static void curaAnimale(Animale a){
        a.respira();
        a.muoviti();
    }
}

//ereditarieta  - is a

//composizione - has a
