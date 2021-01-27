package aulas;

import java.util.Scanner;

public class Lista2Exercicio3
{
	 public static void main(String[] args) {
		
		int idade;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\t\t\t\t\t\t\t CLASSIFICAÇÃO POR IDADE \nDigite sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Você pertence a categoria infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("Você pertence a categoria juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("Você pertence a categoria adulto");
		}
		else
		{
			System.out.println("Categoria não encontrada");
		}
	}
}
