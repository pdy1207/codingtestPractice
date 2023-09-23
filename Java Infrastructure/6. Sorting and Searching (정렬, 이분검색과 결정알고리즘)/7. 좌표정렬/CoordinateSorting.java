import java.util.*;
class Point implements Comparable<Point>{
	public int x, y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Point o){
		if(this.x==o.x) return this.y-o.y;
        // 오름차순이냐 내림차순이냐 음수값이 return 되게 끔 구현
		else return this.x-o.x;
	}
}
// 좌표가 들어온다 하면은 이러한 클래스 위주!

class Main {	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		ArrayList<Point> arr=new ArrayList<>();
		for(int i=0; i<n; i++){
			int x=kb.nextInt();
			int y=kb.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);
		for(Point o : arr) System.out.println(o.x+" "+o.y);
	}
}
