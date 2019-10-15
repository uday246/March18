package mat25;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoresSort {
	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<String>();
		ArrayList<Integer>scores=new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("Enter the name for score "+(i+1));
			names.add(sc.nextLine());
			System.out.println("Enter the score for score "+(i+1));
			scores.add(sc.nextInt());
			sc.nextLine();
		}
		sort(names,scores);
		display(names,scores);
	}

	private static void display(ArrayList<String> aNames, ArrayList<Integer> aScores) {
		for(int i=0;i<aNames.size();i++)
			System.out.println(aNames.get(i)+" : "+aScores.get(i));
	}

	private static void sort(ArrayList<String> names, ArrayList<Integer> scores) {
		Object[] arr1=scores.toArray();
		Object[] arr2=names.toArray();
		for(int j=0;j<arr1.length;j++){

			for(int i=j+1;i<arr1.length;i++){
				int a=(Integer)arr1[i];
				int b=(Integer)arr1[j];
				if(a>b){

					int t = scores.get(j);
					arr1[j]=arr1[i];
					arr1[i]=t;
					
					String t1 = (String) arr2[j];
					arr2[j]=arr2[i];
					arr2[i]=t1;
					
				}
			}
		}
		names.clear();
		scores.clear();
		for(int i=0;i<arr1.length;i++){
			names.add((String)arr2[i]);
			scores.add((Integer)arr1[i]);
		}
		
	}
}