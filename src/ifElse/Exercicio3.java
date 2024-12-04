package ifElse;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean doacao;

		// Puxando o scannerI
		Scanner leia = new Scanner(System.in);

		// Entrada de dados - Inserção de nome, idade e doação
		System.out.println("Digite seu nome");
		nome = leia.nextLine();

		System.out.println("Digite a sua idade");
		idade = leia.nextInt();

		System.out.println("Você já doou sangue (true/false)");
		doacao = leia.nextBoolean();

		// Processamento
		// If checando idade maior de 18 e menor que 59
		if (idade >= 18 && idade <= 59) {
			System.out.printf("%s, você está apto para doar sangue!", nome);
			// else if checando maiores de 60 e menores de 70 com condições de doação
		} else if (idade >= 60 && idade <= 69 && doacao == true) {
			System.out.printf("%s, você está apto para doar sangue!", nome);
		} // else se não satisfazer todos os requisitos impedindo a doação.
		else {
			System.out.printf("%s, você não está apto para doar sangue!", nome);
		}
		// fecha scanner
		leia.close();
	
		}



	}

