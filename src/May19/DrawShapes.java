package May19;

import java.util.Scanner;

public class DrawShapes

{

	public static void main(String args[])

	{

		int n=0, c, k, space = 1, ch, i;

		System.out.print("Menu \n1. Traingle\n2. Diamond\n3. Trapezoid\n4. parallelogram\n5. pine tree\n");

		System.out.print("Select one from menu \n");

		Scanner in = new Scanner(System.in);

		ch = in.nextInt();

		System.out.print("Enter number of rows\n");
		n=in.nextInt();
		System.out.print(n);

		if (ch == 1)

		{

			space = n - 1;

			for (k = 1; k <= n; k++)

			{

				for (c = 1; c <= space; c++)

					System.out.print(" ");

				space--;

				for (c = 1; c <= 2 * k - 1; c++)

					System.out.print("*");

				System.out.print("\n");

			}

		}

		else if (ch == 2)

		{

			space = n - 1;

			for (k = 1; k <= n; k++)

			{

				for (c = 1; c <= space; c++)

					System.out.print(" ");

				space--;

				for (c = 1; c <= 2 * k - 1; c++)

					System.out.print("*");

				System.out.print("\n");

			}

			space = 1;

			for (k = 1; k <= n - 1; k++)

			{

				for (c = 1; c <= space; c++)

					System.out.print(" ");

				space++;

				for (c = 1; c <= 2 * (n - k) - 1; c++)

					System.out.print("*");

				System.out.print("\n");

			}

		}

		else if (ch == 3)

		{

			space = n - 1;

			i = 0;

			for (k = 1; k <= n; k++)

			{

				for (c = 1; c <= space; c++)

					System.out.print(" ");

				space--;

				for (c = 1; c <= (n + (2 * i)); c++)

					System.out.print("*");

				i++;

				System.out.print("\n");

			}

		}

		else if (ch == 4)

		{

			space = n - 1;

			for (k = 1; k <= n; k++)

			{

				for (c = 1; c <= space; c++)

					System.out.print(" ");

				space--;

				for (c = 1; c <= n; c++)

					System.out.print("*");

				System.out.print("\n");

			}

		}

		else if (ch == 5)

		{

			i = 1;

			while (i <= n)

			{

				space = n - 1;

				for (k = 1; k <= i; k++)

				{

					for (c = 1; c <= space; c++)

						System.out.print(" ");

					space--;

					for (c = 1; c <= 2 * k - 1; c++)

						System.out.print("*");

					System.out.print("\n");

				}

				i++;

			}

		}

		else

		{

			System.out.print("Wrong option selected");

		}

	}
}