import java.util.*;

class OnlyNumber {
    public int solution(String s){
        // int answer = 0;
        // for(char x : s.toCharArray()){
        //     if(x >= 48 && x <= 57){                     // 아스키 넘버로서 해결하기
        //         answer=answer*10+(x-48);                // x = '0' 문자가 들어가게되면 - 가 + 된다
        //     }
        // }
        String answer = "";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){                       // isDigit x가 숫자냐 물어보는것임
                answer+=x;                                  // String으로 누적이됨 즉 숫자누적!
            }
        }
        return Integer.parseInt(answer);                    // 0208 中 앞에 0을 없애주기위해 숫자로 변환
    }

    public static void main(String[] args){
        OnlyNumber T = new OnlyNumber();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}


