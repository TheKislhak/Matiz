package MaEx;

public class MultDoMaz {

	public static void main(String[] args) {
		int a[][] = new int [3][3];
		int b[][] = new int [3][3];
		int c[][] = new int [3][3];

		for (int l = 0; l<3; l++) {
			for (int d = 0; d<3; d++) {
				a[l][d] = (int)Math.round(Math.random()*100);
				b[l][d] = (int)Math.round(Math.random()*100);
				c[l][d] = a[l][d]*b[l][d];

			}

		}

		System.out.println("Matriz A");
		for (int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print("["+a[i][j]+"]");
			}
			System.out.println("\n--------------");
		}

		System.out.println("Matriz B");
		for (int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print("["+b[i][j]+"]");
			}
			System.out.println("\n--------------");
		}

		System.out.println("Matriz C");
		for (int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print("["+c[i][j]+"]");
			}
			System.out.println("\n--------------");
		}

	}
}