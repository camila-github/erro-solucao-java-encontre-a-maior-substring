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
<<<<<<< HEAD
=======

>>>>>>> 6308c338af738bfc233a48bb90df7b8b01771652
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MaiorSubstring {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String primeiraLinha, segundaLinha, auxMin, auxMax;
        while ((primeiraLinha = in.readLine()) != null) {
            segundaLinha = in.readLine();
            if ( primeiraLinha.length() > segundaLinha.length() ) {  
                auxMax = primeiraLinha;
                auxMin = segundaLinha;
            } else {
                auxMax = segundaLinha;
                auxMin = primeiraLinha;
            }
            int tamanhoMinimoString = auxMin.length();
            int tamanhoMaximoString = tamanhoMinimoString;
            boolean f = true;
            while (tamanhoMaximoString > 0 && f) {
                int strDiferenca = tamanhoMinimoString - tamanhoMaximoString;
                for (int i = 0; i <= strDiferenca; i++) {
                    if (auxMax.contains(auxMin.substring(i, i + tamanhoMaximoString))) {
                        f = false;
                        tamanhoMaximoString++;
                        break;
                    }
                }
                tamanhoMaximoString--;
            }
            System.out.println(tamanhoMaximoString);
        }
        out.close();
    }

}
```

