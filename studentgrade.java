import java.util.Scanner;

class studentgrade{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your score");
        int i = in.nextInt();
        
        if(i<36){
            System.out.println("you are fail");
        }else if(i>36 && i<50){
            System.out.println("you are c grade");
        }else if(i>50 && i<75){
            System.out.println("you are B grade");
        }else if(i>75){
            System.out.println("you are A grade");
        }else{
            System.out.println("wrong value");
        }
    }
}