package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

public abstract class Reptil extends Animal {

    private boolean temEscamas;

    public Reptil(String nome, int idade, boolean temEscamas) {
        super(nome, "Réptil", idade);
        this.temEscamas = temEscamas;
    }

    public boolean isTemEscamas() {
        return temEscamas;
    }

    public void setTemEscamas(boolean temEscamas) {
        this.temEscamas = temEscamas;
    }

    public void tomarSol() {
        System.out.println(getNome() + " está tomando sol para regular a temperatura.");
    }
}
