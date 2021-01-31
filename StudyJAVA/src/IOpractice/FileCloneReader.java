package IOpractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FileCloneReader {

	public FileCloneReader() {
		
	}
	
	//BufferReader, Writer �̿�
	public void cloneSequence() { 
		BufferedReader br = null;
		BufferedWriter bw = null;
		Scanner scan = new Scanner(System.in);
		char[] arr = new char[100];
		try {
			System.out.println("Ŭ���� ������ �ּҿ� �̸��� �Է����ּ���.");
			String fileName = scan.next();
			System.out.println("������ ���� �ּҿ� �̸��� �Է����ּ���.");
			String outName = scan.next();
			br = new BufferedReader(new FileReader(fileName));
			bw = new BufferedWriter(new FileWriter(outName));
			int line =0;
			while ((line=br.read(arr))!=-1) {
				bw.write(arr, 0, line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			scan.close();
			try {
				if(br==null) br.close();
				if(bw==null) bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}//finally �� ���
	}//�޼��� �� ���
	
	// try-with-resources �̿�
	public void cloneSequenceResources() {
		Scanner scan = new Scanner(System.in);
		char[] arr = new char[100];
		System.out.println("Ŭ���� ������ �ּҿ� �̸��� �Է����ּ���.");
		String fileName = scan.next();
		System.out.println("������ ���� �ּҿ� �̸��� �Է����ּ���.");
		String outName = scan.next();
		scan.close();
		try(BufferedReader br = new BufferedReader(new FileReader(fileName)); 
				BufferedWriter bw = new BufferedWriter(new FileWriter(outName))) {
			int line =0;
			while ((line=br.read(arr))!=-1) {
				bw.write(arr, 0, line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}//�޼��� ��
	
}
