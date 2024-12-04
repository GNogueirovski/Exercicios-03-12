package switchCase;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		String nomefunc;
		int codigofunc;
		float salario, novosalario;

		// Puxando o scannerI
		Scanner leia = new Scanner(System.in);

		// Entrada de dados - Inserção do nome, código e salário atual do funcionário
		System.out.println("Digite o nome do funcionário:");
		nomefunc = leia.nextLine();

		System.out.println("Digite o código do cargo do funcionário:");
		codigofunc = leia.nextInt();

		System.out.println("Digite o salário atual do funcionário");
		salario = leia.nextFloat();
		
		// Processamento - switch-case para determinar a partir do codigo do funcionario, seu cargo e seu novo salário

		switch (codigofunc) {
		case 1:
			novosalario = salario + (0.1f * salario);
			System.out.printf("%s, você é Gerente. \nSeu novo salário é %.1f", nomefunc, novosalario);
			break;
		case 2:
			novosalario = salario + (0.07f * salario);
			System.out.printf("%s, você é Vendedxr. \nSeu novo salário é %.1f", nomefunc, novosalario);
			break;

		case 3:
			novosalario = salario + (0.09f * salario);
			System.out.printf("%s, você é Supervisxr. \nSeu novo salário é %.1f", nomefunc, novosalario);
			break;

		case 4:
			novosalario = salario + (0.06f * salario);
			System.out.printf("%s, você é Motorista. \nSeu novo salário é %.1f", nomefunc, novosalario);
			break;

		case 5:
			novosalario = salario + (0.05f * salario);
			System.out.printf("%s, você é Estoquista. \nSeu novo salário é %.1f", nomefunc, novosalario);
			break;

		case 6:
			novosalario = salario + (0.08f * salario);
			System.out.printf("%s, você é Técnicx de TI. \nSeu novo salário é %.1f", nomefunc, novosalario);
			break;

		default:
			System.out.println("Código do Funcionário não encontrado");
		}

		// fecha scanner
		leia.close();

	}

}
