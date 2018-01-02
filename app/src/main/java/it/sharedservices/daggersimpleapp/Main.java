package it.sharedservices.daggersimpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import it.sharedservices.daggersimpleapp.dg.VehicleApplication;

public class Main extends AppCompatActivity {
    @Inject
    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ((VehicleApplication) getApplication()).component().inject(this);
        Toast.makeText(getApplicationContext(), vehicle.name(), Toast.LENGTH_LONG).show();
    }
}
