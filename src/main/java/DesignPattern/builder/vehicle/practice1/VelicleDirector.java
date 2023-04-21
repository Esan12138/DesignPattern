package DesignPattern.builder.vehicle.practice1;

import DesignPattern.builder.vehicle.Vehicle;

/**
 * @Description:
 * @Date:2023-04-07-9:19
 * @author:Esan
 */
public class VelicleDirector {
    private VehicleBuilder Builder;

    public VelicleDirector(VehicleBuilder vehicleBuilder) {
        this.Builder = vehicleBuilder;
    }

    public Vehicle construct() {
        Builder.buildEnine();
        Builder.buildSteering();
        Builder.buildTyre();
        return Builder.getResult();
    }

}
