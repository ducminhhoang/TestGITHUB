import java.util.Scanner;

public class DucMinhHoang_Bai3_Buoi2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap n: ");
		int n = sc.nextInt(), sum = 1;
		if (n<1)
			System.out.println("Du lieu sai");
		for (int i=2; i<=n; i++) {
			if (n%i == 0)
				sum += i;
		}
		
		System.out.println("Tong cac uoc cua " + n + " la: " + sum);
	}
}
