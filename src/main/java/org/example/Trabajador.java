package org.example;

public abstract class Trabajador {
    private String nombre;
    private Integer montofijo;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getMontofijo() {
        return montofijo;
    }

    public void setMontofijo(Integer montofijo) {
        this.montofijo = montofijo;
    }

    public Trabajador(String nombre) {
        this.nombre = nombre;
        this.montofijo = 2000;
    }

    public abstract Integer calcularSueldo();


}
