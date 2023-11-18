import ChiefHopper.ChiefHopper;
import ChiefHopper.BruteForceChiefHopper;

import java.util.ArrayList;
import java.util.List;

/**
 * Este código é um programa Java que calcula a energia mínima para um
 * personagem "chief" saltar entre edifícios em uma determinada configuração.
 * O programa considera as alturas dos edifícios e o gasto de energia ao saltar.
 */

public class Main {
    public static void main(String[] args) {

        ChiefHopper chiefHopper = new ChiefHopper();
        List<Integer> arr = chiefHopper.generateBuildings();
        System.out.println("Minimum energy: " + chiefHopper.result(arr));

        BruteForceChiefHopper bf = new BruteForceChiefHopper();

        List<Integer> teste = new ArrayList<>();
        teste.add(3);
        teste.add(4);
        teste.add(3);
        teste.add(2);
        teste.add(4);
        System.out.println("teste = " + bf.BruteForceSerchForMinimumEnergy(arr));
    }
}
