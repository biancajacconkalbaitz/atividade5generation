package atividade5exercicio1;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int num;
		boolean numlista = false;

		System.out.println("Digite um número para pesquisa: ");
		num = ler.nextInt();

		for(int i = 0; i < 9; i++) {
			if(vetor[i] == num) {
				System.out.println("O número " + num + " se encontra na posição: " + i + "\nda lista");	
				numlista = true;
				break;
			}
		}

		if(numlista == false) {
			System.out.println("O número " + num + " não foi encontrado!");
		}
	}

}


