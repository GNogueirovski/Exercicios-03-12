package switchCase;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		int codigoop;
		float valor, saldo = 1000;

		// Puxando o scannerI
		Scanner leia = new Scanner(System.in);

		// Entrada de dados - Tipo de operação
		System.out.println("Qual tipo de operação você gostaria de fazer?");
		System.out.println("1 - Checar Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		codigoop = leia.nextInt();


		//Processamento - Switch-case para as três operações, com if na segunda operação para checar se valor é maior que saldo
		switch (codigoop) {
		// Operação 1: Checagem de saldo
		case 1:
			System.out.printf(" Seu saldo total é de %.2f", saldo);
			break;

		case 2:
			// Input de valor, necessário,para operação de saque do usuário
			System.out.println("Digite o valor para a operação:");
			valor = leia.nextFloat();

			// checagem se o valor que o usuário inseriu foi maior do que o disponivel
			if (valor > saldo) {
				System.out.println("Você não possui saldo para esta operação.");
				break;
			}

			// Se valor está dentro do disponível, realiza o saque;
			saldo = saldo -= valor;
			System.out.printf("Você realizou um saque de %.2f. Seu novo saldo é de %.2f", valor, saldo);
			break;
			
		case 3:
			System.out.println("Digite o valor para a operação:");
			valor = leia.nextFloat();

			// Realização do depósito
			saldo = saldo + valor;
			System.out.printf("Você realizou um depósito de %.2f. Seu novo saldo é de %.2f", valor, saldo);
			break;

		default:
			System.out.println("Operação Invalida");
		}

		// fecha scanner
		leia.close();

	}

}
