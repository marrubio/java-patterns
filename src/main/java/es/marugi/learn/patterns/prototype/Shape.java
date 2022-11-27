package es.marugi.learn.patterns.prototype;

// Base prototype.
abstract class Shape implements Prototype {

    private Integer X;
    private Integer Y;
    private String color;

    // A regular constructor.
    Shape(){
        super();
    }

    // The prototype constructor. A fresh object is initialized
    // with values from the existing object.
    Shape(Shape source){
        this();
        this.X = source.X;
        this.Y = source.Y;
        this.color = source.color;
    }

    public Integer getX() {
        return X;
    }

    public void setX(Integer x) {
        X = x;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        Y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Shape clone();

    public String toString(){
        return "X:" + this.X + " Y:" + this.Y + " Color:" + this.color;
    }

}
