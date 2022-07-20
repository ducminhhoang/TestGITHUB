import java.util.Scanner;

public class DucMinhHoang_Bai2_Buoi2 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap a: "); a = sc.nextInt();
		System.out.println("Nhap b: "); b = sc.nextInt();
		System.out.println("Nhap c: "); c = sc.nextInt();
		
		if (a==b && b==c)
			System.out.println("Day la tam giac deu");
		else if (a==b || b==c || a==c) {
			if (Math.sqrt(a*a*2) == c || Math.sqrt(b*b*2) == a || Math.sqrt(c*c*2)==b)
				System.out.println("Day la tam giac vuong can");
			System.out.println("Day la tam giac can");
		}
		else if (Math.sqrt(a*a + b*b) == c || Math.sqrt(b*b + c*c) == a || Math.sqrt(a*a + c*c) == b)
			System.out.println("Day la tam giac vuong");
		else if (a+c>b || c+b>a || a+b>c)
			System.out.println("Day khong la tam giac");
		else
			System.out.println("Day la tam giac vuong");
	}

}
