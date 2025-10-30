package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Corredor;
import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Nadador;
import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Predador;
import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Voador;

public class Pato extends Ave implements Voador, Nadador, Corredor, Predador {

    public Pato(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grasnando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo plantinhas do lago");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo todo desajeitado");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando elegantemente na lagoa");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " saiu voando");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando insetos na beira do lago.");
    }
}
