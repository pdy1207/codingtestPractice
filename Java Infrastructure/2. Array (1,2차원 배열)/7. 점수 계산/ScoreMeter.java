import java.util.*;

class ScoreMeter {
    public int solution(int n, int[] arr){
        int answer = 0, cnt = 0;;
        for(int i = 0; i < n; i++){
            if(arr[i]==1){
                cnt++;
                answer+=cnt;
            } else {
                cnt = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        ScoreMeter T = new ScoreMeter();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();                   // 10
        int[] arr = new int[n];                 // 배열 
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,arr));

    }
}