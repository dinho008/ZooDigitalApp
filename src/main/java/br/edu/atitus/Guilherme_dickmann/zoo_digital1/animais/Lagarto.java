package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Corredor;
import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Predador;

public class Lagarto extends Reptil implements Corredor, Predador {

    public Lagarto(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo insetos grandes.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo rapidamente pelas pedras.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está usando a língua para pegar a presa.");
    }
}
