package StudyIO;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class ConsoleToFile {
	public void conToFa3() throws Exception {
		String imsi=null;
		BufferedReader br = null;
		FileOutputStream fos=null;
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("FileName");
		//저장할 파일이름을 콘솔에 쓰게끔 만들어준다
		fos= new FileOutputStream(br.readLine().trim());
		System.out.println("Contents:");
		// 저장팔 파일에 쓸 내용을 콘솔에 입력
		while(!(imsi=br.readLine().trim()).equals("quit")) {
			fos.write(imsi.getBytes());
			fos.write("\r\n".getBytes());
			
		}
		fos.close();
	}
	public static void main(String[] args) {
		ConsoleToFile con = new ConsoleToFile();
		try {
			con.conToFa3();
		}catch(Exception e) {
			
		}
	}
}
