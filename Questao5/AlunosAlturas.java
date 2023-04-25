package Questao5;

import java.util.Scanner;

public class AlunosAlturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numAlunoMaisAlto = 0, numAlunoMaisBaixo = 0;
		int alturaMaisAlta = 0, alturaMaisBaixa = Integer.MAX_VALUE;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o número do aluno " + i + ": ");
			int numAluno = sc.nextInt();

			System.out.print("Digite a altura do aluno " + i + " em cm: ");
			int altura = sc.nextInt();

			if (altura > alturaMaisAlta) {
				alturaMaisAlta = altura;
				numAlunoMaisAlto = numAluno;
			}

			if (altura < alturaMaisBaixa) {
				alturaMaisBaixa = altura;
				numAlunoMaisBaixo = numAluno;
			}
		}

		System.out.println("O aluno mais alto é o número " + numAlunoMaisAlto + " com " + alturaMaisAlta + " cm");
		System.out.println("O aluno mais baixo é o número " + numAlunoMaisBaixo + " com " + alturaMaisBaixa + " cm");

		sc.close();
	}
}