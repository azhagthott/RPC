package com.zecovery.android.dev.localidad.app;

/**
 * Created by moe on 17-11-16.
 */

public class Region extends Localidad{

    private String numeroRomano;

    public Region(int id, String nombre, String numeroRomano) {
        super(id, nombre);
        this.numeroRomano = numeroRomano;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public String getNumeroRomano() {
        return numeroRomano;
    }
}
