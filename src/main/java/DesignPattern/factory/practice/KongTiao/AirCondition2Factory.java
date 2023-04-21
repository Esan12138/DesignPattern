package DesignPattern.factory.practice.KongTiao;

/**
 * @Description:
 * @Date:2023-03-31-10:20
 * @author:Esan
 */
public class AirCondition2Factory implements AirConditionFactory{
    @Override
    public AirCondition createInstance() {
        return new AirCondition2();
    }
}
