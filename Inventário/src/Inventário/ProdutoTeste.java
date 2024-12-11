package Inventário;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		int tempNúmero;
		String tempNome;
		int tempQtd;
		double tempPreço;
		int maxSize;
		
		System.out.print("\n\nPor favor insira o nome do produto:");
		tempNome = in.nextLine();
		System.out.print("Insira a quantidade em estoque deste produto:");
		tempQtd = in.nextInt();
		System.out.print("Por favor insira o preço deste produto:");
		tempPreço = in.nextDouble();
		System.out.print("Por favor insira o número do item:");
		tempNúmero = in.nextInt();
		
		produto p1 = new produto(tempNúmero, tempNome, tempQtd, tempPreço);
		in.nextLine();
		System.out.print("\n\nInsira o nome do produto: ");
		tempNome = in.nextLine();
		System.out.print("Insira a quantidade em estoque para este produto: ");
		tempQtd = in.nextInt();
		System.out.print("Insira o preço para este produto: ");
		tempPreço = in.nextDouble();
		System.out.print("Insira o número do item: ");
		tempNúmero = in.nextInt();
		
		produto p2 = new produto();
		in.close();

		
		produto p3 = new produto(3,"Tiros Quentes",75, 8.99);
		produto p4 = new produto(4,"Irmãos de armas", 200, 7.75);
		produto p5 = new produto(5,"Fantástico", 500, 9.50);
		produto p6 = new produto(6,"O álbum da festa", 150, 4.00);
		
		p6.setativo(false);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
	}

}
