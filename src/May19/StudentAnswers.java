package May19;

public class StudentAnswers {
public static void main(String[] args) {
	int arr[][]={
			{'A','B','A','C','C','D','E','E','A','D'},
			{'D','B','A','B','C','A','E','E','A','D'},
			{'E','D','D','A','C','B','E','E','A','D'},
			{'C','B','A','E','D','C','E','E','A','D'},
			{'A','B','D','C','C','D','E','E','A','D'},
			{'B','B','E','C','C','D','E','E','A','D'},
			{'B','B','A','C','C','D','E','E','A','D'},
			{'E','B','E','C','C','D','E','E','A','D'},
	};
	char ans[]={'D','B','D','C','C','D','A','E','A','D'};
	int count=0;
	for(int i=0;i<arr.length;i++){
		count=0;
		for(int j=0;j<arr[i].length;j++){
			if(arr[i][j]==ans[j])
				count++;
		}
		System.out.println("Students "+i+"'s correct count is "+count); 
	}
}
}
