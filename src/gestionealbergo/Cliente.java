package gestionealbergo;

import java.util.Vector;

public class Cliente extends Prenotazione{
	
	public String nome;
	public String cognome;
	public String cellulare ;
	public String email;
	private Prenotazione Prenotazione;
	
	public Cliente(String nome, String cognome, String cellulare, String email) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.cellulare = cellulare;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCellulare() {
		return cellulare;
	}

	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Vector<Prenotazione> getPrenotazioni (){
		return null;
		
	}
	
	public void setPrenotazioni(Prenotazione Prenotazione) {
		this.Prenotazione = Prenotazione;
	}

}
