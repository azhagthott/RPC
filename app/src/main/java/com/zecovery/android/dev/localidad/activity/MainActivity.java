package com.zecovery.android.dev.localidad.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.zecovery.android.dev.localidad.R;
import com.zecovery.android.dev.localidad.app.Comuna;
import com.zecovery.android.dev.localidad.app.Provincia;
import com.zecovery.android.dev.localidad.app.Region;
import com.zecovery.android.dev.localidad.db.LocalidadContract;
import com.zecovery.android.dev.localidad.db.LocalidadDbHelper;

import java.util.List;

public class MainActivity extends AppCompatActivity{

    public static final String LOG_TAG = "LOG:::";

    private Spinner spinnerComuna;
    private Spinner spinnerProvincia;
    private Spinner spinnerRegion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spinnerComuna= (Spinner) findViewById(R.id.spinnerComuna);
        spinnerProvincia= (Spinner) findViewById(R.id.spinnerProvincia);
        spinnerRegion= (Spinner) findViewById(R.id.spinnerRegion);

        loadData("todo");

    }

    private void loadData(String localidad){

        LocalidadDbHelper helper = new LocalidadDbHelper(this);

        if (localidad.equals("regiones")) {
            List<String> regiones = helper.getAllRegiones();
            ArrayAdapter<String> regionArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, regiones);
            spinnerRegion.setAdapter(regionArrayAdapter);
        }

        if (localidad.equals("provincias")) {
            List<String> provincias = helper.getAllProvincias();
            ArrayAdapter<String> provinciaArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, provincias);
            spinnerProvincia.setAdapter(provinciaArrayAdapter);
        }

        if (localidad.equals("comunas")) {
            List<String> comunas = helper.getAllComunas();
            ArrayAdapter<String> comunaArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, comunas);
            spinnerComuna.setAdapter(comunaArrayAdapter);
        }

        if (localidad.equals("todo")) {

            List<String> regiones = helper.getAllRegiones();
            ArrayAdapter<String> regionArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, regiones);
            spinnerRegion.setAdapter(regionArrayAdapter);

            List<String> provincias = helper.getAllProvincias();
            ArrayAdapter<String> provinciaArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, provincias);
            spinnerProvincia.setAdapter(provinciaArrayAdapter);

            List<String> comunas = helper.getAllComunas();
            ArrayAdapter<String> comunaArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, comunas);
            spinnerComuna.setAdapter(comunaArrayAdapter);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
