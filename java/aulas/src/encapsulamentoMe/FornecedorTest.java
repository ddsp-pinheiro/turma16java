package encapsulamentoMe;

public class FornecedorTest {

	public static void main(String[] args) 
	{
		Fornecedor f1 =new Fornecedor("Ronaldo", "Rua x - SP ","0000-0000");
		f1.setEndereço("Rua Augusta");
		f1.setValorCredito(500);
		f1.setValorDivida(1);
		
		System.out.println("TESTE    \nNOME: "+f1.getNome()+"\nENDEREÇO: "+f1.getEndereço()+"\nTELEFONE:"+f1.getTelefone()+""
				+ " \nCRÉDITO: "+f1.getValorCredito()+" \nDIVIDA: "
				+f1.getValorDivida()+" \nSALDO:"+f1.obterSaldos());
	}

}
