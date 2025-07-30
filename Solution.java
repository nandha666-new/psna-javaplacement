import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        long NUM,count = 0;
        NUM = in.nextLong();
        while(NUM>0){
            NUM = NUM/10;
            count++;
        }
        System.out.println(count);
    }
}
