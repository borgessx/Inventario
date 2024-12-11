package Inventário;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		int tempNúmero;
		String tempNome;
		int tempQtd;
		double tempPreço;
		int maxSize=-1;
		
		do {
			try {
				System.out.println("insira o número de produtos que você gostaria de adicionar");
				System.out.println("Digite 0(zero) se não desejar adicionar produtos");
				maxSize = in.nextInt();
				if(maxSize<0)
					System.out.println("Valor incorreto inserido");
			}
			catch(InputMismatchException e) {
				System.out.println("Tipo de dados incorreto inserido");
				in.nextLine();
			}
			catch(Exception e) {
					System.out.println(e);
					in.nextLine();
			}
		}while(maxSize<0);
		if(maxSize ==0) {
			
			System.out.println("Não há produtos!");
		}else {
			produto[] produtos = new produto[maxSize];
			for(int i = 0; i<maxSize; i++) {
				in.nextLine();

				System.out.print("\n\nInsira o nome do produto: ");
				tempNome = in.nextLine();
				System.out.print("Insira a quantidade em estoque para este produto: ");
				tempQtd = in.nextInt();
				System.out.print("Insira o preço para este produto: ");
				tempPreço = in.nextDouble();
				System.out.print("Insira o número do item: ");
	
				tempNúmero = in.nextInt();
				
				produtos[i] = new produto(tempNúmero, tempNome, tempQtd, tempPreço);
			}//endfor
			
			for(produto produto: produtos)
				System.out.println(produto);
			}
		}
	}
