import java.util.*;

class Anagram {
    public String solution(String s1, String s2){
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x) == 0){
                return "No";
            }
            map.put(x,map.get(x)-1);
        }

        return answer;
    }

    public static void main(String[] args){
        Anagram T = new Anagram();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.print(T.solution(a,b));

    }
}
/* 
 * 길이는 무조권 같은게 나온다.
 */