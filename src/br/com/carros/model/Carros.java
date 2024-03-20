package br.com.carros.model;

public abstract class Carros<T> {
    private String marca;
    private String modelo;

    public Carros(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro[ " + "marca= " + marca + " modelo=  " + modelo + ']';
    }
}
