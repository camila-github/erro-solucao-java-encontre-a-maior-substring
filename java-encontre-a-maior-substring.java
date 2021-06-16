import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MaiorSubstring {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String primeiraLinha, segundaLinha, min, max;
        while ((primeiraLinha = in.readLine()) != null) {
            segundaLinha = in.readLine();
            if ( primeiraLinha.length() > segundaLinha.length() ) {  
                max = primeiraLinha;
                min = segundaLinha;
            } else {
                max = segundaLinha;
                min = primeiraLinha;
            }
            int tamanhoMinimoString = min.length();
            int maxS = tamanhoMinimoString;
            boolean f = true;
            while (maxS > 0 && f) {
                int diff = tamanhoMinimoString - maxS;
                for (int i = 0; i <= diff; i++) {
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }

}