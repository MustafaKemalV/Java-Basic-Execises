public class Triangle {
    public double side1, side2, side3;
    double s;
    
    Triangle() {
        
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
        
        
    }
    Triangle(double side1, double side2, double side3) {
        
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        
    }
    double perimeter() {
        return side1+side2+side3;
    }
    double area() {
        
        s = side1+side2+side3/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
}