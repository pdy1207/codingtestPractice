import java.util.*;

class Mentoring {
    public int solution(int n, int m, int[][] arr){
        int answer = 0;
        for(int i = 1; i <= n; i++){                    // 2중 for문 돌기 i, j의 짝 찾기 
            for(int j = 1; j <= n; j++){
                int cnt = 0; 
                for(int k = 0; k < m; k++){             
                    int pi = 0, pj = 0;
                    for(int s = 0; s < n; s++){
                        if(arr[k][s] == i) pi = s;      // 학생 번호를 찾으면? 
                        if(arr[k][s] == j) pj = s;
                    }
                    if(pi < pj) cnt++;
                }
                if(cnt == m){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Mentoring T = new Mentoring();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];                    // 몇등했는지?
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, m, arr));

    }
}