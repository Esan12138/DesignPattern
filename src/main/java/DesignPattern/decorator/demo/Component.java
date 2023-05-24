package DesignPattern.decorator.demo;

/**
 * 装饰者模式代码模板
 */
//基础组件
public interface Component {
    public void opeartion();
}

//具体组件
class ConcreteComponent implements Component {
    @Override
    public void opeartion() {
        //执行具体操作
    }
}

//装饰者抽象类
abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void opeartion() {
        component.opeartion();
    }
}

class ConcreteDecoratorA extends Decorator {
    private String addedState;

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void opeartion() {
        super.opeartion();
    }
}

class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void opeartion() {
        super.opeartion();
    }

    public void addBehavior() {
        //新增方法
    }
}

