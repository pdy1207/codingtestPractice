/* import java.util.Scanner;

class CaseConversion {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){           // 해당 x가 소문자가 참이면 true 
                answer+= Character.toUpperCase(x);  // 소문자면 x에 누적한다.
            } else {                                // 이건 대문자면
                answer+=Character.toLowerCase(x);   // x 를 대문자로 바꿔라 
            }
        }

        return answer;
    }

    public static void main(String[] args){
        CaseConversion T = new CaseConversion();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));

    }
} */


import java.util.*;
class CaseConversion {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){ // 아스키 넘버 대문자는 65 ~ 90 소문자는 97 ~ 122 
            if(x >= 97 && x <= 122){
                // answer +=(x-32); // 소문자가 대문자로 가는것 그러나 이렇게 하면 숫자로 변환됨
                answer += (char)(x-32);
            } else {
                answer += (char)(x+32);
            }

        }

        return answer;
    }

    public static void main(String[] args){
        CaseConversion T = new CaseConversion();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));

    }
}