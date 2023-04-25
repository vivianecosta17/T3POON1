package Questao19;

import java.util.Scanner;

public class EstatisticasPessoais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura, maiorAltura = 0, menorAltura = Double.MAX_VALUE;
		double somaAlturasMulheres = 0;
		int numHomens = 0;
		char sexo, sexoPessoaMaisAlta = ' ';
		        
		for (int i = 1; i <= 15; i++) {
			System.out.print("Informe a altura da pessoa " + i + ": ");
			altura = sc.nextDouble();

			System.out.print("Informe o sexo da pessoa " + i + " (M ou F): ");
			sexo = sc.next().charAt(0);
			
			if (altura > maiorAltura) {
				maiorAltura = altura;
				sexoPessoaMaisAlta = sexo;
			}
			if (altura < menorAltura) {
				menorAltura = altura;
			}

			if (sexo == 'F') {
				somaAlturasMulheres += altura;
			}

			if (sexo == 'M') {
				numHomens++;
			}
		}

		System.out.println("Maior altura: " + maiorAltura + " (" + sexoPessoaMaisAlta + ")");
		System.out.println("Menor altura: " + menorAltura);

		if (numHomens == 0) {
			System.out.println("Não há homens no grupo.");
		} else {
			System.out.println("Número de homens: " + numHomens);
		}

		if (somaAlturasMulheres == 0) {
			System.out.println("Não há mulheres no grupo.");
		} else {
			double mediaAlturasMulheres = somaAlturasMulheres / (15 - numHomens);
			System.out.println("Média de altura das mulheres: " + mediaAlturasMulheres);
		}

		sc.close();
	}
}