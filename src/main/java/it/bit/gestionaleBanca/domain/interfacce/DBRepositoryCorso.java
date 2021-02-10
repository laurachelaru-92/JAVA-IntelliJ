package it.bit.gestionaleBanca.domain.interfacce;

import it.bit.gestionaleBanca.domain.Corso;

import java.util.ArrayList;
import java.util.List;

public class DBRepositoryCorso implements RepositoryCorso{
    @Override
    public void inserisciCorso(String titolo) {

    }

    @Override
    public Iterable<Corso> listaCorsi() {
        return new ArrayList<Corso>();
    }
}
