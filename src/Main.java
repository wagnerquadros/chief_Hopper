import ChiefHopper.ChiefHopper;

import java.util.List;

/**
 * Este código é um programa Java que calcula a energia mínima para um
 * personagem "Chief" saltar entre edifícios em uma determinada configuração.
 * O programa considera as alturas dos edifícios e o gasto de energia ao saltar.
 */

public class Main {
    public static void main(String[] args) {

        ChiefHopper chiefHopper = new ChiefHopper();
        List<Integer> arr = chiefHopper.generateBuildings();
        System.out.println("Minimum energy: " + chiefHopper.result(arr));
    }
}
