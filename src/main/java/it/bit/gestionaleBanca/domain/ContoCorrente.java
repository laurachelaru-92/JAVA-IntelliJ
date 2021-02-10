// Il package rappresenta la struttura del codice
// un gruppo logico di classi le riunisce per "significato"
// un gruppo fisico le riunisce per directory
// In Java, il namespace e il package sono directory (indicano dove si trova una classe)

package it.bit.gestionaleBanca.domain;

// La classe è la descrizione di un nuovo tipo di dato
// Ci può essere solo una classe pubblica per file .java (per trovare facilmente la classe)
public abstract class ContoCorrente {

    // HEAP è dove vengono allocati gli oggetti. Non c'è una logica, l'oggetto viene messo dove c'è spazio, perché non si sa qual è l'oggetto più "importante" o che userai prima
    // Quando il garbage collector elimina oggetti, lo fa come fossero un mucchio di vestiti e ne prendessi alcuni dal mucchio
    // Non si sa quando un oggetto non servirà più
    // Viene eliminato un oggetto dall'Heap quando nel programma non c'è più una reference che richiama quell'oggetto
    public ContoCorrente(double saldo) {
        this.saldo = saldo;
    }
    public ContoCorrente(){

    }
    public abstract double preleva(double amount);

    public double deposita(double amount){
        this.saldo += amount;
        return saldo;
    }
    // È preferibile creare un metodo setSaldo o getSaldo perché:
    // - è possibile dover fare controlli o log o conversioni ecc
    // - in futuro la variabile saldo potrebbe dover essere privata
    // - quello che è pubblico non si può più cambiare senza invalidare tuuuutto il codice
    protected double saldo = 100;

    public abstract ContoCorrente generaContoSecondario();

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double newSaldo) {
        if(newSaldo < 0) {
            System.out.println("Operazione non consentita");
        } else {
            this.saldo = newSaldo;
        }
    }

}


// I tre pillars: incapsulamento (beata ignoranza), ereditarietà e polimorfismo
// protected: visibile nello stesso package e nelle sottoclassi (anche fuori dal package)
// Se non si indica nè "public" nè niente, la visibilità è di package

// Il fully qualified name della classe (il vero nome) è package1.MiaClasse (nome del package + nome della classe)

// Il dominio rappresenta le classi cuore di un programma ad oggetti (es classe it.bit.gestionaleBanca.domain.ContoCorrente, Transazione, Prestito...), definito da noi
