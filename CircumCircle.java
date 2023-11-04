import java.util.Scanner;

class Circumference{
    public double getCircumference(double diameter){
        return 3.142857*diameter;
    }
}
public class CircumCircle {
    public static void main(String[] args) {
        Scanner dev=new Scanner(System.in);
        System.out.print("Enter the diameter: ");
        float diameter=dev.nextFloat();
        Circumference circum=new Circumference();
        double theCircumference=circum.getCircumference(diameter);
        System.out.println(theCircumference);
        dev.close();
        
    }
    
}
