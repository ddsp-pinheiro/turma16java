package aulas;

import java.util.Scanner;

public class Exercicio4
{
	public static void main(String[] args) 
	{
		double A,B,C,R,S,D;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite um valor para A: ");
		A=ler.nextInt();
		
		System.out.println("Digite um valor para B: ");
		B=ler.nextInt();
		
		System.out.println("Digite um valor para C: ");
		C=ler.nextInt();
		
		R=Math.pow((A+B),2);
		S=Math.pow((B+C),2);
		
		D=(R+S)/2;
		
		System.out.println("Resultado: "+D);
		
		
		
	}

}
