abstract class Shape{
    public abstract double calculateArea();

}

class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
}
@Override
public double calculateArea(){
    return length*width;
}
}
class Circle extends Shape{
    double radius;
     public Circle(double radius){
        this.radius=radius;
     }
 @Override
     public double calculateArea(){
        return Math.PI*radius*radius;

     }
}
class Triangle extends Shape{
    double base;
    double height;
    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    @Override
    public double calculateArea(){
        return 1/2*base*height;
    }
}
public class ShapeAreaCalculator{
    public static void main(String[] args) {
        Shape[]shapes=new Shape[3];
        shapes[0]=new Rectangle(5.2,3.0);
        shapes[1]=new Circle(4.5);
        shapes[2]=new Triangle(4,5);

        double totalArea=0;

        for(Shape shape:shapes){
            double area=shape.calculateArea();
            System.out.println("Area=" +area);
            totalArea +=area;
        }
        System.out.println("Total area of shapes:" +totalArea);

    }
}