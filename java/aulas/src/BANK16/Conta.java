package BANK16;

public class Conta 
{
	private String numeroConta;
	private String cpf;
	private double saldo;
	
	//----------------------------------------------------
	public Conta(String numeroConta, String cpf) 
	{
		super();
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
	//--------------------------SET---GET-------------------------------
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	
	//---------------------------------METODO--------------------
		public void debitar(double valor)
		{
			
			
			if (saldo<=valor)
			{
				System.out.println("SALDO INVALIDO.");
			}else
			{
				saldo-=valor;
			}
		}
		public void creditar(double valor)
		{
				saldo+=valor;
		}
}
