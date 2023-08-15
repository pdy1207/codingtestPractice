import java.util.*;

class RemoveDuplicateCharacters {
    public String solution(String str){
        String answer = "";
        for(int i=0; i<str.length(); i++){
            /* 
               System.out.println(str.charAt(i)+ " " + i + " " + str.indexOf(str.charAt(i)));
             * ksekkset
                k 0 0
                s 1 1
                e 2 2
                k 3 0
                k 4 0
                s 5 1
                e 6 2
                t 7 7
             */
            if(str.indexOf(str.charAt(i))== i){
                answer+=str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        RemoveDuplicateCharacters T = new RemoveDuplicateCharacters();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}