package erro;

import java.util.Scanner;

public class Try {
		//
		public static void main(String[] args) 
		{
			Scanner leia = new Scanner(System.in);
			
			try
			{
			
				System.out.println("Digite uma sequencia de nomes:");
				String[] vetor = leia.nextLine().split(" ");//{"ed","rafao","milton"}
				System.out.println("Digite uma posi��o da lista: ");
				int posicao = leia.nextInt();
				System.out.println("O nome na posi��o escolhida � "+vetor[posicao]);
			}
			catch (java.lang.ArrayIndexOutOfBoundsException erro1 )
			{
				System.out.println("Posi��o n�o identificada.");
			}
			catch(java.util.InputMismatchException erro2)
			{
				System.out.println("Digite um numero. Ex: 1,2,3..");
			}
			finally 
			{
			    System.out.println("Termino da verifica��o de erros.");
			}

			System.out.println("Fim de programa!!!!");
		}
		
}
