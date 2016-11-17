package com.zecovery.android.dev.localidad.app;

/**
 * Created by moe on 17-11-16.
 */

public class Localidad{

    private int id;
    private String nombre;

    public Localidad() {
    }

    public Localidad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
