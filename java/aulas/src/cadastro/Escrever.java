package cadastro;
import java.io.FileWriter;   
import java.io.IOException;
import java.util.Scanner;
public class Escrever extends Criar{
	
	public Escrever() {
	    Scanner sc = new Scanner (System.in); 
		
	    String mensagem;
		char op;
	    
	    System.out.println("Digite algo:");
		mensagem=sc.next();
		
		
			try 
			{
		      FileWriter myWriter = new FileWriter("Dados.txt");
		      myWriter.write(mensagem);
		      myWriter.close();
		      System.out.println("Mensagem atribuida.");
		    } catch (IOException erro) {
		      System.out.println("Ocorreu um erro.");
		      erro.printStackTrace();
		    }
		
	}
}
