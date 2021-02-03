package pooLista1;

public class ProdutoEletronicoTeste 
{
	public static void main(String[] args) 
	{
		ProdutoEletronico p1 = new ProdutoEletronico();
		
		p1.nome("Smartphone");
		p1.codigo(001);
		p1.preco(1850.99);
		
		
		System.out.println("PRODUTO: "+p1.nome());
		System.out.println("CODIGO: "+p1.codigo());
		System.out.println("PREÇO: "+p1.preco());
	}
}
