package aulas;

import java.util.Scanner;

public class Lista2Exercicio2 
{
	public static void main(String[] args) {
		
		int s1=0, s2=0,s3=0;
		int n1, n2, n3;
		// n1= primeiro numero / n2 = segundo numero / n3= terceiro numero
		// s1 = sai em primeiro/ s2 = sai em segundo/ s3 sai em terceiro
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\t\t\t\t\t NUMERO EM ORDEM CRESCENTE \n Digite seu primeiro numero:");
		n1 =ler.nextInt();
		
		System.out.println("Digite seu segundo numero: ");
		n2 =ler.nextInt();
		
		System.out.println("Digite seu terceiro numero: ");
		n3 =ler.nextInt();
		
		System.out.println("Seus numeros em ordem crescente são: ");
		
		if(n1<n2 && n1<n3)
		{
			s1=n1;
			if(n2<n3)
			{
				s2=n2;
				s3=n3;
			}
			else
			{
				s2=n3;
				s3=n2;
			}
		}
		else if(n1>n2 && n3>n2)
		{
			s1=n2;
			if(n1<n3)
			{
				s2=n1;
				s3=n3;
			}
			else
			{
				s2=n3;
				s3=n1;
			}
		}
		else if(n3<n1 && n3<n2)
		{
			s1=n3;
			if(n1<n2)
			{
				s2=n1;
				s3=n2;
			}
			else
			{
				s2=n2;
				s3=n1;
			}
		}
		else if (n1==0 && n2==0 && n3==0)
		{
			System.out.println("Todos os nuemros são zero.");
		}
		else if (n1==n2 && n2==n3)
		{
			System.out.println("Todos os numeros são iguais");
			s1=n1;
			s2=n2;
			s3=n3;
		}
		System.out.println(s1+"-"+s2+"-"+s3);
	}
}
