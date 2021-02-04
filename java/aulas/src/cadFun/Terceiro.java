package cadFun;

public class Terceiro extends Empregado
{
	private double acrecimo;
	
	public Terceiro(String nome, int matricula, int horas, double valorHora) {
		super(nome, matricula, horas, valorHora);
		this.acrecimo=acrecimo;
	}
	//============================================================================

	public double getAcrecimo() {
		return acrecimo;
	}

	public void setAcrecimo(double acrecimo) {
		this.acrecimo = acrecimo;
	}
	//============================================================================

	@Override
	public double salario() {
		return super.horas*(super.valorHora+(super.valorHora*this.acrecimo));
	
	}

	
	
	
	

}
