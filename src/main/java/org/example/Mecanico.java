package org.example;

public class Mecanico extends Trabajador{

    private Integer vehiculosReparados;

    public Mecanico(String nombre) {
        super(nombre);
        this.vehiculosReparados = 0;
    }

    @Override
    public Integer calcularSueldo() {
        return this.getMontofijo() + 500 * this.getVehiculosReparados();
    }

    public Integer getVehiculosReparados() {
        return vehiculosReparados;
    }

    public void repararVehículo(){
        this.vehiculosReparados++;
    }

}
