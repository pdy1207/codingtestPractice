import java.util.*;

class ValidPalindrome {
    public String solution(String s){
        String answer = "NO";
        s=s.toUpperCase().replaceAll("[^A-Z]","");           // 대문자 A - Z 까지 "아니면" 빈문자로 즉, 쉼표 띄어쓰기 콜론 등 제거
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)){
            return "YES";
        }

        return answer;
    }

    public static void main(String[] args){
        ValidPalindrome T = new ValidPalindrome();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();                             // 한줄을 읽음
        System.out.println(T.solution(str));

    }
}
/* 
 * 앞에서 읽을때나 뒤에서 읽을때나 같은 문자열을 팰린드롬
 * 앞문자와 동일하지만, "알파벳만" 가지고 회문을 검사
 * found7, time: study; Yduts; emit, 7Dnuof
 */