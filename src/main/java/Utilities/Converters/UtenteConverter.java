package Utilities.Converters;

import Models.Beans.Utente;
import Models.DTOs.UtenteDTO;

public class UtenteConverter {
    public static UtenteDTO toDTO(Utente utente) {
        UtenteDTO dto = new UtenteDTO();
        dto.setId(utente.getId());
        dto.setNome(utente.getNome());
        dto.setCognome(utente.getCognome());
        dto.setEmail(utente.getEmail());
        dto.setPassword(utente.getPassword());
        dto.setCodiceFiscale(utente.getCodiceFiscale());
        dto.setDataNascita(utente.getDataNascita());
        dto.setDataIscrizione(utente.getDataIscrizione());
        dto.setUltimaModifica(utente.getUltimaModifica());
        dto.setFlagDelete(utente.getFlagDelete());
        dto.setRuolo(utente.getRuolo());
        return dto;
    }
    
    public static Utente toBean(UtenteDTO dto) {
        Utente utente = new Utente();
        utente.setId(dto.getId());
        utente.setNome(dto.getNome());
        utente.setCognome(dto.getCognome());
        utente.setEmail(dto.getEmail());
        utente.setPassword(dto.getPassword());
        utente.setCodiceFiscale(dto.getCodiceFiscale());
        utente.setDataNascita(dto.getDataNascita());
        utente.setDataIscrizione(dto.getDataIscrizione());
        utente.setUltimaModifica(dto.getUltimaModifica());
        utente.setFlagDelete(dto.getFlagDelete());
        utente.setRuolo(dto.getRuolo());
        
        return utente;
    }
}






