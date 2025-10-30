package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Nadador;
import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Predador;

public class Cobra extends Reptil implements Nadador, Predador {

    public Cobra(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está engolindo um rato.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando (como uma Sucuri).");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está dando o bote.");
    }
}