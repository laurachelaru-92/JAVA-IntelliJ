package it.bit.gestionaleBanca.domain.interfacce;

import it.bit.gestionaleBanca.domain.Corso;

import java.util.Enumeration;
import java.util.List;

public interface RepositoryCorso {

    void inserisciCorso(String titolo);
    Iterable<Corso> listaCorsi();
}
