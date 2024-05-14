import java.util.Scanner;

class squareroot{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int i = in.nextInt();

        int square = i*i;

        System.out.println("The square root of "+i+ " is "+square);
    }
}