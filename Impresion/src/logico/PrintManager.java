package logico;

public class PrintManager {
    public static void main(String[] args) {
        PrintService printService = new PrintService();

        // Esta es la clase principal para ejecutar el servicio
        // creamos varios usuarios para probar el servicio de impresion 
        printService.receiveJob("User1", 'H');
        printService.receiveJob("User2", 'M');
        printService.receiveJob("User", 'L');
        printService.receiveJob("Usuer4", 'M');
        printService.receiveJob("Usuer5", 'H');
        printService.receiveJob("Usuer6", 'L');

        printService.processJobs();
    }
}


