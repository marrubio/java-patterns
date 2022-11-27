package es.marugi.learn.patterns.prototype;

// Concrete prototype. The cloning method creates a new object
// in one go by calling the constructor of the current class and
// passing the current object as the constructor's argument.
// Performing all the actual copying in the constructor helps to
// keep the result consistent: the constructor will not return a
// result until the new object is fully built; thus, no object
// can have a reference to a partially-built clone.
public class Rectangle extends Shape{

    private Integer width;
    private Integer height;

    Rectangle(){
        super();
    }

    Rectangle(Rectangle source){
    // A parent constructor call is needed to copy private
    // fields defined in the parent class.
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public String toString(){
        return "Rectangle -> " + super.toString() + " Width:" + this.width + " Height:" + this.height;
    }

}
