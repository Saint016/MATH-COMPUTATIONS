import java.util.Scanner;

class Area{

  public double getArea(double radius){
    return 3.142857*radius*radius;

      } 

    }

   //return 22/7*(radius*radius);

public class CircleArea{
    public static void main(String[] args) {
      Scanner dev= new Scanner(System.in);
      System.out.print("Enter the radius: ");
      float radius=dev.nextFloat();
      Area area=new Area();
      double totalArea=area.getArea(radius);
      System.out.println(totalArea);
      dev.close();
    }
}