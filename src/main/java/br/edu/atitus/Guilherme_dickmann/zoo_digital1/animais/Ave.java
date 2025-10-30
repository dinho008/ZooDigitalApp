package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

public abstract class Ave extends Animal {

    public Ave(String nome, int idade, String corPenas) {
        super(nome, "Ave", idade);
        this.corPenas = corPenas;
    }

    private String corPenas;

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    public void botar() {
        System.out.println(this.getNome() + " está botando.");
    }
}
