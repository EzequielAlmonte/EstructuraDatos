import java.util.Arrays;


public class Criba {
	public boolean[] calcularPrimos(int N) {
        boolean[] esPrimo = new boolean[N + 1];
        Arrays.fill(esPrimo, true);
        esPrimo[0] = esPrimo[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (esPrimo[i]) {
                for (int j = i * i; j <= N; j += i) {
                    esPrimo[j] = false;
                }
            }
        }
        return esPrimo;
    }

    public void mostrarPrimos(boolean[] esPrimo) {
        System.out.println("Números primos:");
        for (int i = 2; i < esPrimo.length; i++) {
            if (esPrimo[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
