package com.zecovery.android.dev.localidad.app;

/**
 * Created by moe on 17-11-16.
 */

public class Provincia extends Localidad{

    private int idRegion;

    public Provincia(int id) {
    }

    public Provincia(int id, String nombre, int idRegion) {
        super(id, nombre);
        this.idRegion = idRegion;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public int getIdRegion() {
        return idRegion;
    }
}
