package DesignPattern.builder.vehicle.practice1;

import DesignPattern.builder.vehicle.Vehicle;

/**
 * @Description:
 * @Date:2023-04-07-9:26
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        VelicleDirector velicleDirector = new VelicleDirector(carBuilder);
        Vehicle car = velicleDirector.construct();
        System.out.println(car);

        System.out.println(new VelicleDirector(new BusBuilder()).construct());
    }
}
