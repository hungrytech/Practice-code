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
	
	//BufferReader, Writer 이용
	public void cloneSequence() { 
		BufferedReader br = null;
		BufferedWriter bw = null;
		Scanner scan = new Scanner(System.in);
		char[] arr = new char[100];
		try {
			System.out.println("클론할 파일의 주소와 이름을 입력해주세요.");
			String fileName = scan.next();
			System.out.println("저장할 파일 주소와 이름을 입력해주세요.");
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
		}//finally 끝 블록
	}//메서드 끝 블록
	
	// try-with-resources 이용
	public void cloneSequenceResources() {
		Scanner scan = new Scanner(System.in);
		char[] arr = new char[100];
		System.out.println("클론할 파일의 주소와 이름을 입력해주세요.");
		String fileName = scan.next();
		System.out.println("저장할 파일 주소와 이름을 입력해주세요.");
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
	}//메서드 끝
	
}
