package it.bit.gestionaleBanca.domain;

// import it.bit.gestionaleBanca.domain.interfacce.DBRepositoryCorso;
import it.bit.gestionaleBanca.domain.interfacce.RepositoryCorso;

import java.util.ArrayList;

public class ControllerCorsi {

    // private DBRepositoryCorso repository;
    private RepositoryCorso repository;

    // public ControllerCorsi(DBRepositoryCorso repository){
    public ControllerCorsi(RepositoryCorso repository){
        this.repository = repository;
    }

    public Iterable<Corso> listaCorsi(){
        Iterable<Corso> risultato = repository.listaCorsi();
        return risultato;
    }

    public void insertCourse(String titolo){
        repository.inserisciCorso(titolo);
    }
}
