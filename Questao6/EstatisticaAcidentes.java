package Questao6;

import java.util.Scanner;

public class EstatisticaAcidentes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigoCidadeMaiorIndice = 0, codigoCidadeMenorIndice = 0;
		double maiorIndice = 0, menorIndice = Double.MAX_VALUE;
		int somaVeiculos = 0, qtdCidadesMenos2000 = 0;
		double somaAcidentesMenos2000 = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Dados da cidade " + i);
			System.out.print("Código da cidade: ");
			int codigoCidade = sc.nextInt();

			System.out.print("Número de veículos de passeio em 1999: ");
			int numVeiculos = sc.nextInt();
			somaVeiculos += numVeiculos;

			System.out.print("Número de acidentes de trânsito com vítimas em 1999: ");
			int numAcidentes = sc.nextInt();

			double indice = (double) numAcidentes / numVeiculos;

			if (indice > maiorIndice) {
				maiorIndice = indice;
				codigoCidadeMaiorIndice = codigoCidade;
			}

			if (indice < menorIndice) {
				menorIndice = indice;
				codigoCidadeMenorIndice = codigoCidade;
			}

			if (numVeiculos < 2000) {
				somaAcidentesMenos2000 += numAcidentes;
				qtdCidadesMenos2000++;
			}
		}

		double mediaVeiculos = (double) somaVeiculos / 5;
		System.out.println("Média de veículos nas cinco cidades: " + mediaVeiculos);

		if (qtdCidadesMenos2000 > 0) {
			double mediaAcidentesMenos2000 = somaAcidentesMenos2000 / qtdCidadesMenos2000;
			System.out.println("Média de acidentes de trânsito nas cidades com menos de 2000 veículos: " + mediaAcidentesMenos2000);
		} else {
			System.out.println("Não há cidades com menos de 2000 veículos de passeio");
		}

		System.out.println("Maior índice de acidentes de trânsito: " + maiorIndice + " (cidade " + codigoCidadeMaiorIndice + ")");
		System.out.println("Menor índice de acidentes de trânsito: " + menorIndice + " (cidade " + codigoCidadeMenorIndice + ")");

		sc.close();
	}
}