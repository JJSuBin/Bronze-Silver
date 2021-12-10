import java.util.*;

public class BaekJoon_18408 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int one=0;
		int two=0;
		
		for(int i=0;i<3;i++) {
			int num=sc.nextInt();
			
			if(num==1) // 1의 개수 count
				one++;
			else       // 2의 개수 count
				two++;
		}
		// 더 많이 나온 수 출력
		System.out.println(one>two?1:2);
	}

}
