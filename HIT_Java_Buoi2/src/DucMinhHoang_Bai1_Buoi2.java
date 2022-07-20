
import java.util.Scanner;

public class DucMinhHoang_Bai1_Buoi2 {
	public static void main(String[] args) {
		int day, month, year;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay: ");
			day = sc.nextInt();
			System.out.println("Nhap thang: ");
			month = sc.nextInt();
			System.out.println("Nhap nam: ");
			year = sc.nextInt();
		}while(day<1 || day>31 || month<1 || month>12);
		
		if ((month==1 && day>=20) || (month==2 && day<=18))
			System.out.println("Cung Bao Binh");
		else if ((month==2) || (month==3 && day<=20))
			System.out.println("Cung Song Ngu");
		else if ((month==3) || (month==4 && day<=20))
			System.out.println("Cung Bach Duong");
		else if ((month==4) || (month==5 && day<=20))
			System.out.println("Cung Kim Nguu");
		else if ((month==5) || (month==6 && day<=21))
			System.out.println("Cung Song Tu");
		else if ((month==6) || (month==7 && day<=22))
			System.out.println("Cung Cu Giai");
		else if((month==7) || (month==8 && day<=22))
			System.out.println("Cung Su Tu");
		else if (month==8 || (month==9 && day<=22))
			System.out.println("Cung Xu Nu");
		else if (month==9 || (month==10 && day<=23))
			System.out.println("Cung Thien Binh");
		else if (month==10 || (month==11 && day<=22))
			System.out.println("Cung Bo Cap");
		else if (month==11 || (month==12 && day<=21))
			System.out.println("Cung Nhan Ma");
		else
			System.out.println("Cung Ma Ket");
	}
	
}
