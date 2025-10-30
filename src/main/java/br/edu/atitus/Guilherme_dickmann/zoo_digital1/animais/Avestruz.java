package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Corredor;

public class Avestruz extends Ave implements Corredor {

    public Avestruz(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sementes e insetos.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo muito rápido pelo deserto.");
    }
}
