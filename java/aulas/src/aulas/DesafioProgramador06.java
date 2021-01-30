package aulas;

import java.util.Scanner;

public class DesafioProgramador06 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in); 
		String nome;
		String agenda [][] = new String [24][31];
		int dia=0,hora=0;
		int opcao;
		System.out.println("Digite seu nome: ");
		nome=ler.next();
		
		do
		{
			System.out.println("\nESCOLHA UM DIA PARA CADASTRO [1/31] :");
			dia=ler.nextInt();
		
			if(dia< 1 || dia>31);
			{
				System.out.println("Data inválida.");
				dia=ler.nextInt();
			}
			dia=-1;
			System.out.println("SELECIONE A HORA DO EVENTO[0-23]: ");
			hora=ler.nextInt();
			while(hora < 0 ||hora > 23)	
			{
				System.out.println("\nHora informada incorreta, escolha entre 0 e 23 h: ");
				hora=ler.nextInt();
			}
			System.out.println("\nInforme a tarefa nesta data e hora:");
			agenda[hora][dia]=ler.next();
			System.out.println("Continua 1-sim ou 2-não:");
			opcao=ler.nextInt();
			
					
		}
		while(opcao==1);
		{
			for (int x= 0; x<31; x++)
			{
				for(int y=0; y<24;y++)
				{
					if (agenda[y][x] != "")
					{
						System.out.println("\nDia :"+(x+1)+" hora: "+y+" : "+agenda[y][x]);
					}
				}
			}
		}
	}
}
