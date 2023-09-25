import java.util.*;

class RecursiveFunction {
    public void DFS(int n){
        if(n==0) {   
            return;
        }
        else{            
            DFS(n-1);
            System.out.print(n + " ");            
        }
    }
    public static void main(String[] args){
        RecursiveFunction T = new RecursiveFunction();
        T.DFS(3);
    }
}
/* 
 * 재귀함수 ? 자기자신의 함수를 호출하는 함수
 * static이라는 프레임을 사용한다
 * static은 제일 상단것이 먼저 동작한다! 이러한것을 백트래픽? 이라고한다 
 */