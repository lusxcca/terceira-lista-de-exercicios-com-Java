package lista03;

import java.util.Scanner;

public class L03G_QuadradoSoma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int valor3 = sc.nextInt();
		
		int resultado = (valor1+valor2+valor3)*(valor1+valor2+valor3);
		System.out.println("O quadrado da soma dos 3 valores � de: "+resultado);
		sc.close();

	}

}
