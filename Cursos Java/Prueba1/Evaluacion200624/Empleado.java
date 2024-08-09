package Evaluacion200624;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Empleado {
    String nombre;
    String apellido;
    int noEmpleado;
    String tipoEmpleado;
    LocalDate fechaIngreso;

    Departamento departamento;


    public Empleado(String nombre, String apellido, int noEmpleado, String tipoEmpleado, LocalDate fechaIngreso, Departamento departamento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.noEmpleado = noEmpleado;
        this.tipoEmpleado = tipoEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.departamento = departamento;

    }

 public void  MostrarEmpleados(){
     System.out.println("Nombre: " + this.nombre + "\n" +
                        "Apellido: " + this.apellido + "\n" +
                        "Numero de Empleado: " + this.noEmpleado + "\n" +
                        "Tipo Empleado: " + this.tipoEmpleado + "\n" +
                        "Fecha de Ingreso: " + this.fechaIngreso + "\n" +
                        "Departamento: " + this.departamento.nomdepartamento + "\n");
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNoEmpleado() {
        return noEmpleado;
    }

    public void setNoEmpleado(int noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
