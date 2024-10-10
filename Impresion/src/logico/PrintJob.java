package logico;

import java.time.LocalDateTime;

public class PrintJob implements Comparable<PrintJob> {
    private String user; //variable usuario
    private LocalDateTime horaEnvio; //variable para tomar la hora-tiempo cuando se agrega un trabajo
    private char prioridad;  // la prioridad del trabajo puede ser: (L - Baja, M - Media, H - Alta).

    public PrintJob(String user, LocalDateTime horaEnvio, char prioridad) {
        this.user = user;
        this.horaEnvio = horaEnvio;
        this.prioridad = prioridad;
    }
    
    // Este constructor setea la prioridad por defecto en M
    public PrintJob(String user, LocalDateTime horaEnvio) {
        this(user, horaEnvio, 'M');
    }
    
    //setters y getters
	public LocalDateTime getHoraEnvio() {
		return horaEnvio;
	}

	public void setHoraEnvio(LocalDateTime horaEnvio) {
		this.horaEnvio = horaEnvio;
	}

	public char getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(char prioridad) {
		this.prioridad = prioridad;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
    @Override
    public int compareTo(PrintJob other) {
       //Este metodo primero compara el trabajo por la prioridad
        if (this.prioridad != other.prioridad) {
            return Character.compare(other.prioridad, this.prioridad); // 'H' > 'M' > 'L'
        }
        // Luego si tienen la misma prioridad, comparar por el tiempo de envio del trabajo
        return this.horaEnvio.compareTo(other.horaEnvio);
    }

    @Override
    public String toString() {
        return "Usuario: " + user + ", Hora: " + horaEnvio + ", Prioridad: " + prioridad;
    }


}

