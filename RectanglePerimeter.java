import java.util.Scanner;
class Perimeter{
    public float getPerimeter(float width, float lenght){
        return (width+lenght)*2;
    }
}
public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner dev=new Scanner(System.in);
        System.out.print("Enter the width: ");
        float width=dev.nextFloat();
        System.out.print("Enter the length: ");
        float lenght=dev.nextFloat();
        Perimeter perimeter=new Perimeter();
        float recPerimeter=perimeter.getPerimeter(width, lenght);
        System.out.println(recPerimeter);
        dev.close();
        
    }
    
}
