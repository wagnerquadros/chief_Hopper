package ChiefHopper;

import java.util.List;

public class BruteForceChiefHopper {

    /**
     * Médoto de força bruta para busca do valor mínimo de energia necessário para
     * concluir os pulos. O método recebe a lista de edifícios e simula o jogo partindo
     *  de energy = 0, incrementando 1 até que a energia seja suficiente para pular todos
     * os edifícios.
     * O método servirá como uma prova real para os testes.
     * @param arr
     * @return minEnrgy
     */
    public int bruteForceSerchForMinimumEnergy(List<Integer> arr){

        int energy;
        int minEnergy = 0;

        while(true) {
            energy = minEnergy;
            for (int i = 0; i <= arr.size() - 1 ; i++) {

                if (energy >= arr.get(i)) {
                    energy = energy + (energy - arr.get(i));
                } else {
                    energy = energy - (arr.get(i) - energy);
                }

                if (energy < 0) break;
            }

            if (energy >= 0) break;

            minEnergy += 1;
        }
        return minEnergy;
    }
}
