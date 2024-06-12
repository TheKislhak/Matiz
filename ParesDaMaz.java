package MaEx;

public class ParesDaMaz {

	public static void main(String[] args) {
		int m[][] = new int [5][5];

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				m[i][j] = (int)Math.round(Math.random()*100);
				if (m[i][j] % 2 == 0) {
					System.out.println(m[i][j]);
				}
			}
		}

	}

}
