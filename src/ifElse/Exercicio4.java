package ifElse;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		String esqueleto;
		String tipo;
		String alimentacao;

		// Puxando o scannerI
		Scanner leia = new Scanner(System.in);

		// Entrada de dados - Inserção das características dos animais
		System.out.println("O animal é Vertebrado ou Invertebrado?");
		esqueleto = leia.nextLine();

		System.out.println("Digite o tipo de animal");
		tipo = leia.nextLine();

		System.out.println("Qual a dieta desse animal?");
		alimentacao = leia.nextLine();

		// Processamento
		
		// if e else checando se o animal é uma aguia ou pomba
		if (esqueleto.equalsIgnoreCase("vertebrado") && tipo.equalsIgnoreCase("ave")) {
			if (alimentacao.equalsIgnoreCase("carnivoro")) {
				System.out.println("Seu animal é uma Águia!");
			} else {
				System.out.println("Seu animal é uma Pomba!");
			}
		}
		// if e else checando se o animal é um homem ou uma vaca	
		if (esqueleto.equalsIgnoreCase("vertebrado") && tipo.equalsIgnoreCase("mamifero")) {
			if (alimentacao.equalsIgnoreCase("onivoro")) {
				System.out.println("Seu animal é um Homem!");
			} else {
				System.out.println("Seu animal é uma Vaca!");
			}
		}
		// if e else checando se o animal é uma pulga ou lagarta	
		if (esqueleto.equalsIgnoreCase("invertebrado") && tipo.equalsIgnoreCase("inseto")) {
			if (alimentacao.equalsIgnoreCase("hermatofago")) {
				System.out.println("Seu animal é uma Pulga!");
			} else {
				System.out.println("Seu animal é uma Lagarta!");
			}
		}
		// if e else checando se o animal é uma sanguessuga ou minhoca		
		if (esqueleto.equalsIgnoreCase("invertebrado") && tipo.equalsIgnoreCase("anelideo")) {
			if (alimentacao.equalsIgnoreCase("hematofago")) {
				System.out.println("Seu animal é uma Sanguessuga!");
			} else {
				System.out.println("Seu animal é uma Minhoca!");
			}
		}
		// fecha scanner
		leia.close();

	}

}
