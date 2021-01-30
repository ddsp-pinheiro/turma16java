package lista4;
import java.util.Random;
import java.util.Scanner;

public class Exercicio02 
{
	/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado.
	 * Fa�a um programa que gere um vetor com os lan�amentos,
	 * escreva esse vetor. A seguir determine e imprima a m�dia 
	 * aritm�tica dos lan�amentos, contabilize e apresente tamb�m 
	 * quantas foram as ocorr�ncias da maior pontua��o
	 * 
	 */
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		int n[] = new int[10];
		double soma=0.0;
		double media=0.0;
		int maior= 0;
		int p=0;
		
		for(int x=0;x<10; x++)
		{
			Random aleatorio =new Random();
			n[x]=aleatorio.nextInt(6);
			soma+= n[1];
			if(n[x]>=maior)
			{
				if(n[x]==maior)
				{
					p++;
				}
				else
				{
					p=1;
				}
				maior=n[x];
			}	
		}
		System.out.println("N� de lan�amentos: ");
		for(int y=0;y<n.length;y++)
		{
			System.out.println((y+1)+"� n�mero: "+n[y]);
		}
		media= soma/n.length;
		System.out.println("M�dia: "+media);
		System.out.println("Soma: "+soma);
		System.out.println("Maior: "+(p));
	}
}
