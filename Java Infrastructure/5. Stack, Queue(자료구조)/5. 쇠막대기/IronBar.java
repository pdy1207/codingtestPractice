import java.util.*;

class IronBar {
    public int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                stack.push('(');
            } else {
                stack.pop();
                if(str.charAt(i-1)== '('){
                    answer +=stack.size();
                } else {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        IronBar T = new IronBar();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

/* 
 * 괄호 문제는 무조권 stack 문제겠구나 라는생각 을 하냐 안하냐 차이
 */