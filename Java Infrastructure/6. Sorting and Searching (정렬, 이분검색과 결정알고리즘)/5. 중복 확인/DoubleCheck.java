import java.util.*;

class DoubleCheck {
    public String solution(int n, int[] arr){
        String answer = "U";
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++){
            if(arr[i] == arr[i+1]){
                return "D";
            }
        }

        return answer;
    }

    public static void main(String[] args){
        DoubleCheck T = new DoubleCheck();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i< n ; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}