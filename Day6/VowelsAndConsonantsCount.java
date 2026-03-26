Example1:
      intput:
            viyen27
      output:
              2 3


CODE:

import java.util.*;
public class VowelsAndConsonantsCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int vc=0;
        int cc=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vc++;
                else cc++;
            }
        }
        System.out.print(vc+" ");
        System.out.println(cc);
    }
}
