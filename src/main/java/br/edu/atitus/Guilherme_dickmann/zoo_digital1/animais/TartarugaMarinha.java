package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Nadador;

public class TartarugaMarinha extends Reptil implements Nadador {

    public TartarugaMarinha(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " (Respiração profunda).");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo água-viva.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está migrando pelo oceano.");
    }
}
