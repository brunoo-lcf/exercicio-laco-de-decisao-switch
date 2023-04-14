package JavaTech2;

import java.util.Scanner;

public class LacoDecisao {

	public static void main(String[] args) {
		
		float n1,n2,n3,media; 
		int op;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.printf("\nMédia final do alune: %.2f",media);
		
		if(media>=7 && media<=10) {
			System.out.println("\nAlune aprovade!!!");
		}
		else if(media>=5 && media<7) {
			System.out.println("\nAlune de recuperação!!!");
		}
		else if(media>=0 && media<5) {
			System.out.println("\nAlune reprovade!!!");
		}
		else{
			System.out.println("\nValor não atende os parâmetros!!!");
		}
		
		System.out.println("\nMenu de elogios!!!");
		System.out.println("\nOpções para elogiar a nossa família COLMÉIA TECH");
		System.out.println("\n1- Todos são muito legais!!! ");
		System.out.println("\n2- Somos muito unidos!!!");
		System.out.println("\n3- Todos são ótimos atores/atrizes!!!");
		System.out.println("\n4- Todos estão se ajudando muito!!!");
		System.out.println("\nEscolha qual elogio quer fazer: ");
		op = leia.nextInt();
		
		switch(op){
		
		case 1:
			System.out.println("\nTodos são muito legais!!!");
			break;
		case 2:
			System.out.println("\nSomos muito unidos!!!");
			break;
		case 3:
			System.out.println("\nTodos são ótimos atores/atrizes!!!");
			break;
		case 4: 
			System.out.println("\nTodos estão se ajudando muito!!!");
			System.out.println("\nBla bla bla");
			if (media>8) {
				
				System.out.println("\nAlém de se ajudar, estão tendo bons resultados!!!");
				}else
				{
					System.out.println("\nBem, estão se ajudando mas os resultados ainda não estão aparecendo");
				}
				break;
			default:
				System.out.println("\nOpção Inválida!!!");
		}
	}
		
		
		
}


