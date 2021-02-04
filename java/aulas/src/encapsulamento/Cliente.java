package encapsulamento;

public class Cliente 
{
	private String nome;
	private String codCadastro;
	private String data;
	
	public Cliente(String nome, String codCadastro, String data) {
		super();
		this.nome = nome;
		this.codCadastro = codCadastro;
		this.data = data;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCodCadastro() 
	{
		return codCadastro;
	}

	public void setCodCadastro(String codCadastro) 
	{
		this.codCadastro = codCadastro;
	}

	public String getData() 
	{
		return data;
	}

	public void setData(String data) 
	{
		this.data = data;
	}
	
	public void realizarCadastro() 
	{
		System.out.println("");
	}

	public void atualizarCadastro() 
	{

	}
	
	
}
