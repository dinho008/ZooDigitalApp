package br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais;

public abstract class Peixe extends Animal {
    private String tipoAgua;

    public Peixe(String nome, int idade, String tipoAgua) {
        super(nome, "Peixe", idade);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
}