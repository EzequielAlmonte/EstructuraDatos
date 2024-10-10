package logico;

import java.time.LocalDateTime;

public class PrintService {
    private PrintQueue queue;

    public PrintService() {
        queue = new PrintQueue();
    }

    // Esto simula la recepci�n de un trabajo de impresi�n
    public void receiveJob(String user, char prioridad) {
        PrintJob job = new PrintJob(user, LocalDateTime.now(), prioridad);
        queue.addJob(job);
    }

    // Procesar trabajos de la cola
    public void processJobs() {
        while (!queue.isEmpty()) {
            queue.processNextJob();
        }
    }
}

