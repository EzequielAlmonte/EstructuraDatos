package logico;

import java.util.PriorityQueue;

public class PrintQueue {
    private PriorityQueue<PrintJob> jobQueue;

    public PrintQueue() {
        jobQueue = new PriorityQueue<>();
    }

    // Agrega un trabajo a la cola
    public void addJob(PrintJob job) {
        jobQueue.offer(job);
        System.out.println("Trabajo agregado: " + job);
    }

    // busca el siguiente proceso en cola para proesarlo
    public PrintJob processNextJob() {
        if (!jobQueue.isEmpty()) {
            PrintJob nextJob = jobQueue.poll();
            System.out.println("Procesando trabajo: " + nextJob);
            return nextJob;
        } else {
            System.out.println("No hay trabajos en la cola.");
            return null;
        }
    }

    // Verifica si la cola de impresion esta vacia
    public boolean isEmpty() {
        return jobQueue.isEmpty();
    }
}



