import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MaiorSubstring {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

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
    }

}