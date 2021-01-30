package lista4;

import java.util.Scanner;

public class Exercicio01 
{

	public static void main(String[] args) 
	{
		/*Faça um programa que crie um vetor por leitura com 5 
		 * valores de pontuação de uma atividade e o escreva
		 *  em seguida. Encontre após a maior pontuação e a apresente. 
		 */
		Scanner ler = new Scanner(System.in);
		int valor[] = new int [5];
		int vM=0, cnt=0;
		
		System.out.println("\t\t\t\t\\t  LEITURA DE 5 VALORES E MAIOR VALOR");
		
		for(int x=0;x<5; x++)
		{
			System.out.println("Digite um valor numero"+(x+1)+": ");
			valor[x]=ler.nextInt();
			
			if(valor[x]==vM)
			{
				cnt++;
			}
			else
			{
				cnt=1;
			}
			vM=valor[x];
		}
		System.out.println("O maior valor é "+vM);
	}
}
