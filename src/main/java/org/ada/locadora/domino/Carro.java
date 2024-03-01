package org.ada.locadora.domino;

import java.util.List;

public class Carro implements Alugavel{
    private String marca;
    private String modelo;
    private double placa;
    private double precoDiaria;

    public Carro(String marca, String modelo, double placa, double precoDiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.precoDiaria = precoDiaria;
    }

    @Override
    public double calcularPreco(int dias) {
        return precoDiaria;
    }
    public String toString(){
        return marca + " " +modelo + "placa" + placa;
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

    public double getPlaca() {
        return placa;
    }

    public void setPlaca(double placa) {
        this.placa = placa;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }
}
