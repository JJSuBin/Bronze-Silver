import java.io.*;
import java.util.*;

public class BaekJoon_18883 {

	public static void main(String[] args) throws IOException{
		// 시간초과가 나지 않기 위해 Scanner와 sysout 사용X
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		// 시간초과로 인해 2중 for문 사용X -> 단일 for문으로 해결
		for(int i=1;i<=n*m;i++) {
			if(i%m!=0)
				bw.write(i+" ");
			else
				bw.write(i+"\n");
		}
		
		bw.close();
	}

}
