package Questao29;

import java.util.Scanner;

public class Investimentos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		        
		System.out.print("Digite o salário de Carlos: R$");
		double salarioCarlos = entrada.nextDouble();
		        
		double salarioJoao = salarioCarlos / 3;
		double rendimentoCarlos = salarioCarlos * 0.02;
		double rendimentoJoao = salarioJoao * 0.05;
		System.out.println("O salário de João é: " +salarioJoao);
		        
		int meses = 0;
		        
		while (salarioJoao <= salarioCarlos) {
			salarioCarlos += rendimentoCarlos;
			salarioJoao += rendimentoJoao;
			meses++;
		}
		        
		System.out.println("João levará " + meses + " meses para alcançar ou ultrapassar o salário de Carlos.");
		        
		entrada.close();
	}
}