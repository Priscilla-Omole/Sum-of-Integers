import java.util.Scanner;

public class SumofIntegers {

    public static void main(String[]args) {
        sum();
    }
    private static void sum(){
        Scanner input= new Scanner(System.in);
        int x;
        int y;

        System.out.print("Enter the value of x: ");
        x = input.nextInt(2);

        System.out.print("\n \n Enter the value of y: ");
        y = input.nextInt(3);

        int sum= x+y;
        System.out.printf("sum: ",sum);
        System.out.print(sum);


        }
}



