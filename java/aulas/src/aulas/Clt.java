package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Clt {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US); //define o tipo de padronização
		//area = base * altura / 2
		Scanner leia = new Scanner(System.in);//instaciar = criar
		double base, altura, area1, area2, area3;
		
		System.out.println("Digite a base do triangulo 1 : ");
		base = leia.nextDouble();
		System.out.println("Digite a altura do triangulo 1 : ");
		altura = leia.nextDouble();
		
		area1 = ((base * altura) / 2 );
		
		System.out.println("Digite a base do triangulo 2 : ");
		base = leia.nextDouble();
		System.out.println("Digite a altura do triangulo 2 : ");
		altura = leia.nextDouble();
		
		area2 = ((base * altura) / 2 );
		
		System.out.println("Digite a base do triangulo 3 : ");
		base = leia.nextDouble();
		System.out.println("Digite a altura do triangulo 3 : ");
		altura = leia.nextDouble();
		
		area3 = ((base * altura) / 2 );
		
		System.out.printf("\nA area do primeiro triangulo informado é %.2f", area1,"\n");
		
		System.out.printf("\nA area do segundo triangulo informado é %.2f", area2,"\n");
		
		System.out.printf("\nA area do terceiro triangulo informado é %.2f", area3,"\n");
		
		if (area1>area2 && area1>area3)
		{
			System.out.println("\nA maior area é "+area1+"\n");
		}
		else if (area2>area1 && area2>area3)
		{
			System.out.println("\nA maior area é "+area2);
		}
		else if (area3>area2 && area1<area3)
		{
			System.out.println("\nA maior area é "+area3);
		}
		else if (area1==area2 && area2==area3)
		{
			System.out.println("\nTodas as areas são iguais.");
		}
 


	}

}

