package encapsulamentoMe;

public class Pessoa  
{
	/*1.Cria uma Classe Pessoa, contendo os atributos encapsulados, 
	 * com seus respectivos seletores(getters) e modificadores (setters)
	 * , e ainda o construtor padrão e pelo menos mais duas opções
	 *  de construtores conforme sua percepção. Atributos: String nome; 
	 *  String endereço; String telefone;
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
	public String getEndereço() {
		return endereco;
	}
	public void setEndereço(String endereço) 
	{
		this.endereco = endereço;
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
