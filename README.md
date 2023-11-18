## Começando

Bem-vindo ao mundo Java do VS Code. Aqui está uma diretriz para ajudá-lo a começar a escrever código Java no Visual Studio Code.

## Estrutura de pastas

O espaço de trabalho contém duas pastas por padrão, onde:

- `src`: a pasta origem com classe main e pacotes do ChiefHooper e Test
- `scr/ChiefHopper`: pacote com classes ChiefHopper e BruteForceChiefHopper
- `scr/Test`: pacote de testes

Enquanto isso, os arquivos de saída compilados serão gerados na pasta `bin` por padrão.

## Sobre o Exercício

O exercício "Chief Hopper" envolve a seguinte lógica:

 - Você recebe uma lista de alturas de edifícios em uma linha.
 - O personagem começa em um edifício inicial com uma energia inicial de 0.
 - O objetivo é determinar a energia mínima que o personagem precisa no início para que ele possa saltar de edifício em edifício seguindo algumas regras:
 1. Se a altura do edifício for menor do que a energia atual do personagem, ele ganhará energia igual à diferença entre a energia atual e a altura do edifício.
 2. Se a altura do edifício for maior do que a energia atual do personagem, ele perderá energia igual à diferença entre a energia atual e a altura do edifício.
 3. Sempre que ele salta de um edifício para o próximo, ele gasta 1 de energia.
O objetivo é encontrar a energia mínima inicial para que o personagem possa passar por todos os edifícios sem que sua energia fique negativa.

## Resolvendo o Exercício 

 - Para resolver o desafio "Chief Hopper", fazemos o seguinte:

 1. Começamos pelo último edifício e seguimos em direção ao primeiro.
 2. Para cada edifício, calculamos a energia mínima necessária.
 3. Essa energia mínima é baseada na altura do edifício atual e na energia mínima anterior.
 4. Usamos Math.ceil para arredondar o resultado para cima, porque a energia precisa ser um número inteiro.

## Trecho de código implementado

```
    public int result(List<Integer> arr){
        int minEnergy = 0;

        for (int i = arr.size() - 1; i >= 0; i--) {
            minEnergy = (int) Math.ceil((double) (minEnergy + arr.get(i)) / 2);
        }
        return minEnergy;
    }
```

 - `minEnergy` representa a energia mínima necessária para o personagem.
 - Começamos com minEnergy igual a 0, pois o personagem está no primeiro edifício.
 - Iteramos pelos edifícios da direita para a esquerda (do último para o primeiro).
 - Para cada edifício, calculamos a energia mínima necessária com base na altura do edifício atual e na energia mínima que o personagem já tinha.
 - Usamos `Math.ceil` para garantir que o resultado seja um número inteiro e arredondado para cima, já que a energia precisa ser um número inteiro.

 ### Como o calculo funciona 

  ```
  minEnergy = (int) Math.ceil((double) (minEnergy + arr.get(i)) / 2);
  ```
 - `arr.get(i)` é a altura do edifício atual.
 - `minEnergy` + `arr.get(i)` representa a energia mínima necessária para passar do edifício anterior para o edifício atual. Estamos considerando a altura do edifício atual e a energia anterior.
 - Dividimos esse valor por 2 e usamos `Math.ceil` para arredondar para cima, garantindo que a energia seja um número inteiro.
 - Repetimos esse cálculo para cada edifício, atualizando `minEnergy` a cada iteração.
 - No final, a função retorna `minEnergy`, que é a energia mínima necessária para o personagem passar por todos os edifícios com sucesso.

## Método de Força Bruta

Médoto de força bruta para busca do valor mínimo de energia necessário para concluir os pulos. O método recebe a lista de edifícios e simula o jogo partindo de energy = 0, incrementando 1 até que a energia seja suficiente para pular todos os edifícios. O método servirá como uma prova real para os testes.

## BruteForceSerchForMinimumEnergy Method


```
    public int BruteForceSerchForMinimumEnergy(List<Integer> arr){

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
```

