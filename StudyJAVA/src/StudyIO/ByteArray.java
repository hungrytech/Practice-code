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
			// 버퍼용량을 넘으면 공백이 있기에 trim()을 해주거나, 인덱스를 제한해야 한다. 
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
