package pooLista1;

public class ProdutoEletronico 
{
	/*Crie uma classe produto eletrônico e apresente os
	 * atributos e métodos referentes esta classe, em seguida
	 * crie um objeto produto eletrônico, defina as instancias 
	 * deste objeto e apresente as informações deste objeto no console.
	 */
	private String nome;
	private int codigo;
	private double preco;
	
	public String nome() 
	{
		return nome;
	}

	public void nome(String nome) 
	{
		this.nome = nome;
	}
	public int codigo()
	{
		return codigo;
	}
	public void codigo(int codigo) 
	{
		this.codigo = codigo;
	}
	public double preco()
	{
		return preco;
	}
	public void preco(double preco) 
	{
		this.preco = preco;
	}
}
