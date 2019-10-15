import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DollorProgram {

	public static void main(String[] args) {

		BufferedReader br = null;
		String input="";
        try {

            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter an amount");
            input = br.readLine();
        }
        catch(Exception e){
        	System.out.println(e);
        }
        
		String dollors = input.substring(1,input.indexOf("."));
		
		String cents  = input.substring(input.indexOf(".")+1);

		System.out.println("There are "+dollors+" dollors and "+cents+" cents.");
		
	}

}
