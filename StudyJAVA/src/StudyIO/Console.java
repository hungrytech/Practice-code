package StudyIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	//�ֿܼ���  �Է�
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//try �ȿ� ���� �ܺο��� ���Ұ��ϱ⶧���� ����� ����ó���κ� �и�
		String line =null;
		try {
			
			line =br.readLine();
			
		}catch(IOException e) {
			
		}
		System.out.println(line);
		
	}
}
