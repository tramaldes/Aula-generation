package Turma22;

public class ExercícioFOR {

	public static void main(String[] args) {
		int cont = 0;
		for (int i = 1000; i < 2000; i++) {
			if (i % 11 == 5) {
				System.out.println(i + "");
				if (++cont > 20) {
					System.out.println("");
					cont = 0;
				}
			}
		}

	}

}
