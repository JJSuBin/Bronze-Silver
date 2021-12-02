import java.io.*;
import java.util.*;

public class BaekJoon_18856 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int[] arr=new int[n];
		
		arr[0]=1; // A2가 2로 고정되어 있기 때문에 첫 번째 수는 자동으로 1밖에 올 수 없음
		arr[1]=2; // A2는 반드시 2
		arr[n-1]=977; // 마지막 수는 반드시 소수여야 하기 때문에 1000보다 작은 가장 큰 소수로 고정한다.
		
		for(int i=1;i<n;i++)
			if(arr[i]==0)
				arr[i]=arr[i-1]+1; // 증가하는 수열이여야 하므로 1씩 더한 값으로 설정
		
		System.out.println(n);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}
