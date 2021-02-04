package classeAbstrata;

public class Cachorro extends Animal
{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public String som() {
		
		return "au au au";
	}
	public void corre() {
			
	}

}
