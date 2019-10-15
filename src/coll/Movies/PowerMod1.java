package coll.Movies;

public class PowerMod1 {
public static void main(String[] args) {
	/*Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		long res[] = new long[count];
		long a=0,b=0,n=0;
		for(int i=0;i<count;i++){
			a = sc.nextLong();
			b = sc.nextLong();
			n = sc.nextLong();
			res[i] = pow(b,a) % n;
		}
		for(int i=0;i<count;i++)
			System.out.println(res[i]);*/
		System.out.println(pow(3029382 ,2374859 )%36123);
}
static long pow(long base, long exp)
{
    if (exp == 0)
        return 1;
    else if (exp % 2 == 0)
        return pow(base, exp / 2) * pow(base, exp / 2);
    else
        return base * pow(base, exp / 2) * pow(base, exp / 2);
}
}
