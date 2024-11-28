public class Gasto {
    private String fecha;
    private double monto;
    private String descripcion;
    private int categoriaId;
    private int usuarioId;

    // Constructor sin parámetros
    public Gasto() {}

    // Constructor con parámetros
    public Gasto(String fecha, double monto, String descripcion, int categoriaId, int usuarioId) {
        this.fecha = fecha;
        this.monto = monto;
        this.descripcion = descripcion;
        this.categoriaId = categoriaId;
        this.usuarioId = usuarioId;
    }

    // Getters y Setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
}