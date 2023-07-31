import java.util.Scanner;

public class arrya2 {
    public static void main(String[] args) {
        System.out.println("enter the size");
        Scanner sc= new Scanner(System.in);
        int Size =sc.nextInt();
        int jay[]=new int [Size];
        //input
        for(int i=0;i<Size;i++)
        {
            jay[i] =sc.nextInt();
        }
        //output
        for(int i=0;i<jay.length;i++){
            System.out.println(jay[i]+" ");
        }

    }
}
