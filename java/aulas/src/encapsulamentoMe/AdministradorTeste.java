package encapsulamentoMe;

import java.util.Scanner;

public class AdministradorTeste 
{
	public static void main(String[] args) 
	{
		Scanner read =new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		Administrador a1 = new Administrador(read.next());
		System.out.println("Quantos dia deseja se hospedar? ");
		a1.setDias(read.nextInt());
		a1.setPrecoEstadia(550.99);
		
		System.out.printf("Olá "+a1.getNome()+", para se hospedar "+a1.getDias()+" dias você gastará R$ %.2f",a1.ajudaDeCusto());
		System.out.println("\nPREÇO ATUDAL DE HOSPEDAGEM:"+a1.getPrecoEstadia());
	}
}
