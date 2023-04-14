package JavaTech2;

import java.util.Scanner;

public class Exercícios_4_LaçosDeDecisão {

	public static void main(String[] args) {
		
		String palavra1, palavra2, palavra3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a primeira palavra: ");
		palavra1 = leia.nextLine();
		System.out.println("Entre com a segunda palavra: ");
		palavra2 = leia.nextLine();
		System.out.println("Entre com a terceira palavra: ");
		palavra3 = leia.nextLine();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("É uma Águia!");
				}else {
					System.out.println("\nÉ uma Pomba");
				}
			}else {
				if(palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("\nÉ um ser Humano");
				}else {
					System.out.println("\nÉ uma Vaca");
				}
			}
		}else {
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nÉ uma Pulga");
				}else {
					System.out.println("\nÉ uma Lagarta");
				}
			}else {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nÉ uma sangue suga");
				}else {
					System.out.println("\nÉ uma Minhoca");
				}
			}
		}

	}

}
