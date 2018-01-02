package it.sharedservices.daggersimpleapp.dg;

import dagger.Component;
import it.sharedservices.daggersimpleapp.Main;

@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    void inject(Main pActivity);
}
