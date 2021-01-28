package aulas;

import java.util.Scanner;

public class WhileTeste2 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int x;
		
		System.out.println("Insira um numero: ");
		x =ler.nextInt();
		
		while(x<100)
		{
			x=x*3;
			System.out.println(x);
		}
	}
}
