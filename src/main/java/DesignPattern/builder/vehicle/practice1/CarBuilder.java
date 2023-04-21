package DesignPattern.builder.vehicle.practice1;

/**
 * @Description:
 * @Date:2023-04-07-8:56
 * @author:Esan
 */
public class CarBuilder extends VehicleBuilder {


    @Override
    public void buildTyre() {
        vehicle.setTyre("car轮胎");
    }

    @Override
    public void buildEnine() {
        vehicle.setEngine("car引擎");
    }

    @Override
    public void buildSteering() {
        vehicle.setSteering("car方向盘");
    }


}
