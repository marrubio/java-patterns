package es.marugi.learn.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Application {

    List<Shape> shapes = new ArrayList<>();

    public Application() {

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setColor("White");
        circle.setRadius(20);
        shapes.add(circle);

        // The `anotherCircle` variable contains an exact copy
        // of the `circle` object.
        Circle anotherCircle = (Circle) circle.clone();

        anotherCircle.setX(50);
        anotherCircle.setColor("Red");
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(30);
        rectangle.setY(10);
        rectangle.setColor("Blue");
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        shapes.add(rectangle);
    }

    public void businessLogic() {
        // Prototype rocks because it lets you produce a copy of
        // an object without knowing anything about its type.
        List<Shape> shapesCopy = new ArrayList<>();

        // For instance, we don't know the exact elements in the
        // shapes array. All we know is that they are all
        // shapes. But thanks to polymorphism, when we call the
        // `clone` method on a shape the program checks its real
        // class and runs the appropriate clone method defined
        // in that class. That's why we get proper clones
        // instead of a set of simple Shape objects.
        for(Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }
        // The `shapesCopy` array contains exact copies of the
        // `shape` array's children.
        for(Shape shape : shapesCopy) {
            System.out.println(shape);
        }

    }

}
