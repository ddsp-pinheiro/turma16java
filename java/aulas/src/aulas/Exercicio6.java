package aulas;

import java.util.Scanner;

public class Exercicio6 
{
	public static void main(String[] args) 
	{
		double x1,y1,x2,y2,d;
		
		System.out.println("Digite x do seu primeiro ponto: ");
		Scanner ler= new Scanner (System.in);
		x1= ler.nextInt();
		
		System.out.println("Digite y do seu primeiro ponto: ");
		y1= ler.nextInt();
		
		System.out.println("Digite x do seu segundo ponto: ");
		x2= ler.nextInt();
		
		System.out.println("Digite y do seu segundo ponto: ");
		y2= ler.nextInt();
		
		d= Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
		
		System.out.println("Resultado: "+d);
		
	}
}
