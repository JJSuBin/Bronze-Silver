import java.util.*;

public class BaekJoon_19602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt(); // 작은 음식의 개수
		int m=sc.nextInt(); // 중간 음식의 개수
		int l=sc.nextInt(); // 큰 음식의 개수
		
		int result=(1*s)+(2*m)+(l*3);
		
		System.out.println(result>=10?"happy":"sad");
	}

}
