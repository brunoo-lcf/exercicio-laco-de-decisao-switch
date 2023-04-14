package JavaTech2;

import java.util.Scanner;

public class Exercício_2_LaçosDeDecisão {

	public static void main(String[] args) {
		
		int n1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um numero: ");
		n1 = leia.nextInt();
		
		if (n1>0 && n1%2==0) {
			System.out.println("\nNumero par e positivo!");
		}
		else if(n1>0 && n1%2!=0) {
			System.out.println("\nNumero impar e positivo!!");
		}
		else if(n1<0 && n1%2==0) {
			System.out.println("\nNumero par e negativo!!");
		}
		else if(n1<0 && n1%2!=0){
			System.out.println("\nNumero negativo e impar!!");
		}
		else {
			System.out.println("\nO número digitado corresponde a zero");
		}
	}

}
