import java.util.*;

class FindTheRatio {
    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            int cnt = 1; 
            for(int j = 0; j < n; j++){
                if(arr[j] > arr[i]) {
                    cnt ++;
                }
            }
            answer[i] = cnt;
            
        }

        return answer;
    }

    public static void main(String[] args){
        FindTheRatio T = new FindTheRatio();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();                   // 학생 수 
        int[] arr = new int[n];                 // 동적으로 받기 
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n, arr)) System.out.print(x + " ");

    }
}