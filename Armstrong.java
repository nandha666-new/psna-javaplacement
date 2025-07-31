import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Armstrong{

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int pow=1,ld;
        int sum = 0;
        int count = 0;
        int copy = n;
        while(n>0){
            count++;
            n = n/10;
        }
        n = copy;
        while(n>0){
            ld = n%10;
            n = n/10;
        for(int i = 1;i<=count;i++){
            pow = pow*ld;
        }
            sum = sum+count;
    }
        if(copy == sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong number");
        }
}
}
