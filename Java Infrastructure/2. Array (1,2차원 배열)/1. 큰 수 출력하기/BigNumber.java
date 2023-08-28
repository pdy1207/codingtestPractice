import java.util.*;

class BigNumber {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args){
        BigNumber T = new BigNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();                  
        int[] arr = new int[n];                 // 배열을 동적으로 받음
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution( n , arr )){
            System.out.print(x + " ");
        }

    }
}