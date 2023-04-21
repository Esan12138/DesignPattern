package DesignPattern.builder.vehicle.practice1;

import DesignPattern.builder.vehicle.Vehicle;

public abstract class VehicleBuilder {
    Vehicle vehicle = new Vehicle();

    abstract void buildTyre();

    abstract void buildEnine();

    abstract void buildSteering();

    public Vehicle getResult() {
        return vehicle;
    }
}
