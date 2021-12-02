import java.io.*;
import java.util.*;

public class BaekJoon_18411 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int[] arr=new int[3];
		for(int i=0;i<3;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		
		// 3번의 시험 점수를 입력 받고 정렬 후 가장 큰 두 수의 합 출력
		Arrays.sort(arr);
		System.out.println(arr[2]+arr[1]);
	}

}
