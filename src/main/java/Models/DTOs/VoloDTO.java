package Models.DTOs;

import java.util.Date;

public class VoloDTO {
	private int id;
    private String nome;
    private int postiEconomy;
    private int postiBusiness;
    private int postiPrimaClasse;
    private int postiTotale;
    private boolean approvazione;
    private Date dataPartenza;
    private Date dataArrivo;
    private String cittaPartenza;
    private String cittaArrivo;
    private boolean logicDelete;
    private Date ultimaModifica;
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
	public int getPostiEconomy() {
		return postiEconomy;
	}
	public void setPostiEconomy(int postiEconomy) {
		this.postiEconomy = postiEconomy;
	}
	public int getPostiBusiness() {
		return postiBusiness;
	}
	public void setPostiBusiness(int postiBusiness) {
		this.postiBusiness = postiBusiness;
	}
	public int getPostiPrimaClasse() {
		return postiPrimaClasse;
	}
	public void setPostiPrimaClasse(int postiPrimaClasse) {
		this.postiPrimaClasse = postiPrimaClasse;
	}
	public int getPostiTotale() {
		return postiTotale;
	}
	public void setPostiTotale(int postiTotale) {
		this.postiTotale = postiTotale;
	}
	public boolean isApprovazione() {
		return approvazione;
	}
	public void setApprovazione(boolean approvazione) {
		this.approvazione = approvazione;
	}
	public Date getDataPartenza() {
		return dataPartenza;
	}
	public void setDataPartenza(Date dataPartenza) {
		this.dataPartenza = dataPartenza;
	}
	public Date getDataArrivo() {
		return dataArrivo;
	}
	public void setDataArrivo(Date dataArrivo) {
		this.dataArrivo = dataArrivo;
	}
	public String getCittaPartenza() {
		return cittaPartenza;
	}
	public void setCittaPartenza(String cittaPartenza) {
		this.cittaPartenza = cittaPartenza;
	}
	public String getCittaArrivo() {
		return cittaArrivo;
	}
	public void setCittaArrivo(String cittaArrivo) {
		this.cittaArrivo = cittaArrivo;
	}
	public boolean isLogicDelete() {
		return logicDelete;
	}
	public void setLogicDelete(boolean logicDelete) {
		this.logicDelete = logicDelete;
	}
	public Date getUltimaModifica() {
		return ultimaModifica;
	}
	public void setUltimaModifica(Date ultimaModifica) {
		this.ultimaModifica = ultimaModifica;
	}
	@Override
	public String toString() {
		return "VoloDTO [id=" + id + ", nome=" + nome + ", postiEconomy=" + postiEconomy + ", postiBusiness="
				+ postiBusiness + ", postiPrimaClasse=" + postiPrimaClasse + ", postiTotale=" + postiTotale
				+ ", approvazione=" + approvazione + ", dataPartenza=" + dataPartenza + ", dataArrivo=" + dataArrivo
				+ ", cittaPartenza=" + cittaPartenza + ", cittaArrivo=" + cittaArrivo + ", logicDelete=" + logicDelete
				+ ", ultimaModifica=" + ultimaModifica + "]";
	}
    
}
