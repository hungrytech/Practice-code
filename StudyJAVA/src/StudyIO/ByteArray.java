package StudyIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArray {
	public void practiceIO() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("D\\ii.txt");
			byte[] buffer = new byte[512];
			fos = new FileOutputStream("D\\byte.txt");
			int readCount = -1;
			// ���ۿ뷮�� ������ ������ �ֱ⿡ trim()�� ���ְų�, �ε����� �����ؾ� �Ѵ�. 
			while ((readCount=fis.read(buffer))!=-1) {
				fos.write(buffer, 0, readCount);
			}
		}catch(Exception e) {
			
		}finally {
			try {
				fis.close();
				fos.close();
			}catch(IOException e) {
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		
	}
}
