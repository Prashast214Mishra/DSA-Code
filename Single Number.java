import java.util.*;
public class Main {
    public static void main (String args[]) {
        //Scanner sc = new Scanner(System.in);
     int []num={4,3,2,1,2,3,4,6,7,9};
     int max=0;
     for(int i=0; i<num.length;i++){
         if(num[i]>max){
             max = num[i];
         }
     }

     int [] arr= new int[max+1];
     for(int i=0; i<num.length;i++){
         int a=num[i];
         arr[a]=arr[a]+1;
     }
     for(int i=0; i< arr.length; i++){
         if(arr[i]==1){
             System.out.println(i);
         }
     }

    }
}
