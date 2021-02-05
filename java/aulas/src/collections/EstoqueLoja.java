package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class EstoqueLoja 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner (System.in);
		Collection<String> produtos =new ArrayList();
		
		String produto;
		char escolha;
		
		produtos.add("Arroz");
		produtos.add("Feijão");
		produtos.add("Farofa");
		produtos.add("Grão de bico");
		produtos.add("Bolacha");
		produtos.add("Refrigerante");
		produtos.add("Alcool");
		produtos.add("Detergente");
		
		System.out.println("\t\t\t\tBEM VINDO AO ESTOQUE\n");
		System.out.println("PRODUTOS EM ESTOQUE: "+produtos);
		
		do {
			
			System.out.println("\n===========================================================================================\n");
			System.out.println("Deseja remover- R, adicionar-A ou manter-M o estoque?");
			
			escolha= read.next().toUpperCase().charAt(0);
			if(escolha== 'R')
			{
				
				System.out.println("Digite qual produto irá remover: ");
				produto=read.next();
				produtos.remove(produto);
				System.out.println("ESTOQUE ATUAL: "+produtos);
			}
			else if(escolha=='A')
			{
				System.out.println("Digite qual produto irá adicionar: ");
				produto=read.next();
				produtos.add(produto);
				System.out.println("ESTOQUE ATUAL: "+produtos);
			}
			else if(escolha=='M')
			{
				System.out.println("ESTOQUE ATUAL: "+produtos);
			}
		}while (escolha!='M');
	}
}
