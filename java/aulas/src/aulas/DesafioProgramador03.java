package aulas;

import java.util.Scanner;

public class DesafioProgramador03 {
	public static void main(String[] args) {
		
		/*
		 * 2- Fa�a um programa que pegue um n�mero do teclado e 
		 * calcule a soma de todos os n�meros  de 1 at� ele. 
		 * Ex.: o usu�rio entra 7, o programa vai mostrar 28,
		 * pois  1+2+3+4+5+6+7=28.
		 */
		
		Scanner ler =new Scanner (System.in);
		int x, resultado=0;
		System.out.println("Digite um numero: ");
		x = ler.nextInt();
		
		do 
		{
			resultado=resultado+x;
			x=x-1;
			
		} 
		while (x>=0) ;		
		System.out.println(resultado);
	}
}


