import java.util.*;

class Decimal {
    public int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1];                    // n + 1 까지 해야 n 까지 생김
        for(int i =2; i<n; i++){
            if(ch[i]==0){
                answer ++;
                for(int j=i; j<n; j=j+i){
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Decimal T = new Decimal();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();                       // 숫자 읽고 n 으로 넘김
        System.out.println(T.solution(n));

    }
}

/* 
 * 에라토스테네스 체?
 * 소수구할때 가장 빠른 방법 
 */