package restaurante_ppp2026_2sem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * JantaIterator
 */
public class JantaIterator implements Iterator<Object> {
    private Map<Integer, String> map;
    private Iterator<Entry<Integer,String>> iterator;
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASS = "postgres";
     

    public JantaIterator() {
        map = new HashMap<Integer, String>();
        String sql = "SELECT * FROM janta ORDER BY id ASC;";
        Connection conn;
        try {
            conn = this.getConexao();
            conn.setAutoCommit(false);
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setFetchSize(100);
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String refeicao = rs.getString("refeicao");
                        map.put(id, refeicao);
                    }
                }
            }
            conn.close();
            iterator = this.map.entrySet().iterator();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next();
    }

    private Connection getConexao() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

}
