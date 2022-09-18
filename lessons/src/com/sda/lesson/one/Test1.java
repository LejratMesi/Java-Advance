package com.sda.lesson.one;

import com.sda.exercise_12_13.Car;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class carClass = Class.forName("com.sda.exercise_12_13.Car");
        Car car = (Car) carClass.newInstance();
        Method isPrototypeMethod = carClass.getDeclaredMethod("isPrototype");
        isPrototypeMethod.setAccessible(false);
        System.out.println("Is Prototype name: " + isPrototypeMethod.invoke(car));
    }
}
