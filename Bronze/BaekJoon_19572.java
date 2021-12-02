import java.util.*;

public class BaekJoon_19572 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		double[] d=new double[3];
		for(int i=0;i<3;i++)
			d[i]=sc.nextDouble();
		
		// 3차 연립 방정식 풀기
		double a=0,b=0,c=0;
		a=(d[0]+d[1]-d[2])/2;
		b=d[0]-a;
		c=d[1]-a;
		
		// 소숫점 첫째 자리까지 반올림
		a=Double.parseDouble(String.format("%.1f",a));
		b=Double.parseDouble(String.format("%.1f",b));
		c=Double.parseDouble(String.format("%.1f",c));
		
		// a,b,c 모두 양의 실수여야 함
		if(a>0&&b>0&&c>0) {
			System.out.println(1);
			System.out.println(a+" "+b+" "+c);
		}
		else
			System.out.println(-1);
	}

}
