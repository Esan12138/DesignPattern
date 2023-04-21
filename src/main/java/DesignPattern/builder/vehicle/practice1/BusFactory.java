package DesignPattern.builder.vehicle.practice1;


import DesignPattern.builder.vehicle.Factory;
import DesignPattern.builder.vehicle.Vehicle;

public class BusFactory implements Factory {


    @Override
    public Vehicle getVehicle(String type) {
        if ("bus".equalsIgnoreCase(type)){
           Vehicle bus = new VelicleDirector(new BusBuilder()).construct();
            return bus;

        }
        return null;
    }
}
