package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Predador;
import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.Voador;

public class Aguia extends Ave implements Voador, Predador {

    public Aguia(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está gritando (guincho).");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo um coelho.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está planando alto nas montanhas.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está mergulhando para pegar uma presa.");
    }
}