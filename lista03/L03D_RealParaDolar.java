package lista03;

import java.util.Scanner;

public class L03D_RealParaDolar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos reais voc� tem: ");
		int real = sc.nextInt();
		System.out.println("Informe a taxa de convers�o para d�lar: ");
		float conversao = sc.nextFloat();
		
		float dolar = real*conversao;
		System.out.println("Essa quantidade de reais pode sem convertida em "+dolar+" d�lares.");
		sc.close();
	}

}
