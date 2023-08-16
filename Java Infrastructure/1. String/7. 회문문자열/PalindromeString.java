import java.util.*;

class PalindromeString {
    public String solution(String str){
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) return "NO"; // 뒤집어진거랑 원래 문자랑 비교한다 equals
        /* 
        str=str.toUpperCase();                      // 대소문자 변환
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){ // 문자열 中 같지 않으면 No를 return 
                return "No";
            }
        } 
        */

        

        return answer;
    }

    public static void main(String[] args){
        PalindromeString T = new PalindromeString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

/* 
 * 회문이란?
 * 앞에서 읽을때나 뒤에서 읽을때나 같은 문자열 ex) gooG / 기러기 토마토...
 */