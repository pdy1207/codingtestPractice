import java.util.*;

class WordFilp {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
       /*  
        for (String x : str){
            String tmp = new StringBuilder(x).reverse().toString();             // StringBuilder라는 문자라는 객체를 생성 -> 반대 -> 문자열
            answer.add(tmp);
        }
         */

        for(String x : str){
            char[] s = x.toCharArray();                                         // String 을 갖는 s가 문자 배열화가됨
            int lt = 0 , rt = x.length() -1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;                                                           // reverse를 힘겹게 하는 알고리즘 gg
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
            
        }
        return answer;
    }

    public static void main(String[] args){
        WordFilp T = new WordFilp();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();                               // 단어가 몇개들어오는지 ?
        String[] str = new String[n];                       // 단어 갯수 하나하나 들어가야 하니
        for (int i =0; i<n; i++){
            str[i]= kb.next();                              // 배열을 하나하나 씩 넣는다 
        }
        
        for(String x : T.solution(n,str)){
            System.out.println(x);                          // 한개한개 씩 보내기
        }

    }
}