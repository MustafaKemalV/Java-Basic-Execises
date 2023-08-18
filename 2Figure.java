import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {
        
        int choose;
        double firstside, secondside, thirdside, height, radius;
        
        Scanner info = new Scanner(System.in);
        
        System.out.println("Please press one for triangle or press two for circle. ");
        
        choose = info.nextInt();
        
        if(choose==1) {
            
            String GeometricalFigure = "Triangle";
            Triangle TriangleFigure = new Triangle();
            
            System.out.println("Enter first side of triangle. ");
            
            firstside = info.nextDouble();
            TriangleFigure.side1 = firstside;
            
            System.out.println("Enter second side of triangle. ");
            
            secondside = info.nextDouble();
            TriangleFigure.side2 = secondside;
            
            System.out.println("Enter third side of triangle. ");
            
            thirdside = info.nextDouble();
            TriangleFigure.side3 = thirdside;
            
            System.out.println("Perimeter " + TriangleFigure.perimeter());
            System.out.println("Area " + TriangleFigure.area());
        }
        else if(choose==2) {
            
            String GeometricalFigure = "Circle";
            Circle CircleFigure = new Circle();
            
            System.out.println("Enter radius of Circle. ");
            radius = info.nextDouble();
            CircleFigure.radius = radius;
            
            System.out.println("Perimeter " + CircleFigure.perimeter());
            System.out.println("Area " + CircleFigure.area());
            
        }
        else {
            System.out.println("You enterede invalid number. Please restart the page. ");
        }
        
    }
}


