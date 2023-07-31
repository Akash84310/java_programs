import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        int jay[]={3,4,5,6};
        int akash[]={3,4,5,8};
        for(int i=0;i<=4;i++)
        if (jay[i]==akash[i]) {
            System.out.println("equal arrays found "+i);
        } else if (jay[i]!=akash[i]) {
            System.out.println("difference are:"+ jay[i]);
            System.out.println(akash[i]);
        }
    }
}
