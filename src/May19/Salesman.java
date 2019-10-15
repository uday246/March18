package May19;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Salesman {
	private int nodes;
	private Stack<Integer> stack;

	public Salesman() {
		stack = new Stack<Integer>();
	}

	public void travel(int M[][]) {
		nodes = M[1].length - 1;
		int[] visited = new int[nodes + 1];
		visited[1] = 1;
		stack.push(1);
		int ele, dst = 0, i;
		int min = Integer.MAX_VALUE;
		boolean flag = false;
		System.out.print(1 + "\t");

		while (!stack.isEmpty()) {
			ele = stack.peek();
			i = 1;
			min = Integer.MAX_VALUE;
			while (i <= nodes) {
				if (M[ele][i] > 1 && visited[i] == 0) {
					if (min > M[ele][i]) {
						min = M[ele][i];
						dst = i;
						flag = true;
					}
				}
				i++;
			}
			if (flag) {
				visited[dst] = 1;
				stack.push(dst);
				System.out.print(dst + "\t");
				flag = false;
				continue;
			}
			stack.pop();
		}
	}

	public static void main(String args[]) {
		int n_of_nodes;
		Scanner sc = null;
		try {
			System.out.println("Enter the total number of cities to travel by salesman\n");
			sc = new Scanner(System.in);
			n_of_nodes = sc.nextInt();
			int M[][] = new int[n_of_nodes + 1][n_of_nodes + 1];
			System.out.println("Enter the adjacency matrix representation of the cities ");
			for (int i = 1; i <= n_of_nodes; i++) {
				for (int j = 1; j <= n_of_nodes; j++) {
					M[i][j] = sc.nextInt();
				}
			}
			for (int i = 1; i <= n_of_nodes; i++) {
				for (int j = 1; j <= n_of_nodes; j++) {
					if (M[i][j] == 1 && M[j][i] == 0) {
						M[j][i] = 1;
					}
				}
			}
			System.out.println("the citys are visited as follows");
			Salesman obj = new Salesman();
			obj.travel(M);
		} catch (InputMismatchException inputMismatch) {
			System.out.println("Sorry You have entered wrong input format...Try Again !");
		}
		sc.close();
	}
}