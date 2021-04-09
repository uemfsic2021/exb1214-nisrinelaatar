import java.util.Scanner;

public class Palindrome {

    public static boolean is_palindrome(String s)
    {
       
        int a = s.length();
  
       for (int i=0;i<(a-1);i=i+1){
         if(s.charAt(i)!=s.charAt(a-i-1)){
           return false;
        
           }
      }
        return true;
      
    }
}