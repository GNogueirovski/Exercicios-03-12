package ifElse;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int a, b, c, soma;

		// Puxando o scannerI
		Scanner leia = new Scanner(System.in);

		// Entrada de dados - Inserção dos três números
		System.out.println("Insira o número A:");
		a = leia.nextInt();

		System.out.println("Insira o número B: ");
		b = leia.nextInt();

		System.out.println("Insira o número C: ");
		c = leia.nextInt();

		// Processamento
		soma = a + b;

		// saída se for maior
		if (soma > c) {
			System.out.printf("%d + %d = %d > %d\n", a, b, soma, c);
			System.out.println("A soma de A + B é Maior que C");

			// saída se for menor
		} else if (soma < c) {
			System.out.printf("%d + %d = %d < %d\n", a, b, soma, c);
			System.out.println("A soma de A + B é Menor que C");

			// saída se for igual
		} else {
			System.out.printf("%d + %d = %d = %d\n", a, b, soma, c);
			System.out.println("A soma de A + B é igual C");
		}
		// fecha scanner
		leia.close();

	}

}
