package StudyIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	//콘솔에서  입력
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//try 안에 들어가면 외부에서 사용불가하기때문에 선언과 예외처리부분 분리
		String line =null;
		try {
			
			line =br.readLine();
			
		}catch(IOException e) {
			
		}
		System.out.println(line);
		
	}
}
