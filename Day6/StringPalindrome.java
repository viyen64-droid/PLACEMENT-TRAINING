Example1:
     input:
           madam
     output:
           true
Example2:
     input:
           aadbb
     output:
             false


import java.util.*;
public class StrPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(IsPalindrome(str));
    }
    public static boolean IsPalindrome(String str){
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}
