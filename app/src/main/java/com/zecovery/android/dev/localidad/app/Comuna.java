package com.zecovery.android.dev.localidad.app;

/**
 * Created by moe on 17-11-16.
 */

public class Comuna extends Localidad{

    private int idProvincia;
    private int idRegion;

   public Comuna (int id){
       this.idProvincia = id;
    }

    public Comuna(int id, String nombre, int idProvincia, int idRegion) {
        super(id, nombre);
        this.idProvincia = idProvincia;
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

    public int getIdProvincia() {
        return idProvincia;
    }

    public int getIdRegion() {
        return idRegion;
    }
}
