import java.util.*;

class PparenTheses {
    public String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == ')'){
                // System.out.println( stack.pop());               // (A,B) 넣으면 출력결과는 B 
                while(stack.pop()!= '(');
            }else {
                stack.push(x);
            }
        }
        for(int i = 0; i<stack.size(); i++){
            answer+= stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args){
        PparenTheses T = new PparenTheses();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}