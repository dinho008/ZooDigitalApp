package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Nadador;
import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Voador;

public class PeixeVoador extends Peixe implements Nadador, Voador {

    public PeixeVoador(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo plâncton.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando rapidamente perto da superfície.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está planando fora d'água para fugir.");
    }
}