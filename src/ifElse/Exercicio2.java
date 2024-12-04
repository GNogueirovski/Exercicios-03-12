package ifElse;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int numero,resto;

		// Puxando o scannerI
		Scanner leia = new Scanner(System.in);

		// Entrada de dados - Inserção do número a ser analisado
		System.out.println("Insira um número para checagem:");
		numero = leia.nextInt();

		
		// Processamento
	
		// Faz a conta para saber o resto do número podendo ser 1 ou 0
		resto = numero % 2;
		
		//saída se for par e positivo
		if (resto == 0 && numero > 0 ) {
			System.out.printf("O número %d é par e positivo", numero);
		//saída se for par e negativo
		}
		else if (resto == 0 && numero < 0 ) {
			System.out.printf("O número %d é par e negativo", numero);
		//saída se for impar e positivo	
		}else if (resto == 1 && numero > 0) {
			System.out.printf("O número %d é ímpar e positivo", numero);
			
		//saída se for impar e negativo
		}else {
			System.out.printf("O número %d é ímpar e negativo", numero);
				
		}
		
			//fecha scanner
			leia.close();


	}

}
