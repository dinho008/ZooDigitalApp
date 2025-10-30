package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Predador;
import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Voador;

public class Morcego extends Mamifero implements Voador, Predador {

    public Morcego(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está usando ecolocalização (cliques).");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo insetos.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando à noite.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando mariposas.");
    }
}