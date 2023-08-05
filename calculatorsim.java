import java.util.Scanner;

public class calculatorsim {
    public static void main(String[] args) {
        Scanner scv= new Scanner(System.in);
        System.out.println("enter the first no.");
        int a =scv.nextInt();
        System.out.println("enter the secon no.");
        int b= scv.nextInt();
        System.out.println("choose the operation\n 1. add\n 2.sub\n 3. mul ");
        int option =scv.nextInt();
        switch (option) {
            case 1: System.out.println("the sum is:"+(a+b)); 
                break;
            case 2: System.out.println("the sub is:" +(a-b));
            break;
            case 3: System.out.println("the mul is:" +(a*b));
            break;
            default: System.out.println("invalid");
                break;
        }

    }
}
