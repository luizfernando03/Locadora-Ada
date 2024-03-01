package org.ada.locadora.domino;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Carro> carrosDisponiveis;

    public Locadora(){
        carrosDisponiveis = new ArrayList<>();
    }
    public void adicionarCarro(Carro carro){
        carrosDisponiveis.add(carro);
    }
    public void mostrarCarroDisponiveis(){
        System.out.println("Carros Disponiveis");
        for (Carro carro : carrosDisponiveis){
            System.out.println(carro);
        }
    }
    public double alugarCarro (Carro carro, int dias) {
        if (carrosDisponiveis.contains(carro)) {
            double precoTotal = carro.calcularPreco(dias);
            carrosDisponiveis.remove(carro);
            return precoTotal;
        } else {
            System.out.println("carro não Disponivel para aluguel.");
            return 0;
        }

    }
}
