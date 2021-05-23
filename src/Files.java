import java.io.FileInputStream;
import java.io.IOException;
public class Files {
public static void main(String arg[]) {
	FileInputStream stream = null;
	try {
		stream = new FileInputStream("C:\\Users\\jr\\eclipse-workspace\\Project1\\src\\Hello2.txt");
		//this may throw FileNotFoundException
		//so Surround this by try catch block
		int data;
       //String  fileData;
       while((data = stream.read()) != -1) 
       {
    	   
		System.out.print((char)data);
       }
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		if(stream != null) {
			try {
				stream.close();
			}catch(IOException e ) {e.printStackTrace();}
		}
	}	
}

}
