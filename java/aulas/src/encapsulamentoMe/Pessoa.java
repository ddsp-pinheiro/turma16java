package encapsulamentoMe;

public class Pessoa  
{
	/*1.Cria uma Classe Pessoa, contendo os atributos encapsulados, 
	 * com seus respectivos seletores(getters) e modificadores (setters)
	 * , e ainda o construtor padr�o e pelo menos mais duas op��es
	 *  de construtores conforme sua percep��o. Atributos: String nome; 
	 *  String endere�o; String telefone;
	 */
	private String nome;
	private String endereco;
	private String telefone;
	//-------------------cosntrutores----------------------
	public Pessoa(String nome, String endereco, String telefone) 
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		
	}
	public Pessoa(String nome, String telefone) 
	{
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome) 
	{
		this.nome = nome;
	}
	
	//-------------------get----------------set----------------
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getEndere�o() {
		return endereco;
	}
	public void setEndere�o(String endere�o) 
	{
		this.endereco = endere�o;
	}
	public String getTelefone() 
	{
		return telefone;
	}
	public void setTelefone(String telefone) 
	{
		this.telefone = telefone;
	}
	//----------------------------------------------------------------
	
	
}
