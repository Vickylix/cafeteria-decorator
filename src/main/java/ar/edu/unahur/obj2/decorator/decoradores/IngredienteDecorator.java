package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.excepciones.InfusionNulaException;
import ar.edu.unahur.obj2.decorator.infusiones.IInfusion;

public abstract class IngredienteDecorator implements IInfusion {
    private final IInfusion infusion;

    protected IngredienteDecorator(IInfusion infusion) {
        if(infusion==null) throw new InfusionNulaException();
        this.infusion = infusion;
    }

    @Override
    public Double getCosto() {
        return infusion.getCosto() + getCostoExtra();
    }

    protected abstract Double getCostoExtra();

    @Override
    public String getNombre() {
        return infusion.getNombre() + " con " + getNombreIngrediente();
    }

    protected abstract String getNombreIngrediente();

    
}
