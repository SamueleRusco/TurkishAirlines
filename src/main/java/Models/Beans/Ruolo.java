package Models.Beans;

import java.util.Date;

import Models.Enums.RuoloEnum;

public class Ruolo {
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
		return "Ruolo [id=" + id + ", ruolo=" + ruolo + "]";
	}

    // Getter e setter per ciascun campo

    // Costruttori
}
