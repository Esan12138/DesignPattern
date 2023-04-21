package DesignPattern.builder.vehicle.practice1;

import DesignPattern.builder.vehicle.Vehicle;

public interface Factory {
    public DesignPattern.builder.vehicle.Vehicle vehicle= new DesignPattern.builder.vehicle.Vehicle();
    DesignPattern.builder.vehicle.Vehicle createVehicle();

    public DesignPattern.builder.vehicle.Vehicle buildTyre(String type);
    public DesignPattern.builder.vehicle.Vehicle buildEngine(String engine);
    public Vehicle buildSteering(String steering);
}
