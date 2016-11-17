package com.zecovery.android.dev.localidad.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by moe on 17-11-16.
 */

public class LocalidadDbHelper extends SQLiteOpenHelper {

    public LocalidadDbHelper(Context context) {
        super(context, LocalidadContract.DbConstants.DATABASE_NAME, null, LocalidadContract.DbConstants.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(LocalidadContract.SQL_CREATE_TABLE_COMUNA);
        db.execSQL(LocalidadContract.SQL_INSERT_COMUNA);

        db.execSQL(LocalidadContract.SQL_CREATE_TABLE_PROVINCIA);
        db.execSQL(LocalidadContract.SQL_INSERT_PROVINCIA);

        db.execSQL(LocalidadContract.SQL_CREATE_TABLE_REGION);
        db.execSQL(LocalidadContract.SQL_INSERT_REGION);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(LocalidadContract.SQL_DROP_TABLE_COMUNA);
        db.execSQL(LocalidadContract.SQL_DROP_TABLE_PROVINCIA);
        db.execSQL(LocalidadContract.SQL_DROP_TABLE_REGION);
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    public List<String> getAllComunas(){
        List<String> comunas = new ArrayList<>();

        String query = LocalidadContract.DbConstants.SELECT_ALL_FROM + LocalidadContract.DbConstants.TABLE_NAME_COMUNA;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do {
                String nombreComuna = cursor.getString(1);
                comunas.add(nombreComuna);
            }while (cursor.moveToNext());
        }
        return comunas;
    }

    public List<String> getAllProvincias(){
        List<String> provincias = new ArrayList<>();

        String query = LocalidadContract.DbConstants.SELECT_ALL_FROM + LocalidadContract.DbConstants.TABLE_NAME_PROVINCIA;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do {
                String nombreProvincia = cursor.getString(1);
                provincias.add(nombreProvincia);
            }while (cursor.moveToNext());
        }
        return provincias;
    }

    public List<String> getAllRegiones(){
        List<String> regiones = new ArrayList<>();

        String query = LocalidadContract.DbConstants.SELECT_ALL_FROM + LocalidadContract.DbConstants.TABLE_NAME_REGION;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do {
                String nombreRegion = cursor.getString(1);
                regiones.add(nombreRegion);
            }while (cursor.moveToNext());
        }
        return regiones;
    }

    public void getProvincia(int idProvincia){

        String query = LocalidadContract.DbConstants.SELECT_ALL_FROM + LocalidadContract.DbConstants.TABLE_NAME_PROVINCIA + " WHERE prov_id=" + idProvincia+ ";";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do {
                String nombreRegion = cursor.getString(1);
                regiones.add(nombreRegion);
            }while (cursor.moveToNext());
        }
        return regiones;

    }

}
