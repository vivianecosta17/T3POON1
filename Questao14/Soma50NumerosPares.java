package Questao14;

public class Soma50NumerosPares {

	public static void main(String[] args) {
		int soma = 0;
		int contador = 0;

		for (int i = 2; contador < 50; i += 2) {
			soma += i;
			contador++;
		}

		System.out.println("A soma dos primeiros 50 números pares é: " + soma);
	}
}