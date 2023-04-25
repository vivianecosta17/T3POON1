package Questao26;

public class MultiplosDeTres  {

	public static void main(String[] args) {
		int contador = 0;
		int numero = 1;
		        
		while (contador < 5) {
			if (numero % 3 == 0) {
				System.out.println(numero);
				contador++;
			}
			numero++;
		}
	}
}