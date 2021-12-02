import java.util.Scanner;

public class BaekJoon_19944 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
				
		if(m<=2)
			System.out.println("NEWBIE!");
		else if(m<=n)
			System.out.println("OLDBIE!");
		else
			System.out.println("TLE!");
	}
}
