import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<=2;i++)
              {
                String s=sc.next();
                int n=sc.nextInt();
                System.out.print(s);
                for(int a=s.length();a<=14;a++)
                    System.out.print(" ");
                if(n<10)
                    System.out.print("00"+n);
                else if(n<100)
                    System.out.print("0"+n);
                else{
                    System.out.print(n);
                }System.out.println();
            
              } System.out.println("================================");
    
            
    }
