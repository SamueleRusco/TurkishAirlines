package Utilities.Converters;

import Models.Beans.Volo;
import Models.DTOs.VoloDTO;

public class VoloConverter {
    public static VoloDTO toDTO(Volo volo) {
        VoloDTO dto = new VoloDTO();
        dto.setId(volo.getId());
        dto.setNome(volo.getNome());
        dto.setPostiEconomy(volo.getPostiEconomy());
        dto.setPostiBusiness(volo.getPostiBusiness());
        dto.setPostiPrimaClasse(volo.getPostiPrimaClasse());
        dto.setPostiTotale(volo.getPostiTotale());
        dto.setApprovazione(volo.isApprovazione());
        dto.setDataPartenza(volo.getDataPartenza());
        dto.setDataArrivo(volo.getDataArrivo());
        dto.setCittaPartenza(volo.getCittaPartenza());
        dto.setCittaArrivo(volo.getCittaArrivo());
        dto.setLogicDelete(volo.isLogicDelete());
        dto.setUltimaModifica(volo.getUltimaModifica());
        return dto;
    }

    public static Volo toBean(VoloDTO dto) {
        Volo volo = new Volo();
        volo.setId(dto.getId());
        volo.setNome(dto.getNome());
        volo.setPostiEconomy(dto.getPostiEconomy());
        volo.setPostiBusiness(dto.getPostiBusiness());
        volo.setPostiPrimaClasse(dto.getPostiPrimaClasse());
        volo.setPostiTotale(dto.getPostiTotale());
        volo.setApprovazione(dto.isApprovazione());
        volo.setDataPartenza(dto.getDataPartenza());
        volo.setDataArrivo(dto.getDataArrivo());
        volo.setCittaPartenza(dto.getCittaPartenza());
        volo.setCittaArrivo(dto.getCittaArrivo());
        volo.setLogicDelete(dto.isLogicDelete());
        volo.setUltimaModifica(dto.getUltimaModifica());
        return volo;
    }
}
