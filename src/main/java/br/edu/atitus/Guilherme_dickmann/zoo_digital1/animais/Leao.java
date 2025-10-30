package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Corredor;
import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Predador;

public class Leao extends Mamifero implements Corredor, Predador {

    public Leao(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo uma zebra.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo na savana.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando em bando.");
    }
}