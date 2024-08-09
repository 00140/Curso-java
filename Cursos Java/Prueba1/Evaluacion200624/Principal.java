package Evaluacion200624;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {

        int contador = 1;
        String lector = "";
        Scanner scanner = new Scanner(System.in);
        String tipoEmpleadoStr = "";
        Boolean salir = true;


        Departamento departamento1 = new Departamento("Desarrollo");
        Departamento departamento2 = new Departamento("Ventas");
        Departamento departamento3 = new Departamento("RH");

        TipoDeEmpleado tipoDeEmpleado = new TipoDeEmpleado();

        List<Empleado> listaEmpleados = new ArrayList<>();
        //empleados.add(new Empleado(String nombre, String apellido, int noEmpleado, String tipoEmpleado, LocalDate fechaIngreso));
        listaEmpleados.add(
                new Empleado("Carlos", "Cruz", 1, tipoDeEmpleado.BASE(), LocalDate.of(2001, 5, 2), departamento1));
        listaEmpleados.add(
                new Empleado("kire", "Domin", 2, tipoDeEmpleado.BASE(), LocalDate.of(2002, 7, 24), departamento2));
        listaEmpleados.add(
                new Empleado("Sig", "Soria", 3, tipoDeEmpleado.EVENTUAL(), LocalDate.of(2022, 12, 4), departamento3));
        listaEmpleados.add(
                new Empleado("Gabo", "Bece", 4, tipoDeEmpleado.EVENTUAL(), LocalDate.of(2022, 12, 4), departamento3));
        listaEmpleados.add(
                new Empleado("Jes", "Nieto", 5, tipoDeEmpleado.EVENTUAL(), LocalDate.of(2022, 12, 4), departamento3));
        listaEmpleados.add(
                new Empleado("fer", "Gallardo", 6, tipoDeEmpleado.EVENTUAL(), LocalDate.of(2022, 12, 4), departamento3));

        System.out.println("Empleados registrados: ");
        for (Empleado empleado : listaEmpleados) {
            System.out.println(" Empleado #" + contador++ + ": \n");
            empleado.MostrarEmpleados();
        }
        System.out.println("\n*Bienvenido al menu de seleccion de filtro*");

        do {
            System.out.print("\n" +
                    "1. Por numero de empleado \n" +
                    "2. Por tipo de empleado \n" +
                    "3. Por la primera letra del nombre o apellido \n" +
                    "4. Por fecha de ingreso \n" +
                    "5. Terminar programa \n" +
                    "Seleccione un tipo de filtro: \n");
            lector = scanner.next();

            int lectorInt = Integer.parseInt(lector);

            switch (lectorInt) {
                case 1:
                    System.out.print("Escriba al numero de empleado a buscar:");
                    lectorInt = scanner.nextInt();
                    int finalLectorInt = lectorInt;
                    List<Empleado> filtrados = listaEmpleados.stream()
                            .filter(n -> n.noEmpleado == finalLectorInt)
                            .collect(Collectors.toList());
                    filtrados.forEach(Empleado::MostrarEmpleados);
                    break;
                case 2:
                    System.out.print("Seleccione al tipo de empleado a buscar:\n" +
                            "1. EVENTUAL\n" +
                            "2. BASE\n");
                    lectorInt = scanner.nextInt();
                    if (lectorInt == 1) {
                        tipoEmpleadoStr = "EVENTUAL";
                    } else if (lectorInt == 2) {
                        tipoEmpleadoStr = "BASE";
                    } else {
                        tipoEmpleadoStr = "";
                        System.out.println("Opcion no valida");
                    }
                    String finalTipoEmpleadoStr = tipoEmpleadoStr;
                    List<Empleado> filtrados2 = listaEmpleados.stream()
                            .filter(n -> n.tipoEmpleado.equals(finalTipoEmpleadoStr))
                            .collect(Collectors.toList());
                    filtrados2.forEach(Empleado::MostrarEmpleados);
                    break;

                case 3:
                    System.out.println("Elija una opcion \n" +
                            "1. Nombre \n" +
                            "2. Apellido \n");
                    lectorInt = scanner.nextInt();
                    System.out.print("Escriba la inicial del nombre a buscar:");
                    lector = scanner.next();
                    String finalLector = lector;
                    List<Empleado> filtrados4;
                    if (lectorInt == 1) {
                        filtrados4 = listaEmpleados.stream()
                                .filter(n -> Character.toLowerCase(n.nombre.charAt(0))
                                        == Character.toLowerCase(finalLector.charAt(0)))
                                .collect(Collectors.toList());
                    } else if (lectorInt == 2) {
                        filtrados4 = listaEmpleados.stream()
                                .filter(n -> Character.toLowerCase(n.apellido.charAt(0))
                                        == Character.toLowerCase(finalLector.charAt(0)))
                                .collect(Collectors.toList());
                    } else {
                        System.out.println("Valor no valido");
                        break;
                    }
                    filtrados4.forEach(Empleado::MostrarEmpleados);
                    break;
                case 4:
                    System.out.print("Elija el año de Ingreso a filtar: ");
                    lectorInt = scanner.nextInt();
                    LocalDate fechaFiltro = LocalDate.of(lectorInt, 1, 1);

                    List<Empleado> filtrados3 = listaEmpleados.stream()
                            .filter(n -> n.fechaIngreso.getYear() == fechaFiltro.getYear())
                            .collect(Collectors.toList());
                    filtrados3.forEach(Empleado::MostrarEmpleados);

                    break;
                case 5:
                    salir = false;
                    break;
            }

        } while (salir);

        // listaEmpleados.forEach(Empleado::MostrarEmpleados);


    }

    //private static int filtro(String lector, List<Empleado> listaEmpleados, Empleado atributo) {
    //}



}
