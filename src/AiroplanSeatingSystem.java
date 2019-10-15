import java.util.Scanner;

public class AiroplanSeatingSystem {
	public static void main(String[] args) {
		char c[][] = { { '*', '*', '*', '*', '*', '*' }, { '*', '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*', '*' }, { '*', '*', '*', '*', '*', '*' }, { '*', '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*', '*' }, { '*', '*', '*', '*', '*', '*' }, { '*', '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*', '*' }, { '*', '*', '*', '*', '*', '*' }, { '*', '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*', '*' }, { '*', '*', '*', '*', '*', '*' } };
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter Ticket type 1=first class 2= business class, 3 = economy class");
			int type = sc.nextInt();
			int row = 0;
			int col = 0;
			if (type == 1) {
				System.out.println("Please enter row no (1 or 2)");
				row = sc.nextInt();
				System.out.println("Please enter col no (1 to 6)");
				col = sc.nextInt();
			}
			if (type == 2) {
				System.out.println("Please enter row no (3 to 7)");
				row = sc.nextInt();
				System.out.println("Please enter col no (1 to 6)");
				col = sc.nextInt();
			}
			if (type == 3) {
				System.out.println("Please enter row no (8 to 13)");
				row = sc.nextInt();
				System.out.println("Please enter col no (1 to 6)");
				col = sc.nextInt();
			}
			if(row<14 && col<7 && row>0 && col>0){
				if(c[row - 1][col - 1] =='X'){
					System.out.println("Seat is already booked");
				}
				else
					c[row - 1][col - 1] = 'X';
			}
			else{
				System.out.println("Invalid seat no");
			}
			for(int i=0;i<13;i++)
			{
				for(int j=0;j<6;j++)
					System.out.print(c[i][j]+" ");
				System.out.println();
			}
			
		}
	}
}
