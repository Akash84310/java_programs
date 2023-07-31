import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
    {
        System.out.println("enter the size");
    }
    Scanner SC=new Scanner(System.in);
    int size = SC.nextInt();
    int akash[]=new int[size];
    //input
    for(int i=0; i<size;i++){
        akash[i]=SC.nextInt();
    }
    //ouput
    System.out.println("enter the searching value"); 
    int x=SC.nextInt();
    for(int i=0;i<size;i++){
        if(x==akash[i]){
            System.out.println("item found at position"+i);
        }
    }
    }
}
