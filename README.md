## Exercicio (Java):  Encontre a maior substring

O exercicio publicado é referente ao treinamento do Bootcamp Java - Praticando Programação em Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Encontre a maior substring comum entre as duas strings informadas. A substring pode ser qualquer parte da string, inclusive ela toda. Se não houver subseqüência comum, a saída deve ser “0”. A comparação é case sensitive ('x' != 'X').

#### Entrada: 

A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas, cada uma contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').

#### Saída: 

O tamanho da maior subsequência comum entre as duas Strings.

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
abcdef | 2
cdofhij | 1
TWO | 0
FOUR | 7
abracadabra | 
open | 
Hey This java is hot | 
Java is a new paradigm | 


#### Java　

```java
//SOLUCAO 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ConjuntoBomRuim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int entradaDados = Integer.valueOf(br.readLine());

        while (entradaDados != 0) {
            List<String> conjunto = new ArrayList<>();
            for (int i = 0; i < entradaDados; i++)
                conjunto.add(br.readLine());

            conjunto = conjunto.stream().sorted().collect(Collectors.toList());

            String saida = "Conjunto Bom";
            for (int i = 0; i < entradaDados - 1; i++) {
                if (conjunto.get(i + 1).startsWith(conjunto.get(i))) {
                    saida = "Conjunto Ruim";
                    break;
                }
            }

            System.out.println(saida);
            entradaDados = Integer.valueOf(br.readLine());
        }
    }
}
```

