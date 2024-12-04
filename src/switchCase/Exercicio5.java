package switchCase;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int refeicao, quantidade, valortotal;

		// Puxando o scannerI
		Scanner leia = new Scanner(System.in);

		// Entrada de dados - Apresentação cardápio e escolha do que e quantidade a ser pedido
		System.out.println("# ## ### #### #########   CARDÁPIO   ########## #### ### ## #\n");
		System.out.println("Digite o número da refeição/bebida desejada:\n");
		System.out.println("1 - Ravioli al Pesto - 8€");
		System.out.println("2 - Spaghetti alla bolognese - 10€");
		System.out.println("3 - Penne ai Quattro Formaggio - 12€");
		System.out.println("4 - Risotto Del Mar - 15€");
		System.out.println("5 - Bicchiere di Vino Rosso - 5€");
		System.out.println("6 - Bicchiere di Vino Bianco - 5€ ");
		refeicao = leia.nextInt();

		System.out.println("Digite a quantidade desejada do item selecionado");
		quantidade = leia.nextInt(); 
		
		// Processamento com switch-case calculando a partir do pedido o valor total e a quantidade. Depois fazendo exibição.
		switch (refeicao) {
		case 1:
			valortotal = 8 * quantidade;
			System.out.printf("Você escolheu %d pratos de Ravioli al Pesto \n O valor total foi de %d€", quantidade,valortotal);
			break;

		case 2:
			valortotal = 10 * quantidade;
			System.out.printf("Você escolheu %d pratos de Spaghetti alla bolognese \n O valor total foi de %d€", quantidade,valortotal);
			break;

		case 3:
			valortotal = 12 * quantidade;
			System.out.printf("Você escolheu %d pratos de Penne ai Quattro Formaggio \n O valor total foi de %d€", quantidade,valortotal);
			break;

		case 4:
			valortotal = 15 * quantidade;
			System.out.printf("Você escolheu %d pratos de Risotto Del Mar \n O valor total foi de %d€", quantidade,valortotal);
			break;

		case 5:
			valortotal = 5 * quantidade;
			System.out.printf("Você escolheu %d taças de Vino Rosso \n O valor total foi de %d€", quantidade,valortotal);
			break;

		case 6:
			valortotal = 5 * quantidade;
			System.out.printf("Você escolheu %d taças de Vino Bianco \n O valor total foi de %d€", quantidade,valortotal);
			break;

		default:
			System.out.println("Pedido cadastrado errado");
		}

		// fecha scanner
		leia.close();

	}

}
