import java.util.*;

public class BaekJoon_18398 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int num=sc.nextInt();
			
			while(num-->0) {
				int a=sc.nextInt();
				int b=sc.nextInt();
				
				System.out.println(a+b+" "+a*b);
			}
		}
	}

}
