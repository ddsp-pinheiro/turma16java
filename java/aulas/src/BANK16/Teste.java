package BANK16;

public class Teste 
{
	public static void main(String[] args) {
		Conta c1 =new Conta("777", "000.xxx.xxx.00");
		c1.creditar(500);
	
		System.out.println("NUMERO CONTA:"+c1.getNumeroConta()+"\nCPF:"+c1.getCpf()+"\nSALDO:"+c1.getSaldo());
	}
}
