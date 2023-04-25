package Questao25;

import java.util.Scanner;

public class ContaIntervalos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;

		do {
			System.out.println("Digite um número positivo (ou um número negativo para sair):");
			num = entrada.nextInt();

			if (num >= 0 && num <= 25) {
				intervalo1++;
			} else if (num >= 26 && num <= 50) {
				intervalo2++;
			} else if (num >= 51 && num <= 75) {
				intervalo3++;
			} else if (num >= 76 && num <= 100) {
				intervalo4++;
			}
		} while (num >= 0);

		System.out.println("Quantidade de números no intervalo [0-25]: " + intervalo1);
		System.out.println("Quantidade de números no intervalo [26-50]: " + intervalo2);
		System.out.println("Quantidade de números no intervalo [51-75]: " + intervalo3);
		System.out.println("Quantidade de números no intervalo [76-100]: " + intervalo4);

		entrada.close();
	}
}