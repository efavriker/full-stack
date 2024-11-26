package lesson8;
/*
    wright class Rectangle
    fields width, height
    constructor which get two parameters width and height
    constructor which get only one parameter and use at as width and as height
    methods to calculate area and perimeter
    method isSquare which will return true are false if the rectangle is square
 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(double widthHeigh) {

        this.height = widthHeigh;
        this.width = widthHeigh;
    }

    public double calculateArea(){
        return this.width * this.height;
    }
    public double calculatePerimeter(){
        return ((2*this.width) + (2*this.height));
    }

    public boolean isSquare(){
        return this.width == this.height;
    }



}
