package Utilities.Converters;

import Models.Beans.Posto;
import Models.DTOs.PostoDTO;

public class PostoConverter {
	    public static PostoDTO toDTO(Posto posto) {
	        PostoDTO dto = new PostoDTO();
	        dto.setId(posto.getId());
	        dto.setNumeroPosto(posto.getNumeroPosto());
	        dto.setVolo(posto.getVolo());
	        dto.setLarghezzaPosto(posto.getLarghezzaPosto());
	        dto.setTipoVideo(posto.getTipoVideo());
	        dto.setAlimentazione(posto.getAlimentazione());
	        dto.setWifi(posto.getWifi());
	        dto.setTipoSeduta(posto.getTipoSeduta());
	        dto.setCiboSpeciale(posto.getCiboSpeciale());
	        dto.setPrezzo(posto.getPrezzo());
	        dto.setClassePosto(posto.getClassePosto());
	        dto.setLogicDelete(posto.getLogicDelete());
	        dto.setUltimaModifica(posto.getUltimaModifica());
	        dto.setVoloId(posto.getVoloId());
	        dto.setUtenteId(posto.getUtenteId());
	        return dto;
	    }
	    
	    public static Posto toEntity(PostoDTO dto) {
	        Posto posto = new Posto();
	        posto.setId(dto.getId());
	        posto.setNumeroPosto(dto.getNumeroPosto());
	        posto.setVolo(dto.getVolo());
	        posto.setLarghezzaPosto(dto.getLarghezzaPosto());
	        posto.setTipoVideo(dto.getTipoVideo());
	        posto.setAlimentazione(dto.getAlimentazione());
	        posto.setWifi(dto.getWifi());
	        posto.setTipoSeduta(dto.getTipoSeduta());
	        posto.setCiboSpeciale(dto.getCiboSpeciale());
	        posto.setPrezzo(dto.getPrezzo());
	        posto.setClassePosto(dto.getClassePosto());
	        posto.setLogicDelete(dto.getLogicDelete());
	        posto.setUltimaModifica(dto.getUltimaModifica());
	        posto.setVoloId(dto.getVoloId());
	        posto.setUtenteId(dto.getUtenteId());
	        return posto;
	    }
	}
