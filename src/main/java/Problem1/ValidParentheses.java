package Problem1;
import java.util.*;

public class ValidParentheses
{
    public static boolean isValid(String str) {
        if(str == null|| str.isEmpty()|| str.trim().length()==0){
            return true;
        }
        int n = str.length();
        if(n==0) return true;
        Deque<Character> stk = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            char c = str.charAt(i);
            if(stk.isEmpty()) stk.push(c);
            else{
                if(stk.peek()==rev(c)) stk.pop();
                else stk.push(c);
            }
        }
        return stk.size()==0;
    }

    private static char rev(char c){
        if(c==')') return '(';
        if(c==']') return '[';
        if(c=='}') return '{';
        return '#';
    }
}