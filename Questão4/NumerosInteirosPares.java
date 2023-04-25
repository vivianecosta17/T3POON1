package Questão4;

import java.util.Scanner;

public class NumerosInteirosPares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o valor de a para o " + (i+1) + "º par:");
			int a = entrada.nextInt();

			System.out.println("Digite o valor de b para o " + (i+1) + "º par:");
			int b = entrada.nextInt();

			System.out.println("Números inteiros pares entre " + a + " e " + b + ":");
			for (int j = a; j <= b; j++) {
				if (j % 2 == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println("\n");
		}

		entrada.close();
	}
}