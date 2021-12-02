import java.util.*;

public class BaekJoon_19155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] result=new int[n];
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			max=Math.max(max, arr[i]); // 입력 받은 수들 중 가장 큰 값 구하기
		}
		
		// 결과 배열 값 구하기
		for(int i=0;i<n;i++)
			result[i]=max-arr[i]+1;
		// 출력
		for(int i=0;i<n;i++)
			System.out.print(result[i]+" ");
	}

}
