import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=gestor;encrypt=false;trustServerCertificate=true";
    private static final String USER = "userviernes";
    private static final String PASSWORD = "123";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void registrarGasto(Gasto gasto) {
        String sql = "INSERT INTO gastos (fecha, monto, descripcion, categoria_id, usuario_id) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, gasto.getFecha());
            pstmt.setDouble(2, gasto.getMonto());
            pstmt.setString(3, gasto.getDescripcion());
            pstmt.setInt(4, gasto.getCategoriaId());
            pstmt.setInt(5, gasto.getUsuarioId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nombre, email, contraseña) VALUES (?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, usuario.getNombre());
            pstmt.setString(2, usuario.getEmail());
            pstmt.setString(3, usuario.getContraseña());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}