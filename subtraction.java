import java.util.Scanner;

class Subtraction{
    public double subtract(double num1, double num2){
        return num1-num2;
    }
}
public class Subtract {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1=input.nextFloat();
        System.out.print("Enter the second number: ");
        float num2=input.nextFloat();
        Subtraction subs=new Subtraction();
        double results=subs.subtract(num1, num2);
        System.out.println(results);
    input.close();  
    }
    
}
