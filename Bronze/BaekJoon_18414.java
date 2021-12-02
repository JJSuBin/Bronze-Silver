import java.io.*;
import java.util.*;

public class BaekJoon_18414 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int x=Integer.parseInt(st.nextToken());
		int l=Integer.parseInt(st.nextToken());
		int r=Integer.parseInt(st.nextToken());
	
		if(x<=l) // x가 l보다 작거나 같을 때는 l이 x와의 차의 절대치가 가장 작은 것
			System.out.println(l);
		else if(x>l&&x<r) // x가 l과 r 사이일 때는 x가 x와의 차의 절대치가 가장 작은 것
			System.out.println(x);
		else // x가 r보다 크거나 같을 때는 r이 x와의 차의 절대치가 가장 작은 것
			System.out.println(r);
	}
}
