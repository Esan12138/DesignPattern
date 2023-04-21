package DesignPattern.builder.vehicle.practice1;

/**
 * @Description:
 * @Date:2023-04-07-8:56
 * @author:Esan
 */
public class BusBuilder extends VehicleBuilder {


    @Override
    public void buildTyre() {
        vehicle.setTyre("bus轮胎");
    }

    @Override
    public void buildEnine() {
        vehicle.setEngine("bus引擎");
    }

    @Override
    public void buildSteering() {
        vehicle.setSteering("bus方向盘");
    }

}
