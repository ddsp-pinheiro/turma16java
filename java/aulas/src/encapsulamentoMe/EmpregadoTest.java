package encapsulamentoMe;

public class EmpregadoTest {

	public static void main(String[] args) 
	{
		Empregado e1 =new Empregado("Anderson","98888-8888");
		e1.setImposto(0.005);
		e1.setSalarioBase(2500);
		
		System.out.println("TESTE"+"\nNOME: "+e1.getNome()+"\nTELEFONE: "+e1.getTelefone()+"\nSALARIO: "+e1.getSalarioBase()+"\nIMPOSTO: "
		+e1.getImposto()+"\nSALARIO FINAL: "+e1.calcularSalario());
	}

}
