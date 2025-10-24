package carro.modelo;

import carro.CarroSedan;

public class Fiesta implements CarroSedan {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Ford Fiesta - Carro Sedan");
    }
}
