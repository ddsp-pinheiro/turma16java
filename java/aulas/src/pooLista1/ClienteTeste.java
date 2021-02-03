package pooLista1;
import pooLista1.Cliente;
public class ClienteTeste 
{
	public static void main(String[] args) 
	{
		Cliente c1 = new Cliente();
		

		c1.nome("Dani");
		c1.idade(18);
		c1.altura(1.60 );
		c1.tamanhoCamiseta('P');
		

		System.out.println("NOME: " + c1.nome());
		System.out.println("IDADE: " + c1.idade());
		System.out.printf("ALTURA: "+c1.altura()+"\n");
		System.out.println("TAMANHO DE CAMISETA: "+c1.tamanhoCamiseta());
		
		
	}
}
