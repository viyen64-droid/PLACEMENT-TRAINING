import java.util.*;
public class ReduceExtraSpace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                ans+=ch;
                flag=true;
            }
            else{
                if(flag){
                    ans+=ch;
                    flag=false;
                }
            }
        }
        System.out.println(ans);
    }
}
