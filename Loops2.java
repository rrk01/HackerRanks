import java.util.*;
//import java.io.*;
//import java.lang.Math;

public class Loops2 {

        public static int pow(int base, int exp) {
            int sum = 1;
            if(exp == 0)
                return 1;
            for(int i = 0; i < exp; i ++)
                sum *= base;
            return sum;
        }
        
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int temp = a;
                for(int j = 0; j < n; j ++) {
                    temp += (int)pow(2,j) * b;
                    System.out.print(temp + " ");
                }
                System.out.println();
            }
            in.close();
        }

}
