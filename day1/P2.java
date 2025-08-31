import java.util.Scanner;
public class P2 {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name :");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age :");
//        int age = scanner.nextInt();
//
//        System.out.println("What is your gpa :");
//        double gpa = scanner.nextDouble();
//
//
//        System.out.println("Hello " + name);
//        System.out.println("You are "+ age + " Years old");
//        System.out.println("Your gpa is :"+ gpa);
//
//        scanner.close();
//
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age :");
        int age = scanner.nextInt();
        scanner.nextLine();


//        if(age < 18){
//            System.out.println("You are not an adult.. you can't watch this movie");
//
//        }
//        else {
//            System.out.println("You can watch this movie");
//        }
        System.out.println("Enter your favourite color :");
        String color = scanner.nextLine();

        System.out.println("Your age is :" + age);
        System.out.println("Your favourite color is :" + color);

        scanner.close();
    }
}

