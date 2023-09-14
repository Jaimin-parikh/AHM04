import java.util.Scanner;
public class maxOfThree{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = read.nextDouble();
        System.out.print("\nEnter b : ");
        double b = read.nextDouble();
        System.out.print("\nEnter c : ");
        double c = read.nextDouble();
        read.close();
        if(a > b && a>c)
            System.out.println(a+ " is The biggest");
        else if (b>a && b>c)
        System.out.println(b+ " Is the biggest");
        else
        System.out.println(c+ " Is the biggest");
    }
}