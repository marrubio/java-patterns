package es.marugi.learn.patterns.prototype;

// Concrete prototype. The cloning method creates a new object
// in one go by calling the constructor of the current class and
// passing the current object as the constructor's argument.
// Performing all the actual copying in the constructor helps to
// keep the result consistent: the constructor will not return a
// result until the new object is fully built; thus, no object
// can have a reference to a partially-built clone.
public class Circle extends Shape{

    private Integer radius;

    Circle() {
        super();
    }

    Circle(Circle source) {
        // A parent constructor call is needed to copy private
        // fields defined in the parent class.
        super(source);
        this.radius = source.radius;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public String toString(){
        return "Circle -> " + super.toString() + " Radius:" + this.radius;
    }


}
