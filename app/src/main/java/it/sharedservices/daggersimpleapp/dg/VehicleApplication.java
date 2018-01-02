package it.sharedservices.daggersimpleapp.dg;

import android.app.Application;

public class VehicleApplication extends Application {
    private VehicleComponent vehicleComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        vehicleComponent = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
    }

    public VehicleComponent component() {
        return vehicleComponent;
    }
}
