public class DatabaseManager {
    private Conexion conexion = new Conexion();

    public void registrarUsuario(Usuario usuario) {
        conexion.registrarUsuario(usuario);
    }

    public void registrarGasto(Gasto gasto) {
        conexion.registrarGasto(gasto);
    }
}