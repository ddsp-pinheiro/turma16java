package cadFun;

public class Terceiro extends Empregado
{
	private double acrescimo;
	
	public Terceiro(String nome, int matricula, int horas, double valorHora, double acrescimo) {
		super(nome, matricula, horas, valorHora);
		this.acrescimo=acrescimo;
	}
	//============================================================================

	public double getAcrecimo() {
		return acrescimo;
	}

	public void setAcrecimo(double acrecimo) {
		this.acrescimo = acrecimo;
	}
	//============================================================================

	@Override
	public double salario() {
		return super.horas*(super.valorHora+(super.valorHora*this.acrescimo));
	
	}

	
	
	
	

}
