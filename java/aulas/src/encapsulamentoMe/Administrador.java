package encapsulamentoMe;

public class Administrador extends Pessoa
{
	/*Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
	administrador tem como atributos da classe Pessoa e também os atributos próprios como
	ajudaDeCusto (ajudas referentes a viagens, estadias). 
	 */
	private int dias;
	private double precoEstadia;
	
	//=============================================================
	
	public Administrador(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}

	public Administrador(String nome, String telefone) {
		super(nome, telefone);
	}

	public Administrador(String nome) {
		super(nome);
	}

	//============================================================
	
	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public double getPrecoEstadia() {
		return precoEstadia;
	}

	public void setPrecoEstadia(double precoEstadia) {
		this.precoEstadia = precoEstadia;
	}	
	//===============================================================
	public double ajudaDeCusto()
	{
		return dias*precoEstadia;
	}
	

}
