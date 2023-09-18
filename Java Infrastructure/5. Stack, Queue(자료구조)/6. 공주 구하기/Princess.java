import java.util.*;

class Princess {
    public int solution(int n , int k){
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for(int i = 1; i <= n ; i++){
            Q.offer(i);
        }
        while(!Q.isEmpty()){
            for(int i= 1; i < k; i++){
                Q.offer(Q.poll());                          // poll 꺼낸 값을 return 받는다
            }
            Q.poll();
            if(Q.size() == 1) {
                answer = Q.poll();
            }
        }
        
        return answer;
    }

    public static void main(String[] args){
        Princess T = new Princess();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(T.solution(n , k));

    }
}

/* 
 * stack 이 아닌 queue 로서 접근하기
 */