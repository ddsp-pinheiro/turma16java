package login;

import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;

public class Dados {
	

	private String usuario;
	private String senha;
	private String nome;
	private String email;
	private  String cpf;
	private char sexo;
	private int anoDeNascimento;
	
	//==========================================================================================================

	public Dados(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		//login
	}
	
	public Dados(String usuario, String senha, String nome, String email, String cpf, char sexo,
			int anoDeNascimento) {
		//super(usuario, senha);
		this.usuario = usuario;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.sexo = sexo;
		this.anoDeNascimento = anoDeNascimento;
		//cadastro
	}
	
	//==========================================================================================================

	public String getUsuario() {
		return usuario;
	}
	public String getSenha() {
		return senha;
	}
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}

	public char getSexo() {
		return sexo;
	}

	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}

	//==========================================================================================================
	public String pronome()
	{
		String pronome = null; 
		if (sexo=='M'){
			pronome="Sr.";
		}
		else if (sexo=='F'){
			pronome="Sra.";
		} 
		else if (sexo=='O'){
			pronome="Srx.";
		}
		
		return pronome;
	}

	public String genero()
	{
		String genero = null; 
		if (sexo=='M'){
			genero="Masculino";
		}
		else if (sexo=='F'){
			genero="Feminino";
		} 
		else if (sexo=='O'){
			genero="Outro";
		}
		
		return genero;
	}
	
	public int idade()
	{
		int idade;
		final int anoAtual=2021;
		idade= anoAtual -anoDeNascimento;
		
		return idade;
	}

	
	public String dados()
	{
		return "\nOlá "+pronome()+getNome()+"\n\nDADOS SEUS DADOS: \n"+"\nIDADE: "+idade()+"\nGENERO: "+genero()+
				"\nUSUÁRIO: "+getUsuario()+"\nEMAIL: "+getEmail()+"\nCPF: "+getCpf();
	}

	//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

	private Formatter x;
	Scanner read = new Scanner(System.in);

	public void abra()
	{
		try{
			
			FileWriter escreve = new FileWriter("‪C:\\Users\\Proevento\\Desktop\\Dados.txt", true);
			escreve.append("Estou escrevendo no arquivo...\n");
			escreve.append("agora estou na 2ª linha do arquivo.");
			escreve.append(" Continuo na mesmas linha, mas agora quero fechar o arquivo.");
			escreve.close();
			
		}catch(Exception error) {
			System.out.println("error");}

	}
	
	public void escreva()
	{
		String o;
		
		System.out.println("digite algo");
		o = read.nextLine();
		
		x.format("\n%s", o);
		
	}

	public void feche()
	{
		x.close();
	
	}
	
	
	

	
}

	
	
