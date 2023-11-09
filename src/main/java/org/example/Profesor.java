package org.example;

public class Profesor extends Trabajador{

    private Integer horasTrabajadas;

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void trabajar(Integer horasNuevas){
        this.horasTrabajadas += horasNuevas;
    }

    public Profesor(String nombre) {
        super(nombre);
        this.horasTrabajadas = 0;
    }

    @Override
    public Integer restoDelCalculo() {
        return 100 * this.getHorasTrabajadas();
    }


}
