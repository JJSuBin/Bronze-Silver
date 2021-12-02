import java.util.*;

public class BaekJoon_19698 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); // 소들의 수
		int w=sc.nextInt(); // 열
		int h=sc.nextInt(); // 행
		int l=sc.nextInt(); // 소에게 배정되는 공간의 크기
		
		// 배정할 수 있는 헛간의 개수가 소의 수보다 클 수 있기 때문에 소의 마리수와 비교해 작은 수를 출력해야 한다.
		System.out.println(Math.min(n, (w/l)*(h/l)));
	}
}
