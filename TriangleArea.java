import java.util.Scanner;
class JArea{
    public double getArea(double base, double height){
        return (0.5*(base*height));
    }
}
public class TriangleArea {
    public static void main(String[] args) {
        Scanner dev=new Scanner(System.in);
        System.out.print("Enter the base length: ");
        float base=dev.nextFloat();
        System.out.print("Enter the heigth: ");
        float height=dev.nextFloat();
        JArea area=new JArea();
        double triArea=area.getArea(base,height);
        System.out.println(triArea);
        dev.close();
    }
    
}
