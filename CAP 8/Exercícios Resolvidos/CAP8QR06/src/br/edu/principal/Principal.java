package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esse programa faz a tabela de multiplicação de um número entre 1 e 9");
		
		int num = 0;
		
		System.out.println("Digite um número no intervalo entre 1 e 9");
		num = sc.nextInt();

		while(num >= 1 && num <= 9) {
			multiplicacao(num);
			num = num + 1;
		}
		
	}
	public static void multiplicacao(int n) {
		
		int i , j = 0;
		
		for(i = 1; i <= n; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print( i * j + " ");
			}
			System.out.println();
		}
		System.out.println();		
	}

}