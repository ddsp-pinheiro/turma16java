package pooLista1;

public class AviaoTeste 
{

	public static void main(String[] args) 
	{
		Aviao av1 = new Aviao();
		
		av1.acentos(18);
		av1.modelo("Jatinho Particular");
		av1.precoDeAluguel(182000.99);
		
		System.out.println("MODELO: "+av1.modelo());
		System.out.println("QNT ACENTOS DISPONIVEIS: "+av1.acentos());
		System.out.println("AERONAVE ALUGAVEL POR: "+av1.precoDeAluguel());
	}

}
