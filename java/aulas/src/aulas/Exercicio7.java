package aulas;

import java.util.Scanner;

public class Exercicio7 
{
	public static void main(String[] args) {
		int a, b, c, d, e, f;
		
		System.out.println("escreva o valor de A: ");
		Scanner ler = new Scanner(System.in);
		a= ler.nextInt();
		
		System.out.println("escreva o valor de B: ");
		b= ler.nextInt();
		
		System.out.println("escreva o valor de C: ");
		c= ler.nextInt();
		
		System.out.println("escreva o valor de D: ");
		d= ler.nextInt();
		
		System.out.println("escreva o valor de E: ");
		e= ler.nextInt();
		
		System.out.println("escreva o valor de F: ");
		f= ler.nextInt();
		
		int x = ((c*e)-(b-f))/((a*e)-(b*d));
		int y = ((a*f)-(c*d))/((c*e)-(b*d));
		
		System.out.println("O valor de X é: " +x);
		System.out.println("O valor de Y é: " +y);
	}
}
