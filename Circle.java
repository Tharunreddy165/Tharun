package ajp;

public class Circle {
    double area;
    double radius;
    static double pi;
    double getArea(){
        return area = pi*radius*radius;
    }
    double getradius(){
        return radius = Math.sqrt(area / pi);
    }
    public static void main(String[] args) {
        pi = 3.14;
        Circle circleobj = new Circle();
        circleobj.area = 5;
        circleobj.radius = 6;

        double areaa = circleobj.getArea();
        System.out.println("Area: " + areaa);
        
        double radiuss = circleobj.getradius();
        System.out.println("Radius: " + radiuss);


    }
}