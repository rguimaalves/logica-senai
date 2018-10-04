package exercicios;

import java.util.Arrays;

public class OrdenacaoDeArray {
	public static void main(String[] args) throws InterruptedException {
		int[] numerais = { 1, 5, 2, 7, 8, 3, 4 };

		System.out.println(Arrays.toString(numerais));

		int c = 0;

		for (int i = 0; i < 7; i++) {

			int v = numerais[i];
			// E PAR
			if (v % 2 == 0) {

				c += v;

			}
			else  {
				
				System.out.println(v + " IMPAR ");
			}

		}

	}
}
