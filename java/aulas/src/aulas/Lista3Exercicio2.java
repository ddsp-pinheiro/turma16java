package aulas;

import java.util.Scanner;

public class Lista3Exercicio2 {
	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		int x,num, qntI=0, qntP=0;
		
		System.out.println("\t\t\t\t\t QUANTIFICADOR DE NUMEROS PARES E IMPARES");
		
		for(x=1; x<=10;x++) {
			
			System.out.println("Digite um numero: ");
			num= ler.nextInt();
			if(num%2==0) {
				
				qntP++;
				
			}else {
				
				qntI++;
				
			}System.out.println(qntI+" são impar e "+qntP+" são par\n");
		}
	
	}
}
