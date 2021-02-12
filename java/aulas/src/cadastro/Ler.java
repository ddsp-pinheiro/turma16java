package cadastro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ler {
	Scanner sc = new Scanner (System.in);
	String pastaNome;
	
	public Ler() {
		try {
			System.out.println("Digite o nome da pasta que deseja ler: \n(Observação: Não adicione "+".txt"+" ao nome)");
			pastaNome = sc.next();
			pastaNome=pastaNome+".txt";
			
		      File arquivo = new File(pastaNome);
		      Scanner leitorDeArquvo = new Scanner(arquivo);
		      while (leitorDeArquvo.hasNextLine()) {
		        String data = leitorDeArquvo.nextLine();
		        System.out.println(data);
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("Ocorreu um erro.");
		      e.printStackTrace();
		    }
	}
}
