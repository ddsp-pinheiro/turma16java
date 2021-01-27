package aulas;

import java.util.Scanner;

public class Exercicio5 
{
	public static void main(String[] args) {
		double n1, n2 , n3;
		//n1= nota 1/n2 = nota2/ n3= nota 3
		
		System.out.println("Digite sua primeira nota: ");
		Scanner ler =new Scanner (System.in);
		n1=ler.nextDouble();
		
		System.out.println("Digite sua primeira nota: ");
		n2 =ler.nextDouble();
		
		System.out.println("Digite sua primeira nota: ");
		n3 =ler.nextDouble();
		
		double mediaP = (2*n1+3*n2+5*n3)/(2+3+5);
		
		System.out.println("Sua média é: "+ mediaP);
	}
}
