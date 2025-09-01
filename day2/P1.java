import java.util.Scanner;

public class P1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double width;
        double height;
        double area;

        System.out.print("Enter the height of rectangle :");
        height = scanner.nextDouble();

        System.out.print("Enter the width of rectangle :");
        width = scanner.nextDouble();

        area = height* width;

        System.out.println("The area of the rectangle is : " + area + " sq. unit");

        scanner.close();
    }

}