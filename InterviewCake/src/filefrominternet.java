import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class filefrominternet {
public static void getFileName() throws Exception{
	
	URL url =new URL("https://contribute.geeksforgeeks.org/wp-content/uploads/GATE.pdf");
	
	try {
		HttpURLConnection conn= (HttpURLConnection) url.openConnection();
		
		conn.getInputStream();
		
		int size = conn.getContentLength();
		
		System.out.println(size);
		
		conn.getInputStream().close();
		
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		getFileName();

	}

}
