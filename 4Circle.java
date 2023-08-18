public class Circle {
    public double radius, pi;
    
    Circle() {
        
        this.pi = Math.PI;
        this.radius = 0;
    }
    Circle(double radius) {
        
        this.radius = radius;
        }
    double area() {
        
        return pi*radius*radius;
    }    
    double perimeter() {
        
        return 2*pi*radius;
    }
    
}