import java.util.Scanner;

public class java3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		if(n<=0) {
			System.out.println("Á¾·á");
		}
		else {
			int result=getCount(n);
			System.out.println(result);
		}
		sc.close();
	}
	
	public static int getCount(int n) {
		int total=0;
		int num=2;
		
		while(num<=n) {
			for(int i=2; i<=num; i++) {
				if(num%i==0&&i!=num) {
					break;
				}
				if(num%i==0&&i==num) {
					total++;
				}
			}
			num++;
		}
		return total;	
	}
}