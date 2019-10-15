import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadTextFromURL {
	
	public static void main(String[] args) {
		
		try {
			
			URL url = new URL("http://www.google.com:80/");
			
			// read text returned by server
		    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		    
		    String line;
		    while ((line = in.readLine()) != null) {
		    	String temp[]= line.split(",;.:? ()");
		    	for(String str:temp)
		    	System.out.println(str+" ");
		    }
		    in.close();
		    
		}
		catch (MalformedURLException e) {
			System.out.println("Malformed URL: " + e.getMessage());
		}
		catch (IOException e) {
			System.out.println("I/O Error: " + e.getMessage());
		}
		
	}

}