package com.attin.generics.basic.b3BoundedUpperBounded;

import com.attin.generics.basic.b3BoundedUpperBounded.model.shape.Circle;
import com.attin.generics.basic.b3BoundedUpperBounded.model.shape.Rectangle;
import com.attin.generics.basic.b3BoundedUpperBounded.model.shape.Shape;

import java.util.Arrays;
import java.util.List;

/**
 * Upper bounded < ? extends T>
 */
public class UpperBoundedApp {

    public static void sum(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        System.out.println("*****UpperBounded Class******");
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();

        /**
         *  accepts list of any subclass of Shape
         */
        System.out.println("****UpperBounded Method*******");
        List<Integer> integerNumber = Arrays.asList(1, 6, 9, 7, 54, 64, 8, 48, 8, 8, 54);
        sum(integerNumber);

        List<Double> doubleNumber = Arrays.asList(1.2, 6.8, 9.6, 7.7, 5.4, 6.4, 8.0, 48.8, 8.4, 8.7, 5.4);
        sum(doubleNumber);
    }
}
