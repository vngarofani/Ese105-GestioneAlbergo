package gestionealbergo;

import java.time.LocalDateTime;


public class Prenotazione {
	
	public String richieste;
	public String numeroNotti;
	public LocalDateTime arrivoIl;
	public LocalDateTime effettuataIl;
	public LocalDateTime clienteArrivaIl;
	

	public String getRichieste() {
		return richieste;
	}

	public void setRichieste(String richieste) {
		this.richieste = richieste;
	}

	public String getNumeroNotti() {
		return numeroNotti;
	}

	public void setNumeroNotti(String numeroNotti) {
		this.numeroNotti = numeroNotti;
	}

	public LocalDateTime getArrivoIl() {
		return arrivoIl;
	}

	public void setArrivoIl(LocalDateTime arrivoIl) {
		this.arrivoIl = arrivoIl;
	}

	public LocalDateTime getEffettuataIl() {
		return effettuataIl;
	}

	public void setEffettuataIl(LocalDateTime effettuataIl) {
		this.effettuataIl = effettuataIl;
	}

	public LocalDateTime getClienteArrivaIl() {
		return clienteArrivaIl;
	}

	public void setClienteArrivaIl(LocalDateTime clienteArrivaIl) {
		this.clienteArrivaIl = clienteArrivaIl;
	}
	 
	public Camera getCamera(){
		return null;
		
	}


}
	
	
	

