package Models.Beans;

import java.sql.Date;

import Models.Enums.Alimentazione;
import Models.Enums.ClassePosto;
import Models.Enums.TipoSeduta;
import Models.Enums.TipoVideo;

public class Posto {
	    private int id;
	    private int numeroPosto;
	    private String volo;
	    private Double larghezzaPosto;
	    private TipoVideo tipoVideo;
	    private Alimentazione alimentazione;
	    private Boolean wifi;
	    private TipoSeduta tipoSeduta;
	    private Boolean ciboSpeciale;
	    private Double prezzo;
	    private ClassePosto classePosto;
	    private Boolean logicDelete;
	    private Date ultimaModifica;
	    private int voloId; 
	    private int utenteId;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNumeroPosto() {
			return numeroPosto;
		}
		public void setNumeroPosto(int numeroPosto) {
			this.numeroPosto = numeroPosto;
		}
		public String getVolo() {
			return volo;
		}
		public void setVolo(String volo) {
			this.volo = volo;
		}
		public Double getLarghezzaPosto() {
			return larghezzaPosto;
		}
		public void setLarghezzaPosto(Double larghezzaPosto) {
			this.larghezzaPosto = larghezzaPosto;
		}
		public TipoVideo getTipoVideo() {
			return tipoVideo;
		}
		public void setTipoVideo(TipoVideo tipoVideo) {
			this.tipoVideo = tipoVideo;
		}
		public Alimentazione getAlimentazione() {
			return alimentazione;
		}
		public void setAlimentazione(Alimentazione alimentazione) {
			this.alimentazione = alimentazione;
		}
		public Boolean getWifi() {
			return wifi;
		}
		public void setWifi(Boolean wifi) {
			this.wifi = wifi;
		}
		public TipoSeduta getTipoSeduta() {
			return tipoSeduta;
		}
		public void setTipoSeduta(TipoSeduta tipoSeduta) {
			this.tipoSeduta = tipoSeduta;
		}
		public Boolean getCiboSpeciale() {
			return ciboSpeciale;
		}
		public void setCiboSpeciale(Boolean ciboSpeciale) {
			this.ciboSpeciale = ciboSpeciale;
		}
		public Double getPrezzo() {
			return prezzo;
		}
		public void setPrezzo(Double prezzo) {
			this.prezzo = prezzo;
		}
		public ClassePosto getClassePosto() {
			return classePosto;
		}
		public void setClassePosto(ClassePosto classePosto) {
			this.classePosto = classePosto;
		}
		public Boolean getLogicDelete() {
			return logicDelete;
		}
		public void setLogicDelete(Boolean logicDelete) {
			this.logicDelete = logicDelete;
		}
		public Date getUltimaModifica() {
			return ultimaModifica;
		}
		public void setUltimaModifica(Date ultimaModifica) {
			this.ultimaModifica = ultimaModifica;
		}
		public int getVoloId() {
			return voloId;
		}
		public void setVoloId(int voloId) {
			this.voloId = voloId;
		}
		public int getUtenteId() {
			return utenteId;
		}
		public void setUtenteId(int utenteId) {
			this.utenteId = utenteId;
		}
		@Override
		public String toString() {
			return "Posto [id=" + id + ", numeroPosto=" + numeroPosto + ", volo=" + volo + ", larghezzaPosto="
					+ larghezzaPosto + ", tipoVideo=" + tipoVideo + ", alimentazione=" + alimentazione + ", wifi="
					+ wifi + ", tipoSeduta=" + tipoSeduta + ", ciboSpeciale=" + ciboSpeciale + ", prezzo=" + prezzo
					+ ", classePosto=" + classePosto + ", logicDelete=" + logicDelete + ", ultimaModifica="
					+ ultimaModifica + ", voloId=" + voloId + ", utenteId=" + utenteId + "]";
		} 

	  
	}

