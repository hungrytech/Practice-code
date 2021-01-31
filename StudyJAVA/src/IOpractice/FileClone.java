package IOpractice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileClone {

	public FileClone() {
		
	}
	
	/* 파일 스트림만 이용
	 *  바이트 기반 클론 시퀀스
	 */ 
	public void cloneSequence() {
		FileInputStream fis=null;
		FileOutputStream fos =null;
		Scanner scan = new Scanner(System.in);
		byte[] arr = new byte[512];
		
		System.out.println("클론할 파일 위치, 이름을 적어주세요");
		String fileName = scan.next();
		System.out.println("저장할 파일 위치, 이름을 적어주세요");
		String outFileName = scan.next();
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream(outFileName);
			int line = 0;
			while ((line = fis.read(arr))!=-1) {
				fos.write(arr, 0, line);
			}
		// 다중 catch문 연습을 위해 써봣다.
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			scan.close();
			try {
				if(fis ==null) fis.close();
				if(fos==null) fos.close();
			}catch(IOException e) {
				
			}
		}//finally 끝 블럭
		
	}// 메서드 끝 블럭
	
	
	//try-with-resources 이용
	public void cloneSequenceResource() {
		Scanner scan = new Scanner(System.in);
		byte[] arr = new byte[512];
		System.out.println("클론할 파일 위치, 이름을 적어주세요");
		String fileName = scan.next();
		System.out.println("저장할 파일 위치, 이름을 적어주세요");
		String outFileName = scan.next();
		scan.close();
		try ( FileInputStream fis = new FileInputStream(fileName);
				FileOutputStream fos = new FileOutputStream(outFileName)) {
			int line = 0;
			while ((line = fis.read(arr))!=-1) {
				fos.write(arr, 0, line);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/* Buffer 보조스트림 이용해서 성능향상
	 * try-with-resources 이용
	 */
	public void cloneSequenceBuffer() {
		Scanner scan = new Scanner(System.in);
		System.out.println("클론할 파일 위치, 이름을 적어주세요");
		String fileName = scan.next();
		System.out.println("저장할 파일 위치, 이름을 적어주세요");
		String outFileName = scan.next();
		scan.close();
		byte[] arr = new byte[512];
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outFileName))) {
			int line = 0;
			while((line = bis.read(arr))!=-1) {
				bos.write(arr, 0, line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}// class 끝
