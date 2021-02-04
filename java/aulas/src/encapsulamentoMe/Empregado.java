package encapsulamentoMe;

public class Empregado extends Pessoa
{
	/*3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada
	inst�ncia da classe Empregado tem, para al�m dos atributos que caracterizam a classe Pessoa,
	os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
	retida dos impostos). Implemente a classe Empregado com m�todos seletores e modificadores
	e um m�todo calcularSalario. Escreva um programa de teste adequado para a classe
	Empregado.
	 */
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	//----------------------------construtor--------------------------------------
	public Empregado(String nome, String endereco, String telefone) 
	{
		super(nome, endereco, telefone);
	
	}
	public Empregado(String nome,  String telefone) 
	{
		super(nome,  telefone);
		
	}
	public Empregado(String nome) 
	{
		super(nome);
	}
	//-------------------------get-----set-----------------------------------------
		public int getCodigoSetor() {
			return codigoSetor;
		}
		public void setCodigoSetor(int codigoSetor) {
			this.codigoSetor = codigoSetor;
		}
		public double getSalarioBase() {
			return salarioBase;
		}
		public void setSalarioBase(double salarioBase) {
			this.salarioBase = salarioBase;
		}
		public double getImposto() {
			return imposto;
		}
		public void setImposto(double imposto) {
			this.imposto = imposto;
		}
	//-------------------------------m�todo-------------------------------------------------
		
		public  double calcularSalario()
		{
			
			imposto=salarioBase*imposto;
			return salarioBase-imposto;
			 
		}

}
