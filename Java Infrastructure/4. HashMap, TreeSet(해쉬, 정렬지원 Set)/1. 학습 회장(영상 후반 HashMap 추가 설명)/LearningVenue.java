import java.util.*;

class LearningVenue {
    public char solution(int n , String s){
        char answer= ' '; 
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x,map.getOrDefault(x, 0)+1);              //⭐⭐ x 의 값을 가져오는데 없으면 0값을 return 
        }
        System.out.println(map.containsKey('A'));                   // 해당 문자를 검사해 true / false 를 출력해줌

        System.out.println(map.size());                                 // key의 갯수 

        System.err.println(map.remove('A'));                         // ⭐특정 키를 삭제
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            // System.out.println(key + " " + map.get(x));
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }


        return answer;
    }

    public static void main(String[] args){
        LearningVenue T = new LearningVenue();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n,str));

    }
}

/* 
 * Hash Map?
 * key value 값 으로 이루어짐 
 */