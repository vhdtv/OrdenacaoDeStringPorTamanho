import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroDeCasosDeTeste = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < numeroDeCasosDeTeste; i++) {
			String palavras = sc.nextLine();
			String[] arrayDePalavras = palavras.split(" ");
			List<String> listaDePalavras = new ArrayList<>();

			for (int j = 0; j < arrayDePalavras.length; j++)
				listaDePalavras.add(arrayDePalavras[j]);

			while (!listaDePalavras.isEmpty()) {
				String maior = "";
				for (String x : listaDePalavras)
					if (x.length() > maior.length())
						maior = x;

				System.out.printf("%s", maior);
				if (listaDePalavras.contains(maior))
					listaDePalavras.remove(maior);

				if (!listaDePalavras.isEmpty())
					System.out.printf(" ");
			}
			System.out.println("");
		}
		sc.close();
	}
}