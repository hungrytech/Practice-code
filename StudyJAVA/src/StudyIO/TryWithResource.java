package StudyIO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class TryWithResource {
	public static void main(String[] args) {
		try(
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
				){
			out.write(100);
			out.writeBoolean(true);
			out.writeDouble(50.5);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
