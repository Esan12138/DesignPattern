package DesignPattern.adapter.homework1;


/**
 * @Description:
 * @Date:2023-04-14-11:07
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        CarAdapter carAdapter = new CarAdapter(new OldeCar1Light(), new OldCar1Sound());
        carAdapter.whistle();
        carAdapter.blink();
    }
}

interface Icar {

    default void whistle() {
        System.out.println("汽车发出声音");
    }
    default void blink() {
        System.out.println("汽车灯光闪烁");
    }
}

class OldCar1 implements Icar {
    CarLight oldcar1light;
    CarSound oldCar1Sound;

    public OldCar1(CarLight oldcar1light, CarSound oldCar1Sound) {
        this.oldcar1light = oldcar1light;
        this.oldCar1Sound = oldCar1Sound;
    }
    public void whistle() {
        oldcar1light.whistle();
    }
     public void blink() {
        oldCar1Sound.blink();
    }
}

interface CarLight {
    public void whistle();
}

class OldeCar1Light implements CarLight {
    @Override
    public void whistle() {
        System.out.println("汽车发出警笛声");
    }
}

interface CarSound {
    public void blink();
}

class OldCar1Sound implements CarSound {
    @Override
    public void blink() {
        System.out.println("警车灯光闪烁");
    }
}

class CarAdapter extends OldCar1 implements Icar {

    public CarAdapter(CarLight oldcar1light, CarSound oldCar1Sound) {
        super(oldcar1light, oldCar1Sound);
    }
    @Override
    public void whistle() {
        super.whistle();
    }
    @Override
    public void blink() {
        super.blink();
    }
}
