package it.sharedservices.daggersimpleapp.dg;

import dagger.Module;
import dagger.Provides;
import it.sharedservices.daggersimpleapp.Vehicle;

@Module
public class VehicleModule {

    @Provides
    public Vehicle vehicleCitroen() {
        return new Vehicle("Citroen");
    }
}
