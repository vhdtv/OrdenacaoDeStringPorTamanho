import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroDeCasosDeTeste = Integer.parseInt(sc.nextLine());

        List<String> saidas = new ArrayList<>();

        for (int i = 0; i < numeroDeCasosDeTeste; i++) {
            String palavras = sc.nextLine();
            String[] arrayDePalavras = palavras.split(" ");
            List<String> listaDePalavras = new ArrayList<>();

            for (int j = 0; j < arrayDePalavras.length; j++)
                listaDePalavras.add(arrayDePalavras[j]);

            Collections.sort(listaDePalavras, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s2.length() - s1.length();
                }
            });

            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < listaDePalavras.size(); k++) {
                sb.append(listaDePalavras.get(k));
                if (k < listaDePalavras.size() - 1)
                    sb.append(" ");
            }
            saidas.add(sb.toString());
        }

        sc.close();

        for (String saida : saidas) {
            System.out.println(saida);
        }
    }
}
