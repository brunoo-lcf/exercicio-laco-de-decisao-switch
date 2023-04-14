package JavaTech2;

import java.util.Scanner;

public class Exercício_5_SwitchCase {

	public static void main(String[] args) {
		
		int quant, codigo;
		float valorTotal;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Lanchonete - - - - Colmeia");
		System.out.println("\n Menu de produtos");
		System.out.println("1 - Cachorro Quente ----R$10.00");
        System.out.println("2 - X-Salada -----------R$15.00");
        System.out.println("3 - X-Bacon ------------R$18.00");
        System.out.println("4 - Bauru --------------R$12.00");
        System.out.println("5 - Refrigerante -------R$8.00");
        System.out.println("6 - Suco de laranja ----R$13.00");
        System.out.println("Escolha o produto que deseja: ");
        codigo = leia.nextInt();
        System.out.println("Digite a quantidade deste produto: ");
        quant = leia.nextInt();
        
        switch(codigo) {
        case 1:
        	valorTotal = quant * 10;
        	System.out.println("\nCachorro Quente - Valor Total: R$"+valorTotal);
        	break;
        case 2:
        	valorTotal = quant * 15;
        	System.out.println("\nX-Salada - Valor Total: R$"+valorTotal);
        	break;
        case 3:
        	valorTotal = quant * 18;
        	System.out.println("\nX-Bacon - Valor Total: R$"+valorTotal);
        	break;
        case 4:
        	valorTotal = quant * 12;
        	System.out.println("\nBauru - Valor Total: R$"+valorTotal);
        	break;
        case 5:
        	valorTotal = quant * 8;
        	System.out.println("\nRefrigerante - Valor Total: R$"+valorTotal);
        	break;
        case 6:
        	valorTotal = quant * 13;
        	System.out.println("\nSuco de laranja - Valor Total: R$"+valorTotal);
        	break;
        default: 
        	System.out.println("Código do produto inválido");
        }
		
	}

}
