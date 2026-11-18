package persistencia;


public class ConexaoPostgreSQL {
    private String host;
    private String port;
    private String dbname;
    private String username;
    private String database;

    private static ConexaoPostgreSQL instance;

    private ConexaoPostgreSQL() {
        /* Inicialize Class */
    }

    public static ConexaoPostgreSQL getInstance() {
        if (instance == null) {
            instance = new ConexaoPostgreSQL();
        }
        return instance;
    }

}
