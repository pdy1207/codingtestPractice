import java.util.*;

class RockPaperScissors {
    public String solution(int n, int[] a, int[] b){
        String answer = "";
            for(int i=0; i<n; i++){
                if(a[i] == b[i]){
                    answer+="D";
                } 
                else if(a[i]==1 && b[i]==3) {
                    answer+="A";
                } else if (a[i]==2 && b[i]==1){
                    answer+="A";
                } else if (a[i]==3 && b[i]==2){
                    answer+="A";
                } else {
                    answer+="B";
                }
            }
        return answer;
    }

    public static void main(String[] args){
        RockPaperScissors T = new RockPaperScissors();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];                           // 가위바위보의 배열을 받는다 
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = kb.nextInt();
        } 
        for(int i=0; i<n; i++){
            b[i] = kb.nextInt();
        }
        for(char x : T.solution(n,a,b).toCharArray()) System.out.println(x);    
        // 줄바꿈을 위한 for each 문

    }
}