package encapsulamentoMe;

public class FornecedorTest {

	public static void main(String[] args) 
	{
		Fornecedor f1 =new Fornecedor("Ronaldo", "Rua x - SP ","0000-0000");
		f1.setEndere�o("Rua Augusta");
		f1.setValorCredito(500);
		f1.setValorDivida(1);
		
		System.out.println("TESTE    \nNOME: "+f1.getNome()+"\nENDERE�O: "+f1.getEndere�o()+"\nTELEFONE:"+f1.getTelefone()+""
				+ " \nCR�DITO: "+f1.getValorCredito()+" \nDIVIDA: "
				+f1.getValorDivida()+" \nSALDO:"+f1.obterSaldos());
	}

}
