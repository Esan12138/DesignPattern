package DesignPattern.factory.abstractFactory.practice;

import DesignPattern.factory.abstractFactory.Factory;
import javafx.scene.Scene;

/**
 * @Description:
 * @Date:2023-04-12-19:24
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        //春天
        SkinFactory SkinFactory = new SpringSkinFactory();
        Button button = SkinFactory.createButton();
        TextFiled textField = SkinFactory.createTextField();
        ComboBox comboBox = SkinFactory.createComboBox();

        button.display();
        textField.display();
        comboBox.display();

        System.out.println("`````````````````````````````````````````");
        //夏天
        SkinFactory = new SummerSkinFactory();
        button = SkinFactory.createButton();
        textField = SkinFactory.createTextField();
        comboBox = SkinFactory.createComboBox();

        button.display();
        textField.display();
        comboBox.display();

    }
}

interface Button {
    public void display();
}

interface TextFiled {
    public void display();
}

interface ComboBox {
    public void display();
}

interface SkinFactory {
    Button createButton();

    TextFiled createTextField();

    ComboBox createComboBox();
}

class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("浅绿色的按钮");
    }
}

class SpringTextFiled implements TextFiled {

    @Override
    public void display() {
        System.out.println("绿色边框的文本框");
    }
}

class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("绿色边框的组合框");
    }
}

class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("浅蓝色的按钮");
    }
}

class SummerTextFiled implements TextFiled {
    @Override
    public void display() {
        System.out.println("蓝色边框的文本框");
    }
}

class SummerComboBox implements ComboBox {

    @Override
    public void display() {
        System.out.println("蓝色边框的组合框");
    }
}

class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextFiled createTextField() {
        return new SpringTextFiled();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}

class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextFiled createTextField() {
        return new SummerTextFiled();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}