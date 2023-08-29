import java.util.*;

class VisibleStudent {
    public int solution(int n , int[] arr){
        int answer = 1, max = arr[0];

        for(int i=1; i<n; i++){
            if(arr[i]>max){
                answer ++;
                max=arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args){
        VisibleStudent T = new VisibleStudent();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();                  // n 개의 숫자 받기
        }
        System.out.print(T.solution(n,arr));

    }
}


/* 
 * 아.. 입력 예제 중 저거를 정렬해서 보는게 아닌 그냥 보는거... 
 */