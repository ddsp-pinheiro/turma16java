package aulas;

import java.util.Scanner;

public class DesafioProgramador02 
{
	public static void main(String[] args) {
		//A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		//coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		//a) média do salário da população; 
		//b) média do número de filhos; 
		//c) maior salário; 
		//d) percentual de pessoas com salário até R$100,00.
		Scanner ler = new Scanner (System.in);
		
		final int habitantes = 5;
		
		double salario = 0.00;
		int numeroFilhos = 0;
		double mediaSalarios = 0.00;
		double mediaFilhos = 0.00;
		double maiorSalario = 0.00;
		double PercentualSalario100 = 0.00;
		double totalSalarios = 0.00;
		int totalFilhos = 0;
		double contadorValor100 = 0.00;
		
		for (int giro=1; giro<=habitantes; giro++)
		{
			System.out.println("Digite o salario do habitante "+giro+" :");
			salario = ler.nextDouble();
			System.out.println("Digite o numero de fihos do habitante: ");
			numeroFilhos= ler.nextInt();
			
			totalSalarios+=salario;
			totalFilhos+=numeroFilhos;
			
			if(salario>maiorSalario)
			{
				maiorSalario=salario;
			}
			if(salario<=100)
			{
				contadorValor100++;
			}
		}
		mediaSalarios=totalSalarios/habitantes;
		mediaFilhos=totalFilhos/habitantes;
		PercentualSalario100 = (contadorValor100 / habitantes)*100.00;
		PercentualSalario100 = ((contadorValor100 / habitantes)*100);
		
		System.out.println("Media salarial : R$ "+mediaSalarios);
		System.out.println("Media de filhos baseado no total de "+totalFilhos+" é igual a "+mediaFilhos);
		System.out.println("O maior salario informado foi :"+maiorSalario);
		System.out.println("Numero de pessoas que ganham até R$ 100 = "+contadorValor100+" sendo um percentual total de :"+PercentualSalario100+"%\n");
		System.out.println("FIM");
		
	}
}
