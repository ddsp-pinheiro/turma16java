package classeAbstrata;

public class Cavalo extends Animal 
{
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public String som() {
		
		return " hiin in in hinir";
	}

	
	
}
