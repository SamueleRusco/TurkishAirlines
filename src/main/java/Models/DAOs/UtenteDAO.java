package Models.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import Models.Beans.Utente;
import Utilities.DbConnection;

public class UtenteDAO {
    private static final String FIND_BY_ID = "SELECT * FROM utenti WHERE id = ?";
    private static final String FIND_ALL = "SELECT * FROM utenti";
    private static final String SAVE = "INSERT INTO utenti (nome, cognome, email, password, codiceFiscale, data_nascita, data_iscrizione, ultima_modifica, flag_delete, ruolo_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE utenti SET nome = ?, cognome = ?, email = ?, password = ?, codiceFiscale = ?, data_nascita = ?, data_iscrizione = ?, ultima_modifica = ?, flag_delete = ?, ruolo_id = ? WHERE id = ?";
    private static final String DELETE = "DELETE FROM utenti WHERE id = ?";
    
    
  
    public Utente findById(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Utente utente = null;

        try {
            conn = DbConnection.shared.connect();
            ps = conn.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
            	RuoloDAO ruolo = new RuoloDAO();
                utente = new Utente();
                utente.setId(rs.getInt("id"));
                utente.setNome(rs.getString("nome"));
                utente.setCognome(rs.getString("cognome"));
                utente.setEmail(rs.getString("email"));
                utente.setPassword(rs.getString("password"));
                utente.setCodiceFiscale(rs.getString("codiceFiscale"));
                utente.setDataNascita(rs.getDate("data_nascita"));
                utente.setDataIscrizione(rs.getDate("data_iscrizione"));
                utente.setUltimaModifica(rs.getDate("ultima_modifica"));
                utente.setFlagDelete(rs.getBoolean("flag_delete"));               
                utente.setRuolo(ruolo.findById(rs.getInt("ruolo_id"))); 
            }
        } finally {
           
        }

        return utente;
    }

    public List<Utente> findAll() throws SQLException {
        
        List<Utente> utenti = new ArrayList<>();

        try {
        	Connection conn = DbConnection.shared.connect();
        	PreparedStatement  ps = conn.prepareStatement(FIND_ALL);
        	ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Utente utente = new Utente();
                utente.setId(rs.getInt("id"));
                utente.setNome(rs.getString("nome"));
                utente.setCognome(rs.getString("cognome"));
                utente.setEmail(rs.getString("email"));
                utente.setPassword(rs.getString("password"));
                utente.setCodiceFiscale(rs.getString("codiceFiscale"));
                utente.setDataNascita(rs.getDate("data_nascita"));
                utente.setDataIscrizione(rs.getDate("data_iscrizione"));
                utente.setUltimaModifica(rs.getDate("ultima_modifica"));
                utente.setFlagDelete(rs.getBoolean("flag_delete"));
                RuoloDAO ruolo = new RuoloDAO();
                utente = new Utente();
                utente.setRuolo(ruolo.findById(rs.getInt("ruolo_id")));
                utenti.add(utente);
            }
        } finally {
        	DbConnection.shared.disconnect();
        }

        return utenti;
    }

    public void save(Utente utente) throws SQLException {
       

        try {
        	Connection  conn = DbConnection.shared.connect();
        	PreparedStatement  ps = conn.prepareStatement(SAVE);
            ps.setString(1, utente.getNome());
            ps.setString(2, utente.getCognome());
            ps.setString(3, utente.getEmail());
            ps.setString(4, utente.getPassword());
            ps.setString(5, utente.getCodiceFiscale());
            ps.setDate(6, utente.getDataNascita());
            ps.setDate(7,utente.getDataIscrizione());
            ps.setDate(8,utente.getUltimaModifica());
            ps.setBoolean(9, utente.getFlagDelete());
            ps.setInt(10, utente.getRuolo().getId());
            ps.executeUpdate();
        } finally {
        	DbConnection.shared.disconnect();
        }
    }

    public void update(Utente utente) throws SQLException {
        

        try {
        	 Connection conn = DbConnection.shared.connect();
        	 PreparedStatement ps = conn.prepareStatement(UPDATE);
            ps.setString(1, utente.getNome());
            ps.setString(2, utente.getCognome());
            ps.setString(3, utente.getEmail());
            ps.setString(4, utente.getPassword());
            ps.setString(5, utente.getCodiceFiscale());
            ps.setDate(6, utente.getDataNascita());
            ps.setDate(7, utente.getDataIscrizione());
            ps.setDate(8,utente.getUltimaModifica());
            ps.setBoolean(9, utente.getFlagDelete());
            ps.setInt(10, utente.getRuolo().getId());
            ps.setInt(11, utente.getId());
            ps.executeUpdate();
        } finally {
        	DbConnection.shared.disconnect();
        }
        
    }
    public void delete(int id) throws SQLException {
      

        try {
        	Connection conn = DbConnection.shared.connect();
        	PreparedStatement ps = conn.prepareStatement(DELETE);
            ps.setInt(1, id);
            ps.executeUpdate();
        } finally {
            DbConnection.shared.disconnect();
        }
    }
    
    
    
}