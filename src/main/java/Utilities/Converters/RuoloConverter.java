package Utilities.Converters;

import Models.Beans.Ruolo;
import Models.DTOs.RuoloDTO;

public class RuoloConverter {
	public static RuoloDTO toDTO(Ruolo ruolo) {
		RuoloDTO dto = new RuoloDTO();
		dto.setId(ruolo.getId());
		dto.setRuolo(ruolo.getRuolo());
		return dto;
	}

	public static Ruolo toEntity(RuoloDTO dto) {
		Ruolo ruolo = new Ruolo();
		ruolo.setId(dto.getId());
		ruolo.setRuolo(dto.getRuolo());
		return ruolo;
	}
}
