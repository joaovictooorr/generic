package br.com.carros.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String args[]){
        List<Carros<?>> carros = new ArrayList<>();

        carros.add(new Honda("Honda", "Civic"));
        carros.add(new Fiat("Fiat", "Palio"));
        carros.add(new Vw("Vw", "Gol"));
        carros.add(new Honda("Honda", "HR-V"));

        Map<String, List<Carros<?>>> carrosPorMarca = new HashMap<>();

        for (Carros<?> carro : carros) {
            String marca = carro.getMarca();
            List<Carros<?>> carrosDaMarca = carrosPorMarca.getOrDefault(marca, new ArrayList<>());
            carrosDaMarca.add(carro);
            carrosPorMarca.put(marca, carrosDaMarca);
        }

        for (Map.Entry<String, List<Carros<?>>> entry : carrosPorMarca.entrySet()) {
            String marca = entry.getKey();
            List<Carros<?>> carrosDaMarca = entry.getValue();

            System.out.println("Marca: " + marca);
            for (Carros<?> carro : carrosDaMarca) {
                System.out.println(carro);
            }
            System.out.println();
        }
    }


}
