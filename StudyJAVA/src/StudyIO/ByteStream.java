package StudyIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public void practiceIO() {
		FileInputStream fis =null;
		FileOutputStream fos = null;
		//D����̺��� ii.txt������ �����´�.
		try {
			fis = new FileInputStream("D:\\ii.txt");
			//D����̺��� ii.text������ ������ ī���Ͽ� byte.txt�����������. 
			fos = new FileOutputStream("D:\\byte.txt");
			int readByte=-1;
			//1����Ʈ�� ����
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
