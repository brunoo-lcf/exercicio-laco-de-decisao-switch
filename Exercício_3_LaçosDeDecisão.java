package JavaTech2;

import java.util.Scanner;

public class Exercício_3_LaçosDeDecisão {

	public static void main(String[] args) {
		
		String nome;
		Float idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextFloat();
		System.out.println("Você já doou sangue? ");
		boolean escolha = leia.nextBoolean();
		
		
		if (idade>=18 && idade<=69){
			if(idade>=60 && idade<=69 && escolha) {
				System.out.println(nome+" está apto para doar sangue");
			}
			else {
				System.out.println(nome+" não está apto para doar sangue");
			}
		}
		else {
			System.out.println(nome+" não está apto para doar sangue");
		}
	}

}
