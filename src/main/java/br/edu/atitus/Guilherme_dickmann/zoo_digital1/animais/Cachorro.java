package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Corredor;
import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Nadador;
import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Predador;

public class Cachorro extends Mamifero implements Nadador, Corredor, Predador {

    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade, true);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está latindo");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sua ração");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás da bolinha");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando estilo cachorrinho");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando a meia que roubou.");
    }

    public String getRaca() {
        return raca;
    }
}
