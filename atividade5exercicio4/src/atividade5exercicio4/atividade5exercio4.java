package atividade5exercicio4;

import java.util.Scanner;

public class exercio4 {
	
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);

			float[][] notas = new float[10][4];
			float[] medias = new float[10];

			for(int i = 0; i < notas.length; i++) {
				float calculoNotas = 0.0f;

				for(int j = 0; j < notas[0].length; j++) {
					System.out.println("Qual a " + (j + 1) + "ª nota do " + (i + 1) + "º estudante?");
					notas[i][j] = ler.nextFloat();

					calculoNotas += notas[i][j];
				}

				medias[i] = calculoNotas / (notas[0].length);
			}

			for(int i = 0; i < medias.length; i++) {
				System.out.printf("A média do estudante é %d: %.1f \n", (i+1), medias[i]);
			}

	
		}
	}


