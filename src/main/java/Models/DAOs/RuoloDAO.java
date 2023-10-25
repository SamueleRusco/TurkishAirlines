package Models.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.Beans.Ruolo;
import Models.Enums.RuoloEnum;
import Utilities.DbConnection;

public class RuoloDAO {
    private static final String FIND_BY_ID = "SELECT * FROM ruoli WHERE id = ?";
    private static final String FIND_ALL = "SELECT * FROM ruoli";
    private static final String SAVE = "INSERT INTO ruoli (ruolo) VALUES (?)";
    private static final String UPDATE = "UPDATE ruoli SET ruolo = ? WHERE id = ?";
    private static final String DELETE = "DELETE FROM ruoli WHERE id = ?";

    public Ruolo findById(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Ruolo ruolo = null;

        try {
            conn = DbConnection.shared.connect();
            ps = conn.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                ruolo = new Ruolo();
                ruolo.setId(rs.getInt("id"));
                ruolo.setRuolo(RuoloEnum.valueOf(rs.getString("ruolo")));
            }
        } finally {
			DbConnection.shared.disconnect();
        }

        return ruolo;
    }

    public List<Ruolo> findAll() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Ruolo> ruoli = new ArrayList<>();

        try {
            conn = DbConnection.shared.connect();
            ps = conn.prepareStatement(FIND_ALL);
            rs = ps.executeQuery();

            while (rs.next()) {
                Ruolo ruolo = new Ruolo();
                ruolo.setId(rs.getInt("id"));
                ruolo.setRuolo(RuoloEnum.valueOf(rs.getString("ruolo")));
                ruoli.add(ruolo);
            }
        } finally {
        	DbConnection.shared.disconnect();
        }

        return ruoli;
    }

    public void save(Ruolo ruolo) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = DbConnection.shared.connect();
            ps = conn.prepareStatement(SAVE);
            ps.setString(1, ruolo.getRuolo().name());
            ps.executeUpdate();
        } finally {
        	DbConnection.shared.disconnect();
        }
    }

    public void update(Ruolo ruolo) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = DbConnection.shared.connect();
            ps = conn.prepareStatement(UPDATE);
            ps.setString(1, ruolo.getRuolo().name());
            ps.setInt(2, ruolo.getId());
            ps.executeUpdate();
        } finally {
        	DbConnection.shared.disconnect();
        }
    }

    public void delete(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = DbConnection.shared.connect();
            ps = conn.prepareStatement(DELETE);
            ps.setInt(1, id);
            ps.executeUpdate();
        } finally {
        	DbConnection.shared.disconnect();
        }
    }
}