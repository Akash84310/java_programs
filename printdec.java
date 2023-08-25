import java.util.Scanner;

public class printdec {


    public static void printtdec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printtdec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
       printtdec(n);
        
    }
}
