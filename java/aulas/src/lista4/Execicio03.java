package lista4;

import java.util.Scanner;

public class Execicio03 
{

	public static void main(String[] args) 
	{
		/*Escreve um programa que lê duas matrizes 
		 * N1 (4,6) e N2(4,6) e cria:
		*a) Uma matriz M1 cujos elementos serão as somas dos
 		*elementos de mesma posição das matrizes N1 e N2;
		*b) Uma matriz M2 cujos elementos serão as diferenças
 		*dos elementos de mesma posição das matrizes N1 e N2.
 		*/
		
		Scanner ler = new Scanner(System.in);
		int n1[][]= new int [4][6];
		int n2[][]= new int [4][6];
		int m1[][]= new int [4][6];
		int m2[][]= new int [4][6];

		for(int x=0;x<4;x++)
		{
			for(int y=0; y<6;y++)
			{
				System.out.print("Escolha um valor N1 :");
				n1[x][y] = ler.nextInt();
			}
		}
		for(int x=0;x<4;x++)
		{
			for(int y=0; y<6;y++)
			{
				System.out.print("Escolha um valor N2 :");
				n2[x][y] = ler.nextInt();
			}
		}
		for(int x=0;x<4;x++)
		{
			for(int y=0; y<6;y++)
			{
				m1[x][y]=n1[x][y]+n2[x][y];
				System.out.println(m1[x][y]);
			}
		}
		for(int x=0;x<4;x++)
		{
			for(int y=0; y<6;y++)
			{
				m1[x][y]=n1[x][y]+n2[x][y];
				System.out.println(m1[x][y]);
				
			}
		}
	}
}

