package Models.Beans;

import java.sql.Date;

import Models.Enums.RuoloEnum;

public class Utente {
    private int id;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String codiceFiscale;
    private Date dataNascita;
    private Date dataIscrizione;
    private Date ultimaModifica;
    private Boolean flagDelete;
    private Ruolo ruolo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public Date getDataIscrizione() {
		return dataIscrizione;
	}
	public void setDataIscrizione(Date dataIscrizione) {
		this.dataIscrizione = dataIscrizione;
	}
	public Date getUltimaModifica() {
		return ultimaModifica;
	}
	public void setUltimaModifica(Date ultimaModifica) {
		this.ultimaModifica = ultimaModifica;
	}
	public Boolean getFlagDelete() {
		return flagDelete;
	}
	public void setFlagDelete(Boolean flagDelete) {
		this.flagDelete = flagDelete;
	}
	public Ruolo getRuolo() {
		return ruolo;
	}
	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}
	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", password="
				+ password + ", codiceFiscale=" + codiceFiscale + ", dataNascita=" + dataNascita + ", dataIscrizione="
				+ dataIscrizione + ", ultimaModifica=" + ultimaModifica + ", flagDelete=" + flagDelete + ", ruolo="
				+ ruolo + "]";
	}

    // Getter e setter per ciascun campo

    // Costruttori
}
