package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tributo {

    private List<Tributavel> listaTrib;

    public Tributo() {
        this.listaTrib = new ArrayList<>();
    }

    public void adicionaTributavel (Tributavel tributavel) {
        listaTrib.add(tributavel);
    }

    public Double calculaTotalTributo () {

        Double totalTributo = 0.0;
        for (Tributavel tributavel : listaTrib) {
            totalTributo += tributavel.getValorTributo();
        }
        return totalTributo;
    }

    public void exibeItensCarrinho() {
        System.out.println(listaTrib);
    }




}
