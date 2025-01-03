public class Empleado {
    String nombre;
    String departamento;
    String mansaje;

    public Empleado(String nombre, String departamento,String mensaje){
        this.nombre = nombre;
        this.departamento = departamento;
        this.mansaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMansaje() {
        return mansaje;
    }

    public void setMansaje(String mansaje) {
        this.mansaje = mansaje;
    }
}
