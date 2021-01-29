package aulas;

import java.util.Scanner;

public class DesafioProgramador05 
{
	 public static void main(String[] args) 
	 {
		//PAULISTINHA
			// 0 - CORITHIANS, 1 - PALMEIRAS, 2 - SANTOS, 3 - SPFC
			// PONTOS - INTEIRO - 4
			// GANHA - 3 PONTOS
			// PERDE - 0 PONTO
			// EMPATA - 1 PONTO
		 Scanner ler= new Scanner(System.in);
		 String times[] = {"CORITHIANS","PALMEIRAS","SANTOS","SPFC"};
		 int pontos[]=new int [4];
		 int resposta;
		 int timesSeparadoDecisao,timesSeparado;
		 System.out.println("\t\t\t\t\t PLACAR DE PONTUAÇÃO");
		 System.out.println("\t\t TIMES DO CAMPEONATO: CORITHIANS, PALMEIRAS,SANTOS,SPFC ");
		 
		 for(int x=0;x<4;x++)
		 {
			 System.out.println("RODADA "+(x+1));
			 for(int y=0; y < 4; y++)
			 {
				 System.out.println(times[y]+" 1- ganhou 2- perdeu ou 3-empatou");
				 resposta = ler.nextInt();
				 if(resposta==1)
				 {
					 pontos[y]=+3;
				 }
				 else if(resposta==2)
				 {
					 pontos[y]=+0;
				 }
				 else if(resposta==3)
				 {
					 pontos[y]=+0;
				 }
				 else
				 {
					 System.out.println("resposta não compreendida");
				 }
			 }
		 }
		 for(int z=0;z<4;z++)
		 {
			 System.out.println(times[z]+" finalizou com "+pontos[z]+" pontos/n");
		 }
		 System.out.println("Deseja ver um time separadamente? 1-Sim/2- Não");
		 timesSeparadoDecisao=ler.nextInt();
		 if(timesSeparadoDecisao==1)
		 {
			 System.out.println("Qual time?0- CORITHIANS/1- PALMEIRAS/2- SANTOS/3- SPFC");
			 timesSeparado=ler.nextInt();
			 System.out.println((times[timesSeparado])+" pontos "+(pontos[timesSeparado]));
		 }
		 else
		 {
			 System.out.println("FIM DE PLACAR");
		 }
	 }
}
