package MaEx;

import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int m[][] = new int[3][3];
		
		//entrada de dedos
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				m[i][j] = (int)Math.round(Math.random()*100);
			}
		}
		//saida de dados
		for(int p=0; p<3; p++) {
			for(int w=0; w<3; w++) {
				System.out.println(" Os valores são " + m[p][w]);
			}
		}
		
		ler.close();

	}

}
