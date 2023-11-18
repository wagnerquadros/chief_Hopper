package ChiefHopper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChiefHopper {

    /**
     * Gera um array com os edifícios e as devidas alturas conforme as restrições
     * do problema:
     * Número [n] de edifícios
     * 1 <= n <= 100000
     * Alturas 'height' dos edifícios
     * 1 <= height <= 100000
     *
     * @return arr
     */
    public List<Integer> generateBuildings(){
        Random rand =  new Random();
        List<Integer> arr = new ArrayList<>();

        int buildingsNumber = rand.nextInt(100000)+1;

        for(int i=1; i<=  buildingsNumber; i++){
            int height = rand.nextInt(100000)+1;
            arr.add(height);
        }
        return arr;
    }

    /**
     * Calcula a energia mínima necessária para um personagem "chief" saltar entre
     * edifícios.
     * Considerando o valor mínimo necessário deve ser suficiente para que o
     * "Chief" consiga pular todos os edificios rentando um mínimo de energia
     *  > = 0. Sendo assim, o método considera que, ao final dos pulos a energia
     *  será igual a zero e calcula o valor minimo iniciando pelo último edificio
     *  até o primeiro.
     *
     * @param arr Uma lista de inteiros representando as alturas dos edifícios.
     * @return A energia mínima necessária para completar o salto.
     */
    public int result(List<Integer> arr){
        int minEnergy = 0;

        for (int i = arr.size() - 1; i >= 0; i--) {
            minEnergy = (int) Math.ceil((double) (minEnergy + arr.get(i)) / 2);
        }
        return minEnergy;
    }
}


