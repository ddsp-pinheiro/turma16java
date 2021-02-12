package cadastro;

import java.io.File;
import java.util.Scanner;

public class ObterInfo {
	Scanner sc = new Scanner (System.in);
	String pastaNome;
	
	public ObterInfo(){
		
		System.out.println("Digite o nome da pasta onde deseja escrever:"
				+ " \n(Observa��o: N�o adicione "+".txt"+" ao nome)");
		pastaNome = sc.next();
		pastaNome=pastaNome+".txt";
		
		File arquivo = new File(pastaNome);
	    if (arquivo.exists()) {
	      System.out.println("Nome: " + arquivo.getName());
	      System.out.println("Diret�rio: " + arquivo.getAbsolutePath());
	      System.out.println("� possivel escrever: " + arquivo.canWrite());
	      System.out.println("� possivel ler: " + arquivo.canRead());
	      System.out.println("Tamanho em bytes " + arquivo.length()+"\n");
	    } else if (arquivo.exists()==false){
	      System.out.println("Pasta n�o encontrada ou n�o existe.\n");
	    }
	}
}
