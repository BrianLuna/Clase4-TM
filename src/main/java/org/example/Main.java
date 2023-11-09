package org.example;

public class Main {
    public static void main(String[] args) {
        Mecanico mecanico = new Mecanico("Juan");
        Profesor profesor = new Profesor("Franco");

        mecanico.repararVehículo();
        mecanico.repararVehículo();
        mecanico.repararVehículo();
        mecanico.repararVehículo();

        profesor.trabajar(5);
        profesor.trabajar(4);
        profesor.trabajar(3);
        profesor.trabajar(7);
        profesor.trabajar(8);

        System.out.println("El profesor hizo: $" + profesor.calcularSueldo());
        System.out.println("El mecánico hizo: $" + mecanico.calcularSueldo());

    }
}