import java.util.Scanner;

class StringFound {
    public int solution(String str, char t){
        int answer =0; 
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        
        /* 
         * 받은 두개의 문자를 올려서 비교하는 식
         *  System.out.println(str + " " + t); 
         */     

        /* 
            1. 전통적인 for 방식

            for(int i =0; i<str.length(); i++){
                if(str.charAt(i) == t){
                    answer ++;
                }
            }             
        */

        for (char x : str.toCharArray()){  
            // toCharArray String을 문자 배열로 만들어준다.
            if(x == t){
                    answer ++;
            }
        }
        

        return answer;
    }

    public static void main(String[] args){
        StringFound T = new StringFound();
        Scanner kb = new Scanner(System.in);
        String str= kb.next(); // 문자열 스캔
        char c = kb.next().charAt(0); // 문자 한개 스캔

        System.out.println(T.solution(str,c));
    }
}


