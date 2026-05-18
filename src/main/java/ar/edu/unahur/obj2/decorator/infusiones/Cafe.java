package ar.edu.unahur.obj2.decorator.infusiones;

public class Cafe implements IInfusion{

    @Override
    public String getNombre() {
        return "Café";
    }

    @Override
    public Double getCosto() {
        return 3.0;
    }

}
