package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Nadador;
import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Predador;

public class Crocodilo extends Reptil implements Nadador, Predador {

    public Crocodilo(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo baixo (gutural).");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo um gnu.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está esperando submerso no rio.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está usando o 'giro da morte'.");
    }
}