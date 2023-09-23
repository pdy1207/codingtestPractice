import java.util.*;

class Main {
    public int solution(int n, int m ,int[] arr){
        int answer = 0; 
        Arrays.sort(arr);
        int lt = 0, rt = n-1;
        while(lt <= rt){
            int mid = (lt + rt) / 2;                // 2분검색 스타일
            if(arr[mid] == m){
                answer = mid + 1;
                break;
            }
            if(arr[mid] > m){
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[]arr = new int[n];
        for(int i =0; i< n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,m,arr));

    }
}
/* 
 * 2분검색은 무조권 정렬이 되어있어야한다.
 * 앞에서 보는건 순차검색이다.
 */