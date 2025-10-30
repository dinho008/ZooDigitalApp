package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Nadador;
import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Predador;

public class Tubarao extends Peixe implements Nadador, Predador {

    public Tubarao(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " (Silêncio... apenas a barbatana).");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo uma foca.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando ameaçadoramente.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está atacando de baixo para cima.");
    }
}