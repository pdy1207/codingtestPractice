import java.util.*;

class FibonacciNumbers {
    public int[] solution(int n){
        // array을 리턴
        int[] answer = new int[n];
        answer[0]=1;
        answer[1]=1;
        for(int i=2; i<n; i++){
            answer[i] = answer[i-2]+answer[i-1];
        }
        return answer;
    }

    public static void main(String[] args){
        FibonacciNumbers T = new FibonacciNumbers();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int x : T.solution(n)) System.out.print(x + " ");
    }
}

// ------ 손코딩 ;;


class FibonacciNumbers2 {
    public void solution(int n){
        int a = 1, b = 1, c; 
        System.out.print(a+ " " + b + " ");
        for(int i=2; i<n; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b ;
            b = c ;
        }
             
    }

    public static void main(String[] args){
        FibonacciNumbers2 T = new FibonacciNumbers2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.solution(n);
    }
}