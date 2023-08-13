/* import java.util.*;

class WordInSentence {
    public String solution(String str){
        String answer = "";
        int max = Integer.MIN_VALUE;                     // 가장 작은값으로 초기화
        String[] s = str.split(" ");
        for(String x : s){
            int len = x.length();
            if(len > max){                              // 더 긴게 발견되면 
                max = len;                              // 최대값을 answer에 넣음 
                answer = x; 
            }
        }

        return answer;
    }

    public static void main(String[] args){
        WordInSentence T = new WordInSentence();
        Scanner kb = new Scanner(System.in);
        String str= kb.nextLine();                      // 한줄로 받기 위한 nextLine()
        System.out.println(T.solution(str));

    }
} */


import java.util.*;

class WordInSentence {
    public String solution(String str){
        String answer = "";
        int max = Integer.MIN_VALUE,pos;                        // 가장 작은값으로 초기화
        while((pos = str.indexOf(' '))!= -1){                // indexOf (' 띄어쓰기 첫번째 위치를 return ') pos 는 띄어쓰기 공간
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > max){                                      
                max = len;
                answer = tmp;
            }
                str= str.substring(pos+1); 
            /* 
             * 같다라고 하면 안되는이유는 앞에서 부터 단어를 찾아 나가니,
             * 뒷쪽에서 같다 하면 뒷쪽 단어를 답으로 해버리니.. 
             * 마지막 단어를 포함시키지 않았으니 하단 코드를 작성해야함.
             */

             if(str.length() > max) {                             // 마지막 길이가 크다고하면 answer를 포함시켜줘야함.
                answer = str; 
             } 
        }          

        return answer;
    }

    public static void main(String[] args){
        WordInSentence T = new WordInSentence();
        Scanner kb = new Scanner(System.in);
        String str= kb.nextLine();                      // 한줄로 받기 위한 nextLine()
        System.out.println(T.solution(str));

    }
}