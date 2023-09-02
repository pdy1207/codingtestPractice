import java.util.*;

class FlippedDecimal {
    public boolean isPrime(int num){                            // 소수인지 참 거짓
            if(num==1){
                return false;
            }

            for(int i =2 ; i <num; i++){
                if(num % i == 0 ){
                    return false;
                }
            }
            return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr){           // 소수면 ArrayList return 
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0) {
                int t = tmp % 10; 
                res = res * 10 + t; 
                tmp = tmp / 10;
            }
            if(isPrime(res)){
                answer.add(res);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        FlippedDecimal T = new FlippedDecimal();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];                     // 길이 배열 받기 
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n,arr)){
            System.err.print(x + " ");
        }

    }
}
/* 
 * 연속된 0 은 배제한다 
 */