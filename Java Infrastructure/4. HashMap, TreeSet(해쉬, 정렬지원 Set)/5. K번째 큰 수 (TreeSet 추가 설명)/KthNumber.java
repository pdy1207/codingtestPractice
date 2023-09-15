import java.util.*;

class KthNumber {
    public int solution(int[] arr, int n, int k){
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());              // reverseOrder 내림차순 기본은 오름차순
        for (int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int l = j+1; l < n; l++){
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : Tset){
            cnt++; 
            if(cnt == k) return x;
        } 
        return answer;
    }

    public static void main(String[] args){
        KthNumber T = new KthNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr, n, k));

    }
}

/* 
 * TreeSet
 * 트리 형식으로 정렬도 하고 균형도 잡아줌 
 * MapSet이랑 동일한 성격을 가짐
 */