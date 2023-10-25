package Models.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.Beans.Posto;
import Models.Enums.Alimentazione;
import Models.Enums.ClassePosto;
import Models.Enums.TipoSeduta;
import Models.Enums.TipoVideo;
import Utilities.DbConnection;

public class PostoDAO {
	private static final String FIND_BY_ID = "SELECT * FROM posti WHERE id = ?";
	private static final String FIND_ALL = "SELECT * FROM posti";
	private static final String SAVE = "INSERT INTO posti (numero_posto, volo, larghezza_posto, tipo_video, alimentazione, wifi, tipo_seduta, cibo_speciale, prezzo, classe, logic_delete, ultima_modifica, volo_id, utente_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String UPDATE = "UPDATE posti SET numero_posto = ?, volo = ?, larghezza_posto = ?, tipo_video = ?, alimentazione = ?, wifi = ?, tipo_seduta = ?, cibo_speciale = ?, prezzo = ?, classe = ?, logic_delete = ?, ultima_modifica = ?, volo_id = ?, utente_id = ? WHERE id = ?";
	private static final String DELETE = "DELETE FROM posto WHERE id = ?";

	public Posto findById(int id) throws SQLException {
		Posto posto = null;

		try {
			Connection conn = DbConnection.shared.connect();
			PreparedStatement ps = conn.prepareStatement(FIND_BY_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				posto = new Posto();
				posto.setId(rs.getInt("id"));
				posto.setNumeroPosto(rs.getInt("numero_posto"));
				posto.setVolo(rs.getString("volo"));
				posto.setLarghezzaPosto(rs.getDouble("larghezza_posto"));
				posto.setTipoVideo(TipoVideo.valueOf(rs.getString("tipo_video")));
				posto.setAlimentazione(Alimentazione.valueOf(rs.getString("alimentazione")));
				posto.setWifi(rs.getBoolean("wifi"));
				posto.setTipoSeduta(TipoSeduta.valueOf(rs.getString("tipo_seduta")));
				posto.setCiboSpeciale(rs.getBoolean("cibo_speciale"));
				posto.setPrezzo(rs.getDouble("prezzo"));
				posto.setClassePosto(ClassePosto.valueOf(rs.getString("classe")));
				posto.setLogicDelete(rs.getBoolean("logic_delete"));
				posto.setUltimaModifica(rs.getDate("ultima_modifica"));
				posto.setVoloId(rs.getInt("volo_id"));
				posto.setUtenteId(rs.getInt("utente_id"));

			}
		} finally {
			DbConnection.shared.disconnect();
		}

		return posto;
	}

	public List<Posto> findAll() throws SQLException {

		List<Posto> posti = new ArrayList<>();

		try {
			Connection conn = DbConnection.shared.connect();
			PreparedStatement ps = conn.prepareStatement(FIND_ALL);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Posto posto = new Posto();
				posto.setId(rs.getInt("id"));
				posto.setNumeroPosto(rs.getInt("numero_posto"));
				posto.setVolo(rs.getString("volo"));
				posto.setLarghezzaPosto(rs.getDouble("larghezza_posto"));
				posto.setTipoVideo(TipoVideo.valueOf(rs.getString("tipo_video")));
				posto.setAlimentazione(Alimentazione.valueOf(rs.getString("alimentazione")));
				posto.setWifi(rs.getBoolean("wifi"));
				posto.setTipoSeduta(TipoSeduta.valueOf(rs.getString("tipo_seduta")));
				posto.setCiboSpeciale(rs.getBoolean("cibo_speciale"));
				posto.setPrezzo(rs.getDouble("prezzo"));
				posto.setClassePosto(ClassePosto.valueOf(rs.getString("classe")));
				posto.setLogicDelete(rs.getBoolean("logic_delete"));
				posto.setUltimaModifica(rs.getDate("ultima_modifica"));
				posto.setVoloId(rs.getInt("volo_id"));
				posto.setUtenteId(rs.getInt("utente_id"));
				posti.add(posto);
			}
		} finally {
			DbConnection.shared.disconnect();
		}

		return posti;
	}

	public void save(Posto posto) throws SQLException {

		try {
			Connection conn = DbConnection.shared.connect();
			PreparedStatement ps = conn.prepareStatement(SAVE);
			ps.setInt(1, posto.getNumeroPosto());
			ps.setString(2, posto.getVolo());
			ps.setDouble(3, posto.getLarghezzaPosto());
			ps.setString(4, posto.getTipoVideo().name());
			ps.setString(5, posto.getAlimentazione().name());
			ps.setBoolean(6, posto.getWifi());
			ps.setString(7, posto.getTipoSeduta().name());
			ps.setBoolean(8, posto.getCiboSpeciale());
			ps.setDouble(9, posto.getPrezzo());
			ps.setString(10, posto.getClassePosto().name());
			ps.setBoolean(11, posto.getLogicDelete());
			ps.setDate(12, posto.getUltimaModifica());
			ps.setInt(13, posto.getVoloId());
			ps.setInt(14, posto.getUtenteId());
			ps.executeUpdate();
		} finally {
			DbConnection.shared.disconnect();
		}
	}

	public void update(Posto posto) throws SQLException {

		try {
			Connection conn = DbConnection.shared.connect();
			PreparedStatement ps = conn.prepareStatement(UPDATE);
			ps.setInt(1, posto.getNumeroPosto());
			ps.setString(2, posto.getVolo());
			ps.setDouble(3, posto.getLarghezzaPosto());
			ps.setString(4, posto.getTipoVideo().name());
			ps.setString(5, posto.getAlimentazione().name());
			ps.setBoolean(6, posto.getWifi());
			ps.setString(7, posto.getTipoSeduta().name());
			ps.setBoolean(8, posto.getCiboSpeciale());
			ps.setDouble(9, posto.getPrezzo());
			ps.setString(10, posto.getClassePosto().name());
			ps.setBoolean(11, posto.getLogicDelete());
			ps.setDate(12, posto.getUltimaModifica());
			ps.setInt(13, posto.getVoloId());
			ps.setInt(14, posto.getUtenteId());
			ps.setInt(15, posto.getId());
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
