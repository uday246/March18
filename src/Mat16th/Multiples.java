package Mat16th;

public class Multiples {
	public static void main(String[] args) {
		for(int i=-100;i<100;i++){
			for(int j=-100;j<100;j++)
				for(int k=-100;k<100;k++)
				{
					int d=(35 * i) + (55 * j) + (77 * k);
					if(d==1){
						System.out.println(i+" "+j+" "+k+" = "+d);					
						//break;
					}
					}
				}
		}
		
		
		


	public static void writeVertical(int n) {
		if(n==0)
			return;
		writeVertical(n/10);
		System.out.println(n%10);
	}

	public static void multiples(int m, int n) {
		if (m == 0)
			return;
		multiples(m - 1, n);
		System.out.println(m * n);
	}
}
