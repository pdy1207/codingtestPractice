import java.util.*;

class PostfixOperation {
    public int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(x - 48);                             // 아스키넘버로서 48숫자를 빼줌
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') {
                    stack.push(lt + rt);
                } else if(x == '-') {
                    stack.push(lt - rt);
                }
                else if(x == '*') {
                    stack.push(lt * rt);
                }
                else if(x == '/') {
                    stack.push(lt / rt);
                }
            }
        }
        answer = stack.get(0);
        
        return answer;
    }

    public static void main(String[] args){
        PostfixOperation T = new PostfixOperation();
        Scanner kb = new Scanner(System.in);        
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}

/* 
 * 5 + 3 
 * 후위식 
 * 53 + 
 * lt 에서 rt 를 빼야함
 */
