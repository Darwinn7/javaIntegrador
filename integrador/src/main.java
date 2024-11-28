public class main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();

        // Registrar un nuevo usuario
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan Pérez");
        usuario.setEmail("juan.perez@example.com");
        usuario.setContraseña("password123");
        dbManager.registrarUsuario(usuario);

        // Registrar un nuevo gasto
        Gasto gasto = new Gasto();
        gasto.setFecha("2024-11-27");
        gasto.setMonto(150.75);
        gasto.setDescripcion("Compra de supermercado");
        gasto.setCategoriaId(1); // Asume que la categoría 1 ya existe
        gasto.setUsuarioId(1); // Asume que el usuario 1 ya existe
        dbManager.registrarGasto(gasto);

}
}