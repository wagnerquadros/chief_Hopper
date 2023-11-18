package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe para leitura de arquivo txt com as alturas dos predios para realização
 * dos Testes.
 */
public class EntriesReader {

    /**
     * Recebe o caminho do arquivo .txt contendo as alturas dos edifícios e
     * retorna um ArrayList de edificios e suas respectivas alturas.
     * @param path
     * @return arr
     */
    public List<Integer> getEntries(String path){
        List<Integer> arr = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new java.io.FileReader(path))){

            String line;
            while((line = br.readLine()) != null) {
                String[] entries = line.split(" ");
                for(String entrie : entries){
                    int height = Integer.parseInt(entrie);
                    arr.add(height);
                }
            }

        } catch( IOException e){
            e.printStackTrace();
        }

        return arr;
    }
}
