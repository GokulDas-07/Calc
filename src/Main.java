import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int option,num1,num2,result;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number 1:");
        num1 = input.nextInt();
        System.out.println("Enter Number 2:");
        num2=input.nextInt();
        System.out.println("Enter operation:1.Additon  2.Subtraction  3.Multiplication  4.Division");
        option=input.nextInt();
    }
}