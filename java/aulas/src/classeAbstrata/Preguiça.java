package classeAbstrata;

public class Preguiça extends Animal 
{

	public Preguiça(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String som() {
		
		return "(preguiça não tem barulho caracteristico)";
	}
	public void subirAvore() {
		
	}

}
