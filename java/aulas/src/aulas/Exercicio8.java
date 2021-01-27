package aulas;

import java.util.Scanner;

public class Exercicio8
{
	public static void main(String[] args) {
		
		double precoDeFabrica;
		
		System.out.println("Insira o preço de fabrica do automovel: ");
		Scanner ler= new Scanner(System.in);
		precoDeFabrica= ler.nextDouble();
		
		double distribuidor = precoDeFabrica*0.28;
		double impostos = precoDeFabrica*0.45;
		
		System.out.println("O preço para o consumidor é "+(precoDeFabrica+distribuidor+impostos));
	}
}
