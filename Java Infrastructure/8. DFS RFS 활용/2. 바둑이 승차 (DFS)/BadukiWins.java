import java.util.*;

class BadukiWins {
    static int answer = Integer.MIN_VALUE, c, n;
    public void DFS(int L, int sum, int[] arr){
        if(sum>c) return;
        if(L==n){
            answer = Math.max(answer, sum);
        }else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args){
        BadukiWins T = new BadukiWins();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);

    }
}