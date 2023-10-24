package Models.DTOs;

import Models.Enums.RuoloEnum;

public class RuoloDTO {
	 private int id;
	    private RuoloEnum ruolo;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public RuoloEnum getRuolo() {
			return ruolo;
		}
		public void setRuolo(RuoloEnum ruolo) {
			this.ruolo = ruolo;
		}
		@Override
		public String toString() {
			return "RuoloDTO [id=" + id + ", ruolo=" + ruolo + "]";
		}
	    
}
