package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.IInfusion;

public class ChocolateExtra extends IngredienteDecorator {

    public ChocolateExtra(IInfusion infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 0.75;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Chocolate extra";    }

}
