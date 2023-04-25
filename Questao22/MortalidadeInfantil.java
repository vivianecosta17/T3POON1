package Questao22;

import java.util.Scanner;

public class MortalidadeInfantil {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número de crianças nascidas no período:");
		int totalCrianças = entrada.nextInt();
		int mortesFemininas = 0, mortesMasculinas = 0, criancas24MesesOuMenos = 0;

		for (int i = 0; i < totalCrianças; i++) {
			System.out.println("Digite o sexo da " + (i+1) + "ª criança (M ou F):");
			char sexo = entrada.next().charAt(0);

			System.out.println("Digite o tempo de vida da " + (i+1) + "ª criança em meses:");
			int tempoVida = entrada.nextInt();

			if (sexo == 'F' && tempoVida == 0) {
				mortesFemininas++;
			} else if (sexo == 'M' && tempoVida == 0) {
				mortesMasculinas++;
			}

			if (tempoVida <= 24) {
				criancas24MesesOuMenos++;
			}
		}

		double porcentagemMortesFemininas = (double) mortesFemininas / totalCrianças * 100;
		double porcentagemMortesMasculinas = (double) mortesMasculinas / totalCrianças * 100;
		double porcentagemCriancas24MesesOuMenos = (double) criancas24MesesOuMenos / totalCrianças * 100;

		System.out.printf("Porcentagem de crianças do sexo feminino mortas: %.2f%%\n", porcentagemMortesFemininas);
		System.out.printf("Porcentagem de crianças do sexo masculino mortas: %.2f%%\n", porcentagemMortesMasculinas);
		System.out.printf("Porcentagem de crianças que viveram 24 meses ou menos: %.2f%%\n", porcentagemCriancas24MesesOuMenos);

		entrada.close();
	}
}