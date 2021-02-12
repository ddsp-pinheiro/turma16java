package cadastro;

import java.io.File;
import java.util.Scanner;

public class ObterInfo {
	Scanner sc = new Scanner (System.in);
	String pastaNome;
	
	public ObterInfo(){
		
		System.out.println("Digite o nome da pasta onde deseja escrever:"
				+ " \n(Observação: Não adicione "+".txt"+" ao nome)");
		pastaNome = sc.next();
		pastaNome=pastaNome+".txt";
		
		File arquivo = new File(pastaNome);
	    if (arquivo.exists()) {
	      System.out.println("Nome: " + arquivo.getName());
	      System.out.println("Diretório: " + arquivo.getAbsolutePath());
	      System.out.println("É possivel escrever: " + arquivo.canWrite());
	      System.out.println("É possivel ler: " + arquivo.canRead());
	      System.out.println("Tamanho em bytes " + arquivo.length()+"\n");
	    } else if (arquivo.exists()==false){
	      System.out.println("Pasta não encontrada ou não existe.\n");
	    }
	}
}
