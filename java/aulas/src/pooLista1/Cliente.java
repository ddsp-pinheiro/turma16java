package pooLista1;

public class Cliente 
{
	/*Crie uma classe cliente e apresente os atributos e métodos
	 *referentes esta classe, em seguida crie um objeto cliente,
	 *defina as instancias deste objeto e apresente as informações
	 * deste objeto no console.
	 */
	
	private String nome;
	private int idade;
	private double altura;
	private char tamanhoCamiseta;
	
	public String nome() 
	{
		return nome;
	}

	public void nome(String nome) 
	{
		this.nome = nome;
	}

	public int idade() 
	{
		return idade;
	}

	public void idade(int idade) 
	{
		this.idade = idade;
	}
	
	public double altura() 
	{
		return altura;
	}

	public void altura(double altura) 
	{
		this.altura = altura;
	}
	public char tamanhoCamiseta() 
	{
		return tamanhoCamiseta;
	}

	public void tamanhoCamiseta(char tamanhoCamiseta) 
	{
		this.tamanhoCamiseta = tamanhoCamiseta;
	}
	

}
