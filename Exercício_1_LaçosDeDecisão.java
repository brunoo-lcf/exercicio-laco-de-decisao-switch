package JavaTech2;

import java.util.Scanner;

public class Exercício_1_LaçosDeDecisão {

	public static void main(String[] args) {
		
		float n1,n2,n3,soma;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira o valor de A: ");
		n1 = leia.nextFloat();
		System.out.println("Insira o valor de B: ");
		n2 = leia.nextFloat();
		System.out.println("Insira o valor de C: ");
		n3 = leia.nextFloat();
		
		soma = n1+n2;
		
		System.out.println("O valor da soma é: "+soma);
		
		if(soma>n3) {
			System.out.println("\nA soma de A + B é Maior do que C.");
			}
		else if(soma<n3) {
			System.out.println("\nA soma de A + B é Menor do que C.");
		}
		else{
			System.out.println("\nA soma ed A + B é igual a C.");
		}
		

	}

}
