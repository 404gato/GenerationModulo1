package Colect;

import java.util.ArrayList;
import java.util.Scanner;

public class List {

	public static void main(String[] args) {
		
		int x = 0;
		
		
		Scanner read = new Scanner(System.in);
		ArrayList<String> compras = new ArrayList<String>();
		
		do
		{
			System.out.println("\n\t\t\t********");
			System.out.println("\t\t\t* MENU *");
			System.out.println("\t\t\t********");
			System.out.println("   ***************************************************");
			System.out.println("*\t(1) Deseja adicionar produtos ao estoque       *"
					+ "\n*\t(2) Deseja remover produtos do estoque?        *"
					+ "\n*\t(3) Atualizar um produto do estoque            *"
					+ "\n*\t(4) Mostrar todos os produtos do estoque       *"
					+ "\n*\t(0) Ecerrar o programa                         *");
			System.out.println("   ***************************************************");
			System.out.println("\n\t\tDigite uma opção:");
			x = read.nextInt();
			
			
			
			switch(x)
			{
			case 1:
				read.nextLine();
				System.out.println("\nDigite o nome do produto: ");
				String produto = read.nextLine(); 
				compras.add(produto);
				break;
				
			case 2:
				read.next();
				System.out.println("\nDigite o produto que deseja remover: ");
				String produtor = read.next();
				 	
					if(compras.contains(produtor)) 
						compras.remove(produtor);
				 
				 	else
				 		System.out.println("\nProduto não existente!");
				 break;
				 
			case 3:
				read.next();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verificar = read.next();
				System.out.println("\nDigite  o produto que entrará em seu lugar "+verificar+" : ");
				String novo = read.next();
				
					if(compras.contains(verificar))
					{
						compras.remove(verificar);
						compras.add(novo);
					}
					
					else
						System.out.println("\nVocê não obtem esse poduto, selecione-o antes.");
					
						System.out.println("\n"+compras);
						break;
				
			case 4:
				System.out.println("\nProdutos do estoque: ");
				System.out.println("\n"+compras);
				break;
				
			case 0:
				System.out.println("\nVolte sempre!");
				break;
			
			default:
				System.out.println(" _____    _____    _____    _____\n"+
						   "|  ___|  |  _  |  |  _  |  |  _  |\n"+
						   "| |___   | |_| |  | |_| |  | | | |\n"+
						   "|  ___|  |    \\   |    \\   | | | |\n"+
						   "| |___   |  |  \\  |  |  \\  | |_| |\n"+
						   "|_____|  |__| __\\ |__| __\\ |_____|\n"+
						   "\t  DIGITE UMA OPÇÃO VÁLIDA:");
					
			 
			}while(x!=0);
			
			
		}while(x!=0);

		
}

}
