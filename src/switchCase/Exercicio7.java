package switchCase;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		float num1, num2, resultado;
		int operacao;

		// Puxando o scannerI
		Scanner leia = new Scanner(System.in);

		// Entrada de dados - Inserção dos números a serem calculados e operação desejada
		System.out.println("Digite o primeiro número:");
		num1 = leia.nextFloat();

		System.out.println("Digite o segundo número");
		num2 = leia.nextFloat();

		System.out.println("Digite o código da operação desejada");
		operacao = leia.nextInt();

		// Processamento - Switch-case que determina a operação que será feita e trás o calculo com resultado.
		switch (operacao) {
		case 1:
			resultado = num1 + num2;
			System.out.printf("Operação de Soma:\n %.1f + %.1f = %.1f", num1, num2, resultado);
			break;

		case 2:
			resultado = num1 - num2;
			System.out.printf("Operação de Subtração:\n %.1f - %.1f = %.1f", num1, num2, resultado);
			break;

		case 3:
			resultado = num1 * num2;
			System.out.printf("Operação de Multiplicação:\n %.1f x %.1f = %.1f", num1, num2, resultado);
			break;

		case 4:
			resultado = num1 / num2;
			System.out.printf("Operação de Divisão:\n %.1f / %.1f = %.1f", num1, num2, resultado);
			break;

		default:
			System.out.println("Operação Inválida");
		}

		// fecha scanner
		leia.close();

	}

}
