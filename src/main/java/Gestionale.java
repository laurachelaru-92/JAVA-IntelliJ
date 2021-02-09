// Questa "memoria" viene allocata nella RAM

import it.bit.gestionaleBanca.domain.ContoCorrente;

public class Gestionale {
    // "static" è un metodo che verrà chiamato sulla Classe e non sull'oggetto
    // normalmente, i metodi servono agli oggetti e non alle classi
    // "void" significa che non ritorna nulla
////    public static void main(String[] args) {
//         x non è l'oggetto, ma è un puntatore/una reference all'oggetto ConcoCorrente
//        // it.bit.gestionaleBanca.domain.ContoCorrente() è il costruttore, questo è il default constructor. Se non lo creiamo noi specificamente, è creato automaticamente
//        ContoCorrente c = new ContoCorrente();
//
//        // Dove finisce x? In che aria di memoria? Nello stack.
//        // Lo stack è lo spazio in cui vengono allocate le funzioni e le variabili.
//        // Lo stack è una pila di info LIFO. Lo stack trace è ciò che appare quando si verifica un errore
//        // Anche le chiamate a funzione seguono questa logica. La prima funzione a essere eseguita è l'ultima a essere stata chiamata
//        int y = 3;
//
//        // Sullo stack viene allocata la chiamata della funzione f1
//        // Quando la funzione finisce di runnare, quella parte di "stack", di memoria, viene liberata
//        f1();
//
//        // "null" è un indirizzo/puntatore invalido
//        // il garbage collector lo eliminerà perché questo c ha perso il suo indirizzo
//        c = null;
//
//        // Questo oggetto avrà uno "spazio" diverso nello stack rispetto al c scritto sopra
//        c = new ContoCorrente();
//
//        System.out.println(c.saldo); // Questo stampa "100"
//
//        // Creiamo cellette "c" e "c2" che hanno lo stesso indirizzo e rimandano allo stesso oggetto
//        Contocorrente c2 = c;
//        c2.saldo = 200;
//        System.out.println(c.saldo); // Questo stampa "200"
//
//        int a = 1;
//        int b = 2;
//
//        // il passaggio nella funzione avviene per copia
//        // nella funzione vengono passati i "valori", non le variabii originali
//        // non si possono scambiare i due valori delle funzioni in una funzione
//        scambia(a,b);
//
//        // I valori resteranno a=1 e b=2
//        System.out.println(a);
//        System.out.println(b);
//
//        ContoCorrente c5 = new ContoCorrente();
//        ContoCorrente c6 = new ContoCorrente();
//        c5.saldo = 10;
//        c6.saldo = 10;
//
//        // Anche in questo caso, la funzione ha ricevuto come parametri due copie dei valori, non gli oggetti veri e propri
//        scambiaCc(c5,c6);
//
//        // entreremmo nell'if?
//        // No, perché mettiamo a confronto due indirizzi diversi, non due valori
//        if(c1==c2){}
//        // In ogni caso, si scrive if(c1.equals(c2)){}
//
//
//        // La virtual machine fa sì che, se ci sono stringhe nel nostro programma con lo stesso valore, le alloca nello stesso indirizzo
//        String p1 = "pippo ";
//        String p2 = "pippo ";
//
//        // Fare così, impedisce alla virtual machine di fare questo gioco intelligente
//        // String p2 = new String( "pippo");
//
//        // Quindi sì, sono uguali
//        if(p1==p2){
//            System.out.println("sono uguali");
//        }
//
//        // Il metodo trim() leva gli spazi all'inizio e alla fine della stringa
//
//        p1.trim();
//        System.out.println(p2.length());
//        // Ovviamente è 6
//
//        // Se però scrivo
//        String ris = p1.trim();
//
//    }

    public static void f1() {
        int y = 12;
        f2();
    }

    public static void f2() {
        int x = 24;
    }

    // la funzione non deve fare casino e scambiare le variabili
    public static void scambia(int a, int b) {
    }

    public static void scambiaCc(ContoCorrente c5, ContoCorrente c6) {
        /* it.bit.gestionaleBanca.domain.ContoCorrente temp = c1;
        c1 = c2;
        c2 = temp; */

        // Scambiare valori degli oggetti invece funziona
        // La funzion non può cambiare indirizzi/puntatori ma può cambiare i valori
        // double temp = c5.saldo;
        //c5.saldo = c6.saldo;
        // c6.saldo = temp;
    }


}
