import java.util.Scanner;

class Main {
    public int solution(String str, char t){
        int answer =0; 
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str= kb.next(); // 문자열 스캔
        char c = kb.next().charAt(0); // 문자 한개 스캔

        System.out.println(T.solution(str,c));
    }
}


