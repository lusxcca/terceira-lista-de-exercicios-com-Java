package lista03;

import java.util.Scanner;

public class L03E_DolarParaReal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe quantos d�lares voc� possui: ");
		int dolar = sc.nextInt();
		System.out.println("Informe a taxa de convers�o para real: ");
		float conversao = sc.nextFloat();
		float real = dolar/conversao;
		System.out.println("Voc� pode converter esses d�lares para "+real+" reais");
		sc.close();

	}

}
