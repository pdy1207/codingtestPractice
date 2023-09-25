import java.util.*;

class BinaryOutput {
    public void DFS(int n){
        if(n == 0) {
            return ;
        } else {
            DFS(n/2);
            System.out.print( n%2 + " ");
        }

    }
    public static void main(String[] args){
        BinaryOutput T = new BinaryOutput();
        T.DFS(11);
    }
}
/* 
 * 호출을 밑에서하면 거꾸로 출력이 된다 
 * 왜? 
 */