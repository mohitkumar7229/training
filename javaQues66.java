// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       int arr[]= new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int target=sc.nextInt();
       
       for(int i=0;i<n;i++){
           if(arr[i]==target){
               System.out.println(i+1);
               break;
           }
       }
    }
}