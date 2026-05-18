package ar.edu.unahur.obj2.decorator.infusiones;

public class ChocolateCaliente implements IInfusion {

    @Override
    public String getNombre() {
        return "Chocolate Caliente";
    }

    @Override
    public Double getCosto() {
        return 4.0;
    }

}
