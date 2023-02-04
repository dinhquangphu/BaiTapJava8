import java.util.Scanner;
public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true)
		{
			//MENU
			System.out.print("\n---------------MENU--------------|");
			System.out.print("\n------[1] Phuong trinh bac 2-----|");
			System.out.print("\n------[2] Tinh giai thua---------|");
			System.out.print("\n------[3] So FIBONACI------------|");
			System.out.print("\n------[4] Tim UCLN & BCNN--------|");
			System.out.print("\n------[5] Tim So nguyen to-------|");
			System.out.print("\n------[6] Tim n SNT dau tien ----|");
			System.out.print("\n------[7] Tim SNT co 5 chu so ---|");
			System.out.print("\n------[8] Tong cac chu so -------|");
			System.out.print("\n------[9] Tim so kha nghich -----|");
			System.out.print("\n------[10] Tim so Fibo la SNT----|");
			System.out.print("\n---------------------------------|");
			System.out.print("\nNhap so cau can xu ly : ");
			int tam = input.nextInt();
			switch(tam) {
			case 1:
				System.out.print("\nNhap a = ");
				float a = input.nextFloat();
				System.out.print("Nhap b = ");
				float b = input.nextFloat();
				System.out.print("Nhap c = ");
				float c = input.nextFloat();
				method.PTB2(a,b,c);
				break;
			case 2:
				System.out.print("Nhap n = ");
				int n = input.nextInt();
				long d = method.DQGT(n);
				System.out.print(n + "! = " + d);
				break;
			case 3:
				System.out.print("\nNhap m = ");
				int m = input.nextInt();
				System.out.print("\nDay Fibo : ");
				for (int i = 0 ; i < m ; i++)
				{
					System.out.print( method.Fibo(i) + " ");
				}
				break;
			case 4:
				System.out.print("\nNhap x = ");
				int x = input.nextInt();
				System.out.print("\nNhap y = ");
				int y = input.nextInt();
				System.out.print("UCLN = " + method.UCLN(x, y));
				System.out.print("\nBCNN = " + method.BCNN(x, y));
				break;
			case 5:
				System.out.print("\nNhap v = ");
				int v = input.nextInt();
				System.out.print("SNT < " + v + " la : ");
				for(int i = 0 ; i < v ; i++)
				{
					if(method.SNT(i))
						System.out.print(i + " ");
				}
				break;
			case 6:
				System.out.print("\nNhap k = ");
				int k = input.nextInt();
			    int count = 0;
			    int temp = 1;
			    while (count < k) {
		    		if(method.SNT(temp))
		    		{
		    			count = count + 1;
		    			System.out.print(temp + " ");
		    		}
		    		temp++;
		    	}
			    break;
			case 7:
			    for(int i = 10001 ; i < 99999 ; i+=2)
			    {
			    	if(method.SNT(i))
			    		System.out.print(i + " ");
				    }
			    break;
			case 8:
				System.out.print("\nNhap so can tinh : ");
			    int o = input.nextInt();
			    System.out.print("Tong cua so " + o + " la : " + method.SUM(o));
				break;
			case 9:
				System.out.print("\n");
			    for(int i = 100000 ; i < 1000000 ; i++ )
			    {
			    	if(method.KN(i))
			    		System.out.print(i + " ");
			    }
			    break;
			case 10:
				System.out.print("\nNhap z = ");
				int z = input.nextInt();
				System.out.print("So Fi la SNT : ");
				for(int i = 1 ; i < z ; i++)
				{
					if(method.KT_Fibo(i))
						if(method.SNT(i))
							System.out.print(i + " ");
				}
			}
		}
	}
}