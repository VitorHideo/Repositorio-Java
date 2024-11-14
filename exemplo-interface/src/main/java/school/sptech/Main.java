package school.sptech;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Jogavel mines = new Minecraft();
        Jogavel vemProFut = new Futebol();

        vemProFut.jogar();
        mines.jogar();

        // Cria uma lista com valores dentro imutavel - Não adiciona nem remove
        List<Jogavel> jogaveis = List.of(mines, vemProFut);


        // Cria uma lista com valores dentro - pode adicionar e remover
        List<Jogavel> jogaveis2 = new ArrayList<>();
        jogaveis2.add(mines);
        jogaveis2.add(vemProFut);

    }
}