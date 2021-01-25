package StudyIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public void practiceIO() {
		FileInputStream fis =null;
		FileOutputStream fos = null;
		//D드라이브의 ii.txt파일을 가져온다.
		try {
			fis = new FileInputStream("D:\\ii.txt");
			//D드라이브의 ii.text파일의 내용을 카피하여 byte.txt파일을만든다. 
			fos = new FileOutputStream("D:\\byte.txt");
			int readByte=-1;
			//1바이트씩 복제
			while ((readByte=fis.read())!=-1) {
				fos.write(readByte);
			}
		}catch(Exception e) {
			
		}finally {
			try { 
				fis.close();
				fos.close();
			}catch (IOException e) {
				
			}
		}
	}
	public static void main(String[] args) {
		ByteStream io = new ByteStream();
		io.practiceIO();
	}
}
