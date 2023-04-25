package Questao9;

import java.util.Scanner;

public class SalariosTemporarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double maiorPontuacao = 0;

		for (int i = 1; i <= 15; i++) {
			System.out.println("Dados do funcionário " + i);

			double pontuacaoGeral = 0;

			for (int j = 1; j <= 3; j++) {
				System.out.print("Pontuação do mês " + j + ": ");
				double pontuacao = sc.nextDouble();
				pontuacaoGeral += pontuacao;
			}

			double mediaPontuacao = pontuacaoGeral / 3;

			System.out.println("Pontuação geral: " + pontuacaoGeral);
			System.out.println("Média das pontuações: " + mediaPontuacao);

			if (pontuacaoGeral > maiorPontuacao) {
				maiorPontuacao = pontuacaoGeral;
			}
		}

		System.out.println("Maior pontuação atingida: " + maiorPontuacao);

		sc.close();
	}
}