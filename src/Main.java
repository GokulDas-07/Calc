import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int option,num1,num2,result=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number 1:");
        num1 = input.nextInt();
        System.out.println("Enter Number 2:");
        num2=input.nextInt();
        System.out.println("Enter operation:1.Addition  2.Subtraction  3.Multiplication  4.Division  5.Exit");
        option=input.nextInt();

        switch (option)
        {
            case 1:
                result = num1 + num2;
                System.out.println("Result:" + result);
                break;

            case 2:
                result=num1-num2;
                System.out.println("Result:" + result);
                break;

            case 3:
                result=num1*num2;
                System.out.println("Result:" + result);
                break;

            case 4:
                try {
                     result = num1 / num2;
                    System.out.print("Result:"+result);
                }catch (ArithmeticException e){System.out.println("Divided by zero is not possible");}

                break;

            case 5:
                System.out.println("Exiting...");
                System.exit(0);

            default:
                System.out.println("Invalid option");

        }



    }
}