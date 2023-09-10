import java.util.*;

class ContinuousSubsequence {
    public int solution(int n, int m, int[] arr){
        int answer = 0, sum = 0 , lt = 0;
        for (int rt = 0; rt < n ; rt++){
            sum+=arr[rt];
            if(sum == m){
                answer++;
            }
            while(sum >= m){
                sum-=arr[lt++];         // 해당 값을 빼고 나서 lt 값을 증가
                if(sum == m){
                    answer++;
                }
            }
        } 

        return answer;
    }

    public static void main(String[] args){
        ContinuousSubsequence T = new ContinuousSubsequence();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n,m,arr));

    }
}

/* 
 * lt rt : 특정 부분부터 특정 부분 까지 
 */