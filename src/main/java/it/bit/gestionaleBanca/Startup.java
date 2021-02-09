package it.bit.gestionaleBanca;

// Si può evitare di fare l'import, ma allora bisogna usare il namespace completo della classe
// Non si può importare la classe e basta, ma si deve importare il package
// Non si possono importare classi dalla source directory (cartella java)
import it.bit.gestionaleBanca.domain.ContoCorrente;
import package1.MiaClasse;

public class Startup {

    public static void main(String[] args) {

        ContoCorrente c = new ContoCorrente();
        c.setSaldo(1000);
        System.out.println(c.getSaldo());
        
        ContoCorrenteCaiman cn = new ContoCorrenteCaiman();
    }
}
