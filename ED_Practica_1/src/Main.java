
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ****Punto A****
		Criba criba = new Criba();  
        int N = 50000; 
        long startTime = System.nanoTime();
        boolean[] esPrimo = criba.calcularPrimos(N);  
        criba.mostrarPrimos(esPrimo);  
        long endTime = System.nanoTime();
        
        long duration = endTime - startTime;
        System.out.println("\nTiempo de ejecución: " + duration + " nanosegundos");*/
		
		/* ****Punto B**** */
		
		int[] valores = {10000, 50000, 900000};
		Criba criba = new Criba();
		
		for (int N : valores) {
            long startTime = System.nanoTime();
            boolean[] esPrimo = criba.calcularPrimos(N);   
            long endTime = System.nanoTime();

            long duration = endTime - startTime;
            System.out.println("Tiempo de ejecución para N=" + N + ": " + duration + " nanosegundos");
        }
	}

}
