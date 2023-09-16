import java.util.*;

class CorrectParentheses {
    public String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == '(') {
                stack.push(x);
            } else {
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args){
        CorrectParentheses T = new CorrectParentheses();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}

/* 
 * Stack ?  Last In Fast Out 같은 느낌 
 * 즉, 공 123 순서대로 들어가면 3번을 먼저 꺼낼 수 밖에 없잖음
 * Queue ? 는 그냥 원통 같은 느낌 
 */