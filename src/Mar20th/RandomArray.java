package Mar20th;

public class RandomArray {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		boolean flag1=true;
		boolean flag2=true;

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				// generating random numbers
				arr[i][j] = (int)(Math.random()+0.5);

		}

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		// rows checking 
		for(int i=0;i<3;i++){
			flag1=true;
			flag2=true;
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]==0)
					flag1=false;
				if(arr[i][j]==1)
					flag2=false;
			}
			if(flag1)
				System.out.println("Row "+i+" has all 1's");
			if(flag2)
				System.out.println("Row "+i+" has all 0's");

		}
		// cols checking 
		for(int i=0;i<3;i++){
			flag1=true;
			flag2=true;

			for(int j=0;j<3;j++)
			{
				if(arr[j][i]==0)
					flag1=false;
				if(arr[j][i]==1)
					flag2=false;
			}
			if(flag1)
				System.out.println("col "+i+" has all 1's");
			if(flag2)
				System.out.println("col "+i+" has all 0's");

		}
		flag1=true;
		flag2=true;
// diagnols checking
		for(int i=0;i<3;i++){
			if(arr[i][i]==0)
				flag1=false;
			if(arr[i][i]==1)
				flag2=false;
		}
		if(flag1)
			System.out.println("Diagnols  has all 1's");
		if(flag2)
			System.out.println("Diagnols has all 0's");

	}
}
