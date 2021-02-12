package cadastro;

import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;


public class Bloco {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int op;
		do {
			System.out.println("Escolha uma opção: "
					+ "\n1 - Criar pasta de texto"
					+ "\n2 - Escrever em arquivo"
					+ "\n3 - Ler arquivo"
					+ "\n4 - Obter informaçãosobre pasta"
					+ "\n5 - Deletar ");
			op=sc.nextInt();
		
			switch (op) {
		
			case 1:
				Criar c = new Criar();
				break;
			case 2:
				Escrever e = new Escrever();
				break;
			case 3:
				Ler l = new Ler();
				break;
			case 4:
				ObterInfo o = new ObterInfo();
			}
		}while(op>=1 && op <=4);
		
		if(op<1 || op>4) {
			System.out.println("[*****OPÇÃO INVALIDA*****]"
					+ "\n\nDigite uma opção valida:");
		}
		
		
		
		
	}

	
}


