package pooLista1;

public class Aviao 
{
	/*Crie uma classe avi�o e apresente os atributos
	 * e m�todos referentes esta classe, em seguida crie
	 * um objeto avi�o, defina as instancias deste objeto 
	 * e apresente as informa��es deste objeto no console
	 */
	private int acentos;
	private String modelo;
	private double precoDeAluguel;
	
	public int acentos()
	{
		return acentos;
	}
	public void acentos(int acentos)
	{
		this.acentos=acentos;
	}
	public String modelo()
	{
		return modelo;
	}
	public void modelo(String modelo)
	{
		this.modelo=modelo;
	}
	public double precoDeAluguel()
	{
		return precoDeAluguel;
	}
	public void precoDeAluguel(double precoDeAluguel)
	{
		this.precoDeAluguel=precoDeAluguel;
	}
}
